package days06;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오후 12:38:17
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {
		
		// [for/while] 두 정수 사이의 홀수의 합을 출력
		
		System.out.print("양의 정수 두 개를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), sum = 0;

		int min = Math.min(n, m);
		int max = Math.max(n, m);
		if(min % 2 == 0) min++;
		while (min <= max) {
			System.out.printf("%d+", min);
			sum += min;
			min += 2;
		} // while
		
		System.out.printf("\b=%d", sum);
		
	} // main
	
}
