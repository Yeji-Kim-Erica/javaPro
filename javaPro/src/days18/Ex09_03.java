package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject 자동 자원 반환 try ~ with ~ resources 문 설명
 * @content 각 라인 번호를 붙여보기
 */
public class Ex09_03 {

	public static void main(String[] args) {
		
		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days17\\16일차복습_김예지.txt";
		int one;
		int lineNumber = 1;
		try (FileReader reader = new FileReader(fileName);) {
			System.out.printf("[%d]: ", lineNumber++);
			while ((one = reader.read()) != -1) {
				System.out.printf("%c", (char)one);
				// (char) one == '\n'
				if (one==10) { // 13('\r'), 10('\n') 개행
					System.out.printf("[%d]: ", lineNumber++);
				}
			} // while
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("end");
	} // main
	
} // class
