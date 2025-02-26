package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject
 * @content
 */
public class Ex09_05 {

	public static void main(String[] args) {
		/*
		String dir = System.getProperty("user.dir");
		System.out.println(dir); // C:\Class\JavaClass\javaPro
		*/
		
		//	. : 상대경로 - 현재 디렉토리
		// .. : 상대경로 - 상위 디렉토리
		
		String dir = System.getProperty("user.dir"); // 현재 디렉토리
		
//		String fileName = ".\\.classpath";
//		String fileName = ".classpath";
//		String fileName = ".\\..\\test.txt";
//		String fileName = ".\\src\\days01\\Ex01.java";
		String fileName = dir + "\\.classpath";
		
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
