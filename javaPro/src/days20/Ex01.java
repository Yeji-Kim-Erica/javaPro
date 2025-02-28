package days20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 김예지
 * @date 2025. 2. 28.
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days18\\Ex10.java";
		int word = -1;
		char one = '\u0000';
		int[] cntsNum = new int['9'-'0'+1];
		int[] cntsUpper = new int['Z'-'A'+1];
		int[] cntsLower = new int['z'-'a'+1];
		
		try (FileReader reader = new FileReader(fileName);) {
			while ((word = reader.read()) != -1) {
				if (Character.isUpperCase(word)) {
					word -= 'A';
					for (int i = 0; i < cntsUpper.length ; i++) {
						if (word == i) cntsUpper[i]++;
					} // for i
				} else if (Character.isLowerCase(word)) {
					word -= 'a';
					for (int i = 0; i < cntsLower.length ; i++) {
						if (word == i) cntsLower[i]++;
					} // for i
				} else if (Character.isDigit(word)) {
					word -= '0';
					for (int i = 0; i < cntsNum.length; i++) {
						if (word == i) cntsNum[i]++;
					} // for i
				} // else if
			} // while
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
		// 막대그래프 그리기
		
		for (int i = 0; i < cntsUpper.length; i++) {
			System.out.printf("%c(%d) : %s\n", i+'A', cntsUpper[i], "#".repeat(cntsUpper[i]));
		} // for i
		
		for (int i = 0; i < cntsLower.length; i++) {
			System.out.printf("%c(%d) : %s\n", i+'a', cntsLower[i], "#".repeat(cntsLower[i]));
		} // for i
		
		for (int i = 0; i < cntsNum.length; i++) {
			System.out.printf("%c(%d) : %s\n", i+'0', cntsNum[i], "#".repeat(cntsNum[i]));
		} // for i
		
	} // main
	
} // class
