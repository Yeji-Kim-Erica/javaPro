package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject 자동 자원 반환 try ~ with ~ resources 문 설명
 * @content 각 라인 번호를 붙여보기
 			한 문자씩 처리하지 말고 한 라인씩 처리하도록 하기
 */
public class Ex09_04 {

	public static void main(String[] args) {
		
		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days17\\16일차복습_김예지.txt";
		String line = null;
		int lineNumber = 1;
		try (FileReader reader = new FileReader(fileName);
			 BufferedReader br = new BufferedReader(reader);) {
			
			while ((line = br.readLine()) != null) {
				System.out.printf("[%d]: %s\n", lineNumber++, line);
			} // while
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("end");
	} // main
	
} // class
