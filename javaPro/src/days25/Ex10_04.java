package days25;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject
 * @content
 */
public class Ex10_04 {

	public static void main(String[] args) {
		// days24 폴더 안에 있는 모든 파일을 검색해서 HashMap이라는 문자열을 갖고있는 파일명과 파일의 라인번호를 출력
		String pathname = ".\\src\\days24";
		File parent = new File(pathname);
		
		File[] list = parent.listFiles();
		File f = null;
		String line = null;
		int lineNumber = 1;
		String word = "HashMap";
		
		for (int i = 0; i < list.length; i++) {
			f = list[i];
			lineNumber = 1;
			String fileName = f.getName();
			
			try (FileReader reader = new FileReader(f);
				 BufferedReader br = new BufferedReader(reader)) {
				
				while ((line = br.readLine())!=null) {
					if (line.contains(word)) {
						line = line.replaceAll(word, "[" + word + "]");
						System.out.printf("%-20s[%d] : %s\n", fileName, lineNumber++, line);
					} // if
				} // while
				
				// 코드 추후 강사님꺼 참고해서 보완
				
			} catch (Exception e) {
				// TODO: handle exception
			} // try~catch
			
		} // for i
		
		
	} // main
	
} // class
