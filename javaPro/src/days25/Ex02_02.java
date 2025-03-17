package days25;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
public class Ex02_02 {

	public static void main(String[] args) {
		String fileName = "C:\\Program Files (x86)\\Kakao\\KakaoTalk\\KakaoTalk.exe";
		String copyFileName = ".\\src\\days25\\CopyKakaoTalk.exe";
		
		fileCopy_textStream(fileName, copyFileName);
		
		System.out.println("end");
		
	} // main

	private static void fileCopy_textStream(String source, String target) {
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;
		
		try (FileInputStream reader = new FileInputStream(source);
			 FileOutputStream writer = new FileOutputStream(target);
			 BufferedInputStream bis = new BufferedInputStream(reader, BUFFER_SIZE); // BUFFER_SIZE 만큼 읽고 작업하겠다는 의미
			 BufferedOutputStream bos = new BufferedOutputStream(writer, BUFFER_SIZE)) {  // 보조 스트링 객체 buffered
			
			byte[] b = new byte[BUFFER_SIZE];
			
			int n = -1;
			while ((n = bis.read(b)) != -1) {
				bos.write(b, 0, n);
			} // while
			bos.flush();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		
		System.out.printf("> 처리 시간 : %d ns\n", (end - start));
		
	}
	
} // class
