package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author kenik
 * @date 2025. 2. 26. - 오후 4:24:20
 * @subject 
 * @content
 */
public class Ex09_05 {

	public static void main(String[] args) {
		/*
		// C:\E\Class\SS23Class\JavaClass\javaPro
		 */
		String dir = System.getProperty("user.dir");
		System.out.println( dir );
		
		
		//        .   상대경로  - 현재 디렉토리
		//        ..  상대경로  - 상위 디렉토리
//		String fileName = ".\\.classpath";
        String fileName = dir + "\\.classpath";
//		String fileName = ".\\src\\days01\\Ex01.java";		
//		String fileName = ".classpath"; // 파일명
//		String fileName = ".\\..\\Sample.java";
        
		String line = null ;
		int lineNumber = 1;
		
		try ( FileReader reader = new FileReader(fileName); 
			  BufferedReader br = new BufferedReader(reader); ) {
			
			while(  ( line = br.readLine() ) != null ) {
				System.out.printf("%d : %s\n", lineNumber++, line );
			}
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch( Exception e) {
			System.out.println( e.toString() );
		} 
		System.out.println("end");
		

	}

}
  