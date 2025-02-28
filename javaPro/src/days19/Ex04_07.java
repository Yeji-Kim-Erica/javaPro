package days19;

import java.util.Arrays;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject
 * @content
 */
public class Ex04_07 {

	public static void main(String[] args) {
		String message = "TODO Auto-generated method stub";
		// String -> char[] 변환
		// char[] -> String 변환
		
		// String -> byte[] 변환
		byte[] messageArr = message.getBytes();
		System.out.println(Arrays.toString(messageArr));
		
		// byte[] -> String 변환
		message = new String(messageArr);
		System.out.println(message);
		
		
	} // main
	
} // class
