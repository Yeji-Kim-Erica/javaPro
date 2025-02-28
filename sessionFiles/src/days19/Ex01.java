package days19;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author kenik
 * @date 2025. 2. 27. - 오전 7:00:01
 * @subject 
 * @content
 */
public class Ex01 {
	
	public static void main(String[] args) {
		int one;
		int LineNumber = 1;
		// EOF
		// javaPro 프로젝트명인 폴더 안에 파일명을 찾는다.
		String fileName = ".\\src\\days19\\학생명단.txt";
		try ( FileReader reader = new FileReader(fileName) ){
			System.out.printf("%d : ", LineNumber++);
			while (  (one = reader.read())  !=  -1 ) {
				System.out.printf("%c", one);
				if( one == 10 ) System.out.printf("%d : ", LineNumber++);
			} // while
			
		} catch (FileNotFoundException e) {
			System.out.println( e.toString() );
		} catch (Exception e) {
			System.out.println( e.toString() );
		}
		
		System.out.println("\nend");
	} // main

} // class






  