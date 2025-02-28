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
public class Ex09_02 {

	public static void main(String[] args) {
		
		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days17\\16일차복습_김예지.txt";
		int one;
		try (FileReader reader = new FileReader(fileName);) {
			// try 옆 () 안에서 생성하면 실행문들이 다 끝난 후 자동으로 파일이 닫힌다.
			// -> try~with~resources문
			
			while ((one = reader.read()) != -1) {
				System.out.printf("%c", (char)one);
			} // while
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("end");
	} // main
	
} // class
