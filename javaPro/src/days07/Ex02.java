package days07;

import java.io.IOException;

/**
 * @author yejikim
 * @date 2025. 2. 11. - 오전 10:48:11
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		char one;
		System.out.print("> 한 문자 입력 ? ");
		one = (char) System.in.read();
		System.out.printf("%c\n", one);
		
//		System.in.read(); // CR '\r' 제거
//		System.in.read(); // LF '\n' 제거
		
//		System.in.skip(2); // 위와 동일한 기능
		
		System.in.skip(System.in.available());
		// available: 남아있는 문자 개수
		// skip: 버린다
		
		System.out.print("> 한 문자 입력 ? ");
		one = (char) System.in.read();
		System.out.printf("%c\n", one);
		
		System.out.println("end");
		
	} // main
	
}
