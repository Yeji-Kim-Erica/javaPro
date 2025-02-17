package days06;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오후 4:37:01
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// Scanner로 입력받아서 출력하기
		Scanner sc = new Scanner(System.in);
		
		char one = '\u0000';
		System.out.print("> 한 문자를 입력하세요. : ");
//		one = sc.next().toCharArray()[0]; // 내가 쓴 답
		one = sc.next().charAt(0); // 강사님 답 (모범답안)
		/* 이렇게도 쓸 수 있음
		String input = sc.next();
		one = input.charAt(0);
		*/
		
		System.out.printf("%c\n", one);
	} // main
	
}
