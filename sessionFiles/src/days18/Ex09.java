package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author kenik
 * @date 2025. 2. 26. - 오후 3:31:21
 * @subject 자동 자원 반환 - try ~ with ~ resources 문 설명
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// "days17.16일차복습_홍길동.txt" 텍스트파일을 읽어와서 출력
		// *** FileReader 파일 읽기 클래스
		// FileWriter 파일 쓰기 클래스
		String fileName = "C:\\E\\Class\\SS23Class\\JavaClass\\javaPro\\src\\days17\\16일차복습_홍길동.txt";
		FileReader reader = null;
		int one ;
		try {
			// 4:05 수업 시작~
			reader = new FileReader(fileName);
			//one = reader.read();
			//System.out.println(one);
			while ( ( one = reader.read() ) != -1 ) {
				System.out.printf("%c", (char)one);
			} // while
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch( Exception e) {
			System.out.println( e.toString() );
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

		System.out.println("end");
	} // main

} // class






  