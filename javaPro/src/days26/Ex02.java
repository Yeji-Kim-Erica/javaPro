package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author 김예지
 * @date 2025. 3. 11.
 * @subject days25 Ex10_04.java
 * @content 재귀함수를 사용하는 예제
 			검색 재귀함수를 선언
 */
public class Ex02 {

	public static void main(String[] args) {
		// String pathname = "."; // javaPro 폴더
		String pathname = System.getProperty("user.dir"); // javaPro 폴더
		// C:\Class\JavaClass\javaPro
		String word = "로또";
		
		// searchWord(pathname, word);
		File parent = new File(pathname);
		quickSearch(parent, word);
		
	} // main

	private static void quickSearch(File parent, String word) {
		File[] list = parent.listFiles();
		File f = null;
		String line = null;
		int lineNumber = 1;
		
	    for (int i = 0; i < list.length; i++) {
			f = list[i];
			
			if (f.isDirectory()) {
				quickSearch(f, word);
			} else {
				lineNumber = 1;
				String fileName = f.getName();
				
				try (FileReader reader = new FileReader(f);
					 BufferedReader br = new BufferedReader(reader);){
					
					while ((line = br.readLine())!=null) {
						if( line.contains(word)) {
							System.out.printf("%-20s ", f);
							line = line.replaceAll(word, "["+word+"]");
							System.out.printf("[ %d ] : %s\n", lineNumber++, line);
						} // if
					} // while
				
			} catch (Exception e) {
				e.printStackTrace();
			} // try~catch
		} // if else
	  } // for i
		
	} // 메서드

	private static void searchWord(String pathname, String word) {
		File[] list = new File(pathname).listFiles();
		File f = null;
		String line = null;
		int lineNumber = 1;
		
	    for (int i = 0; i < list.length; i++) {
			f = list[i];
			
			if (f.isDirectory()) {
				searchWord(f.getAbsolutePath(), word);
			} else {
				lineNumber = 1;
				String fileName = f.getName();
				
				try (FileReader reader = new FileReader(f);
					 BufferedReader br = new BufferedReader(reader);){
					
					while ((line = br.readLine())!=null) {
						if( line.contains(word)) {
							System.out.printf("%-15s ", fileName);
							line = line.replaceAll(word, "["+word+"]");
							System.out.printf("[ %d ] : %s\n", lineNumber++, line);
						} // if
					} // while
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	  } // for i
	}
	
} // class
