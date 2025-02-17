package days08;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 12. - 오전 11:32:04
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		// [정보처리기사 실기]
		// 어떤 정수를 입력받고 약수를 구해서 출력하기
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("약수를 구하려고 하는 정수 n 입력 : ");
		int n = scanner.nextInt();
		
		System.out.printf("%d의 약수 - 1 ", n);
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				System.out.printf("%d ", i);
			} // if
		} // for i
		
		System.out.printf("%d", n);
		
	} // main
	
	// [연습문제] 최대공약수, 최소공배수
	
	// 최대공약수
	
//	Scanner scanner = new Scanner(System.in);
//	System.out.print("최대공약수를 구하려고 하는 정수 n 입력 : ");
//	int n = scanner.nextInt();
//	
//	System.out.printf("%d의 최대공약수 : ", n);
//	for (int i = n/2; i >= 2; i--) {
//		if (n % i == 0) {
//			System.out.printf("%d", i);
//			break;
//		} // if
//	} // for i
	
	// [연습문제] 소수
	
}
