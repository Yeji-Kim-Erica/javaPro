package days20;

import java.io.FileReader;

/**
 * @author kenik
 * @date 2025. 2. 28. - 오전 6:59:16
 * @subject 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {

		String fileName = ".\\src\\days18\\Ex10.java";
		char one = '\u0000';
		int code = -1;
		
		int [] countsUpper = new int[26]; // 대문자 
		int [] countsLower = new int[26]; // 소문자 
		int [] countsDigit = new int[10]; // 숫자 

		try (FileReader reader = new FileReader(fileName);){

			while ( (code = reader.read()) != -1 ) {
				
				if ( Character.isUpperCase(code) ) {
					int index = code -'A';
					countsUpper[index]++;
				}else if (Character.isLowerCase(code)) {
					int index = code -'a';
					countsUpper[index]++;
				}else if (Character.isDigit(code)) {
					int index = code -'0';
					countsUpper[index]++;
				} // if // if
			} // while

			// 막대그래프 그리기
			for (int i = 0, count; i < countsUpper.length; i++) {
				count  = countsUpper[i];
				System.out.printf("%c(%d) %s\n", 
						i+'A', count, "#".repeat(count));
			} // for i
			for (int i = 0, count; i < countsLower.length; i++) {
				count  = countsLower[i];
				System.out.printf("%c(%d) %s\n", 
						i+'A', count, "#".repeat(count));
			} // for i
			for (int i = 0, count; i < countsDigit.length; i++) {
				count  = countsDigit[i];
				System.out.printf("%c(%d) %s\n", 
						i+'A', count, "#".repeat(count));
			} // for i

		} catch (Exception e) {
			System.out.println(e.toString());
		}


	} // main

} // class















