package days18;

import java.util.Random;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		Random rnd = new Random();
		int n = -1;
		for (int i = 0; i < 10; i++) {
			n = rnd.nextInt(5); // 0<= 정수 < 5
			
			if (n == 0) { // 예외처리가 아님. 이 코드를 넣으면 예외가 발생하지 않기 때문.
				i--;
				continue;
			} // if
			
			result = number / n; // java.lang.ArithmeticException: / by zero
			System.out.println(result);
		} // for i
		
	} // main
	
} // Ex05_02 class
