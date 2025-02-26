package days18;

import java.util.Random;

/**
 * @author kenik
 * @date 2025. 2. 26. - 오후 2:02:09
 * @subject   1) try~catch문 사용해서 예외 처리.
 * @content
 */
public class Ex05_04 {

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
				
				     // 멀티 catch 블럭
			} catch (ArithmeticException |  ArrayIndexOutOfBoundsException e) { 
				 System.out.println( e.toString() );
			}  catch( Exception e){
				// 예외처리 코딩...
				e.printStackTrace();
				// syso( e.getMessage() );
			}
			
		} // for
		
	} // main

} // class








  