package days06;

import java.io.IOException;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오후 5:26:47
 * @subject
 * @content
 */
public class Ex09_03 {

	public static void main(String[] args) throws IOException {

		char one;
		System.out.print("> 한 문자 입력 ? ");
		one = (char) System.in.read();
		System.out.printf("%c\n", one);
		
		System.in.read(); // CR '\r' 제거
		System.in.read(); // LF '\n' 제거
		
		System.out.print("> 한 문자 입력 ? ");
		one = (char) System.in.read();
		System.out.printf("%c\n", one);

	} // main

}
