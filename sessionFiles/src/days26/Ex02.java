package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author kenik
 * @date 2025. 3. 11. - 오전 9:51:57
 * @subject days25.Ex10_04.java
 * @content  재귀 함수를 사용하는 예제
 *           검색 재귀 함수 선언. 
 */
public class Ex02 {

	public static void main(String[] args) {
		// 10:02 수업 시작~
		//		String pathname = ".\\src\\days24";  
		String pathname = System.getProperty("user.dir"); //   javaPro 폴더
		// C:\E\Class\SS23Class\JavaClass\javaPro
		// System.out.println(pathname);		
		File parent = new File(pathname);
		String word = "HashMap";

		quichSearch(parent, word);

		System.out.println(" end "); 

	} // main

	private static void quichSearch(File parent, String word) {

		File [] list = parent.listFiles();

		File f = null;
		String line = null;
		int lineNumber = 1;

		for (int i = 0; i < list.length; i++) {
			f = list[i];

			if ( f.isDirectory() ) {  // 하위 폴더
				quichSearch(f, word);
			} else {  // 파일
				lineNumber = 1;
				String fileName = f.getName();

				try (
						FileReader reader = new FileReader(f);
						BufferedReader br = new BufferedReader(reader);	
						){

					while ((line = br.readLine())!=null) {
						if( line.contains(word)) {
							System.out.printf("%s ", f ) ;// fileName);
							line = line.replaceAll(word, "["+ word + "]");
							System.out.printf("[ %d ] : %s\n", lineNumber++, line);		
						} // if
					} // while

				} catch (Exception e) {
					e.printStackTrace();
				}
			} // if 

		} // for i

	} // quichSearch



} // class





