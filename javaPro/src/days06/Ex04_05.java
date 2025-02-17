package days06;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오후 12:43:44
 * @subject
 * @content
 */
public class Ex04_05 {

	public static void main(String[] args) {
		
		// Ex04_05 에다가 세 정수를 입력 받아서 세 정수의 가장 큰 값, 가장 작은 값을 구해서 출력
		System.out.print("양의 정수 세 개를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), o = sc.nextInt();
		int min, max;
		
		min = Math.min(Math.min(n, m), o); // 가장 작은 수 구하기
		max = Math.max(Math.max(n, m), o); // 가장 큰 수 구하기
		
		System.out.printf("세 정수 %d, %d, %d 중 가장 큰 값: %d, 가장 작은 값: %d", n, m, o, max, min);
		
	} // main
	
}
