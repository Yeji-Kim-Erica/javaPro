package days08;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 12. - 오후 2:07:09
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		
		// 아까는 오버로딩 해봤음
		// 함수 만들어보자~
		
		int x, y, result;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> x, y input ? ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		// result = x + y;
		// 두 정수의 합을 반환하는 sum() 메서드를 선언 -> 호출
		result = sum(x, y);
		
		System.out.printf("%d+%d=%d\n", x, y, result);
		
	} // main
	
	public static int sum(int x, int y) {
//		int result = x + y;
//		return result;
		// 또는
		return x + y; // return 수식; 도 가능
	}
	
}
