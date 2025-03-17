package days26;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.util.FileUtil;

/**
 * @author 김예지
 * @date 2025. 3. 11.
 * @subject
 * @content 1. 시간표.pdf 파일을 여러개의 파일로 분할 2. 분할된 파일을 합쳐서 시간표.pdf 생성
 */
public class Ex04 {

	public static void main(String[] args) {
		String parent = ".\\src\\days26";
		String child = "시간표.pdf";

		File f = new File(parent, child);
		System.out.println("> 파일 크기 : " + f.length() + "(bytes)");
		// > 파일 크기 : 463409(bytes)

		// 50KB = 1024 * 50 byte
		// 50KB씩 파일을 나누기
		final int VOLUME = 1024 * 50; // 50KB

		// 시간표.pdf 파일 -> 시간표_1.pdf, 시간표_2.pdf... 또는 시간표(1).pdf, 시간표(2).pdf...
		// 확장자가 제거된 파일명을 얻어야 함 (분리)
		// 파일명 = 순수파일명 + 확장자
		String baseName = FileUtil.getBaseName(child);
		String ext = FileUtil.getExtension(child);

		// 바이트 스트림
		FileOutputStream fos;
		BufferedOutputStream bos = null;
		int code = -1;
		int i = 0; // 카운팅할 변수
		int index = 0; // 시간표-1/2/3/4.pdf
		try (FileInputStream fis = new FileInputStream(f);
			 BufferedInputStream bis = new BufferedInputStream(fis)) {
			while ((code = bis.read()) != -1) {
				if (i % VOLUME == 0) {
					if (i != 0) bos.close(); // 저장
					// 새로운 출력 스트림 객체 생성
					child = String.format("%s-%d%s", baseName, ++index, ext);
					File temp = new File(parent, child);
					fos = new FileOutputStream(temp);
					bos = new BufferedOutputStream(fos);
				} // if

				bos.write(code);
				i++;
			} // while

		} catch (Exception e) {
		} // try

	} // main

} // class
