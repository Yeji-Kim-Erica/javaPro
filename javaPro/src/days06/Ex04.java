package days06;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오전 11:42:49
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// [for문] 1~n=55
//		int sum = 0, n;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("> 양의 정수(n) 입력 : ");
//		n = scanner.nextInt();
//		
//		for (int i = 1; i <= n; i++) {
//			System.out.printf("%d+", i);
//			sum += i;
//		} // for i
//		System.out.printf("\b=%d\n", sum);
		
		//[while문] 1~n=55
		int sum = 0, n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 양의 정수(n) 입력 : ");
		n = scanner.nextInt();
		int i = 1;
		
		if (n < 1) {
			System.out.println("[알림] 양의 정수만 입력!!!");
			return;
		}
		
		while(i <= n) {
			System.out.printf("%d+", i);
			sum += i;
			i++;
		}
		System.out.printf("\b=%d\n", sum);
		
	} // main
	
}
