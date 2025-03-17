package days26;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author kenik
 * @date 2025. 3. 11. - 오전 11:09:24
 * @subject 1. 시간표.pdf 파일을 여러개의 파일로 분할
 * @content 2. 분할된 파일을 합쳐서 시간표.pdf 생성
 */
public class Ex04_01 {

	public static void main(String[] args) {
		String parent = ".\\src\\days26";
		String child = "시간표.pdf";

		File f = new File(parent, child);
		// > 파일 크기 : 463409(bytes)
		System.out.println( "> 파일 크기 : " + f.length() + "(bytes)");
		// 50KB = 1024 * 50 byte
		final int VOLUME = 1024 * 50;  // 50KB
		// [ 시간표.pdf ]
		// 시간표_1.pdf    50KB
		// 시간표_2.pdf
		// 시간표(3).pdf
		// 시간표(4).pdf
		// :
		// 파일명 =   순수파일명   /   확장자  분리
		String baseName = child.split("\\.")[0];
		String ext = "." + child.split("\\.")[1];
//		System.out.println(baseName);
//		System.out.println(ext);
		
		// 바이트 스트림
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		int code = 0;
		int index = 0;  // 시간표-1/2/3/4.pdf
		try (FileInputStream fis = new FileInputStream(f);
			 BufferedInputStream bis = new BufferedInputStream(fis, VOLUME)	){
			byte[] b = new byte[VOLUME];
			while( (code = bis.read(b) ) != -1 ) {
				if( index++ != 0) bos.close(); // 저장
				child = String.format("%s-%d%s", baseName, index, ext);
				File temp = new File(parent, child);
				fos = new FileOutputStream(temp);
				bos = new BufferedOutputStream(fos, VOLUME);
				
				bos.write(b,0,code);
			} // while  
			
		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
		System.out.println( " end ");
		
	} // main

} // class

		








  