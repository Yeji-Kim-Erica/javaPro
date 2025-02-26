package days18;

import java.util.Arrays;
import java.util.Random;

/**
 * @author kenik
 * @date 2025. 2. 26. - 오후 2:02:09
 * @subject   1) try~catch문 사용해서 예외 처리.
 * @content
 */
public class Ex05_03 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		Random rnd = new Random();
		int n = -1;
		
		int [] m = new int[5];
		
		for (int i = 0; i < 10 ; i++) {
			// ArrayIndexOutOfBoundsException
			try {
				n = rnd.nextInt(5); // 0<= 정수  <5
				// java.lang.ArithmeticException: / by zero			
				result = number / n ;	
				m[i] = result;
				System.out.println(result );
				
				/*
				try {
					m[i] = result;
					System.out.println(result );
				} catch (ArrayIndexOutOfBoundsException e) {
					// 배열 크기 늘리든지.. 예외처리
					System.out.println("배열크기 부족으로 출력 및 저장 X");
				} // catch
				*/
				
				// 다중 catch 블럭을 사용할 때는 자식Exception catch블럭 
				// 먼저 코딩한다. 
				
			} catch (ArithmeticException e) {
				i--;
				// System.out.println( e.toString() );
			} catch (ArrayIndexOutOfBoundsException e) {  // 다중 catch 블럭
				i--;
				m = Arrays.copyOf(m, m.length + 5);
				// System.out.println("배열크기 부족으로 출력 및 저장 X");
			} catch( Exception e){
				// 예외처리 코딩...
			}
			
		} // for
		
	} // main

} // class








  