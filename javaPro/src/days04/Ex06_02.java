package days04;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 6. - 오후 2:17:12
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {

		
		// [시험 문제]
		// 정수를 입력받아서 "홀수"/"짝수" 라고 출력
		int n;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 n을 입력하세요. : ");
		n = scanner.nextInt();
		// Resource leak: 'scanner' is never closed
		// ㄴ Scanner.close(); 가 없어서
		// 어노테이션(Annotation): @로 시작하는 것. 컴퓨터에게 개발자가 오류를 알고있다고 알려주는 것
		// 어노테이션의 위치는 해당 오류가 발생한 클래스 바로 위.
		// 어노테이션을 사용하면 오류메시지가 뜨지 않아서 오류 확인이 어려우므로 쓰지 않는 것이 좋다.
		
		
//		if (n % 2 == 0) {
//			System.out.println("짝수(Even Number)");
//		} // if
//		if (n % 2 != 0) {
//			System.out.println("홀수(Odd Number)");
//		} // if
		
		if (n % 2 == 0) {
			System.out.println("짝수(Even Number)");
		} else {
			System.out.println("홀수(Odd Number)");
		}
		
		scanner.close();
		System.out.println("end");
		
	} // main
	
} // class
