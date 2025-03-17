package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject exe 파일 복사
 * @content 문자 스트림 X
 			바이트 스트림 O (파일)
 			FileInputStream/FileOutputStream
 			BufferedInputStream/BufferedOutputStream 보조스트림
 */
public class Ex02 {

	public static void main(String[] args) {
		String fileName = "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\카카오톡.lnk";
		String copyFileName = ".\\src\\days25\\CopyKakaoTalk.lnk";
		
		fileCopy_textStream(fileName, copyFileName);
		
		System.out.println("end");
		
	} // main

	private static void fileCopy_textStream(String source, String target) {
		long start = System.nanoTime();
		
		int code;
		try (FileReader reader = new FileReader(source);
			 FileWriter writer = new FileWriter(target)) {
			
			while ((code = reader.read()) != -1) {
				System.out.print((char) code); // 화면 출력
				writer.write(code); // 파일 저장 메서드 -> 스트림에 쓰기 작업이 일어남
			} // while
			writer.flush(); // **flush 메서드: 스트림에 작성된 내용 모두가 최종적으로 파일에 저장됨
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		
		System.out.printf("> 처리 시간 : %d ns\n", (end - start));
		
	}
	
} // class
