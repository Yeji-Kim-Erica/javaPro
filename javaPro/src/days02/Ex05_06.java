package days02;

/**
 * @author yejikim
 * @date 2025. 2. 4. - 오후 4:17:43
 * @subject 문자자료형 char
 * @content
 */
public class Ex05_06 {
	public static void main(String[] args) {
		// [기본형 총 8가지]
		// 정수 : b,s,i,l
		// 실수 : f,d
		// 논리형 : boolean
		// 문자 자료형 : char
		
		// char는 유니코드 2바이트로 처리됨.
		// char를 쓰는 법 : 'A' (작은 따옴표를 붙임)
		
		// [문제] 등급을 저장할 변수 선언 : A, B, C, D, F
		char grade = 'A';
		System.out.printf("> 등급: %c", grade);
		
		/*
		 * String : %s
		 * b,s,i,l : %d, %x, %o
		 * f,d : %f, %e
		 * b : %b, %B
		 * char : %c, %C (대문자C를 쓰면 char 값이 소문자여도 대문자가 출력됨)
		 */
		
	}
}
