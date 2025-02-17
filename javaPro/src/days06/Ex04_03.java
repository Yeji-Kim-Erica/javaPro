package days06;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오후 12:28:33
 * @subject
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
		
		// while문
		
		System.out.print("양의 정수 두 개를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), sum = 0;

		int min = Math.min(n, m);
		int max = Math.max(n, m);

		// [1번째 방법]
//		int i = min;
//		while (i <= max) {
//			System.out.printf("%d+", i);
//			sum += i++;
//		} // while
		
		// [2번째 방법]
		while (min <= max) {
			System.out.printf("%d+", min);
			sum += min++;
		} // while
		
		System.out.printf("\b=%d", sum);
		
	} // main
	
}
