package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject
 * @content
 */
public class Ex01_03 {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days24\\Ex01.java"; // 복사할 원본 파일명, 경로
		String copyFileName = ".\\src\\days24\\CopyEx01.java"; // 복사본 파일명, 경로
		
		// 파일 복사 메서드
		fileCopy_textStream(fileName, copyFileName);
		// > 처리 시간 : 1089900 ns
		
		
		System.out.println("end");
		
	} // main

	private static void fileCopy_textStream(String source, String target) {
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;
		
		try (FileReader reader = new FileReader(source);
			 FileWriter writer = new FileWriter(target);
			 BufferedReader br = new BufferedReader(reader, BUFFER_SIZE); // BUFFER_SIZE 만큼 읽고 작업하겠다는 의미
			 BufferedWriter bw = new BufferedWriter(writer, BUFFER_SIZE)) {  // 보조 스트링 객체 buffered
			
			// line 단위가 아닌 버퍼 크기 단위로 읽어옴
			// char[]
			char[] cbuf = new char[BUFFER_SIZE];
			int n = -1; // 실제로 읽어온 개수를 나타냄
			while ((n = br.read(cbuf)) != -1) {
				// 			ㄴ 기능: 읽어오기, 매개변수: 읽어와서 저장할 기억공간, 리턴값: 실제 읽어온 문자 수
				bw.write(cbuf, 0, n);
			} // while
			bw.flush();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		
		System.out.printf("> 처리 시간 : %d ns\n", (end - start));
		
	}
	
} // class
