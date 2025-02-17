package days03;

/**
 * @author yejikim
 * @date 2025. 2. 5. - 오전 10:04:38
 * @subject 복습 퀴즈 풀이
 * @content
 */

public class Ex01_05 {
	public static void main(String[] args) {
		
		char a = 'x';
		char b;
		
		// 대문자 + 32 = 소문자
		System.out.println( 'A' - 'a' ); // 출력결과: -32
		// System.out.println("%c", a - 32); // 오류 발생
		// The method println(int) in the type PrintStream is not applicable for the arguments (String, int)
		System.out.println( 'a' - 32 ); // 출력결과: 65
		
		// b = a - 32;
		// Type mismatch: cannot convert from int to char
		b = (char)(a - 32);
		System.out.println(b); // 출력결과: X
		
		
	}
}
