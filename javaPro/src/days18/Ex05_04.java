package days18;

import java.util.Random;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject 1) try~catch문 사용해서 예외처리
 * @content
 */
public class Ex05_04 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		Random rnd = new Random();
		int n = -1;
		int[] m = new int[5];

		for (int i = 0; i < 10; i++) {
			try {
				n = rnd.nextInt(5); // 0<= 정수 < 5
				result = number / n; // java.lang.ArithmeticException: / by zero
				m[i] = result; // ArrayIndexOutOfBoundsException
				System.out.println(result);
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // 멀티 catch 블럭
				// 멀티catch블럭 안에서 OR을 사용할 때는 비트연산자 OR을 사용한다.
				System.out.println(e.toString());
			} catch (Exception e) {
				// 모든 예외처리 코딩..
				e.printStackTrace();
				// System.out.println(e.getMessage());
			} // try~catch

		} // for i

		// 예외가 발생할 것 같은 코드블럭을 잡아서 try~catch문으로 감싼다.
		// 다중 catch 블럭을 사용할 때는 자식 Exception catch 블럭 먼저 코딩한다.
		// 이 페이지 강사님 페이지와 비교해서 빠진 부분 없는지 확인

	} // main

} // Ex05_02 class
