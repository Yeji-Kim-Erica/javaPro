package days04;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 6. - 오후 3:11:05
 * @subject switch문
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {

		// [문제] switch문 사용
		// 정수를 입력받아서 "홀수"/"짝수" 라고 출력
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 n을 입력하세요. : ");
		n = scanner.nextInt();
		
		String result = null;
		switch (n % 2) {
		case 0:
			result = "짝수(Even Number)";
			break;
			
		case 1:
			result = "홀수(Odd Number)";
			break;
			
		default:
			break;
		} // switch
		
		System.out.println(result);
		
		scanner.close();
		
	} // main

//	switch (key) {
	// key : 수식, 변수가 올 수 있음. 상수는 넣을 수 없음.
//	case value:
	// value : 값을 넣는 곳. 변수는 넣을 수 없음.
	//		   ㄴ 넣을 수 있는 값: byte, short, int, char, String, 또는 열거형(enum) 타입
//		
//		break;
//
//	[default:
//		break;] // default문은 생략이 가능하다.
//	} // switch

}
