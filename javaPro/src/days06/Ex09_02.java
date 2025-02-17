package days06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오후 4:48:30
 * @subject
 * @content
 */
public class Ex09_02 {

	public static void main(String[] args) {
		
		// charAt 메서드
		// 변수 명.charAr(int index)
		
		String name = "admin";
		char ch;
		// String -> char[] 변환
		char [] nameArr = new char[name.length()];
//		for (int i = 0; i < name.length(); i++) {
//			// [1]
//			ch = name.charAt(i);
//			nameArr[i] = ch;
//			System.out.printf("%s -> %d -> '%c'\n", name, i, ch);
//		} // for i
		
		System.out.println(Arrays.toString(nameArr));
		
		// char[] -> String 변환
		// [1]
		name = new String(nameArr);
		// [2]
		name = String.valueOf(nameArr);
		// [3]
		name = "";
		for (int i = 0; i < nameArr.length; i++) {
			name += nameArr[i];
		} // for i
		System.out.println(name);
		
		// "A" 와 'A';의 차이
		// "A" = 'A' + '\0'
		
	} // main
	
}
