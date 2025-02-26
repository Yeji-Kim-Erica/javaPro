package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject 자동 자원 반환 try ~ with ~ resources 문 설명
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// 파일 경로에는 상대경로와 절대경로가 있음
		
		// "days17.16일차복습_김예지.txt" 텍스트파일을 읽어와서 출력
		// FileReader 파일 읽기 작업에 사용되는 클래스
		// FileWriter 파일 쓰기 작업에 사용되는 클래스
		
		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days17\\16일차복습_김예지.txt";
		FileReader reader = null;
		int one;
		try {
			reader = new FileReader(fileName); // 생성자에 예외처리가 되어있음
			// one = reader.read();
			// System.out.println(one);
			while ((one = reader.read()) != -1) {
				System.out.printf("%c", (char)one);
			} // while
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
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
