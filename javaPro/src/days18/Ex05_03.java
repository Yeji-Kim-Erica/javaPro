package days18;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject 1) try~catch문 사용해서 예외처리
 * @content
 */
public class Ex05_03 {

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
//				try {
					m[i] = result; // ArrayIndexOutOfBoundsException
					System.out.println(result);
//				} catch (ArrayIndexOutOfBoundsException e) {
//					System.out.println("배열크기 부족으로 출력 및 저장 X");
//				} // try~catch
			} catch (ArithmeticException e) {
				i--; // 총 10번 값이 나오게 하기 위해
				// System.out.println(e.toString());
			} catch (ArrayIndexOutOfBoundsException e) { // 다중 catch 블럭
				i--;
				m = Arrays.copyOf(m, m.length+5);
				// System.out.println("배열크기 부족으로 출력 및 저장 X");
			} catch (Exception e) {
				// 모든 예외처리 코딩..
			} // try~catch
			
		} // for i
		
		// 강사님 페이지 확인
		
		// 예외가 발생할 것 같은 코드블럭을 잡아서 try~catch문으로 감싼다.
		// 다중 catch 블럭을 사용할 때는 자식 Exception catch 블럭 먼저 코딩한다.
		
	} // main
	
} // Ex05_02 class
