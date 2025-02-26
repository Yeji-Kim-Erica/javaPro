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
public class Ex09_02 {

	public static void main(String[] args) {
		
		String fileName = "C:\\E\\Class\\SS23Class\\JavaClass\\javaPro\\src\\days17\\16일차복습_홍길동.txt";
		 
		int one ;
		try ( FileReader reader = new FileReader(fileName); ) { 
			 			
			while ( ( one = reader.read() ) != -1 ) {
				System.out.printf("%c", (char)one);
			} // while
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch( Exception e) {
			System.out.println( e.toString() );
		} 
		

		System.out.println("end");
	} // main

} // class






  