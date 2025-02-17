package days06;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오후 12:02:38
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {

		// 두 정수(n, m)를 입력받아서 두 정수 사이의 합을 출력.

		// for문
		// [1번째 방법] if else (선생님 자료 참고)
		
		// [2번째 방법]
//		System.out.print("정수 두 개를 입력하세요. : ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt(), m = sc.nextInt(), sum = 0;
//		
//		if(n > m){
//			int temp = n;
//			n = m;
//			m = temp;
//		}
//		
//		for (int i = n; i <= m; i++) {
//			System.out.printf("%d+", i);
//			sum += i;
//		} // for i
//		System.out.printf("\b=%d", sum);
		
		// [3번째 방법]
		System.out.print("양의 정수 두 개를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), sum = 0;

		int min = n > m ? m : n; // Math.min(n,m);
		int max = Math.max(n, m);

		for (int i = min; i <= max; i++) {
			System.out.printf("%d+", i);
			sum += i;
		} // for i
		System.out.printf("\b=%d", sum);

	} // main

}
