package days19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		int lineNumber = 1;
		String fileName = ".\\src\\days19\\학생명단.txt";
		int one;
		try (FileReader fileRead = new FileReader(fileName);) {
			System.out.printf("[%d]: ", lineNumber++);
			while ((one = fileRead.read()) != -1) {
				System.out.printf("%c", one);
				if(one == 10) System.out.printf("[%d]: ", lineNumber++);
			} // while
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	} // main
	
} // class
