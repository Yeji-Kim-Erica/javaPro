package days07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 11. - 오전 8:58:20
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		// [문제] 1-2+3-4+5-6+7-8+9-10=-5
	      // i 짝수   %d+  sum -= i
	      // i 홀수   %d-  sum += i
		
//		      int sum = 0;
//		      for (int i = 1; i <= 10; i++) {
//	         /* [1]
//	         System.out.printf( i%2==0?"%d+": "%d-", i);
//	         sum += i%2==0? -i: i;
//	         */
//	         // [2]
//	         /*
//	         if (i%2==0) {
//	            System.out.printf("%d+", i);
//	            sum -= i;
//	         } else {
//	            System.out.printf("%d-", i);
//	            sum += i;
//	         } // if
//	         */
//	      } // for i
	      
	    //[3]
//		int sum = 0;
//		boolean sw = true;
//		
//		for (int i = 1; i <= 10; i++) {
//			System.out.printf(sw?"%d+":"%d-", i);
//		}
		// 선생님 페이지 참고
	      
		// 복습퀴즈 1번
		// -1/2+2/3-3/4+..+6/7-7/8+8/9=??? 출력하는 코딩을 하세요. ( 반복문 사용 )
		// 분자/분모 = i/(i+1)
		boolean sw = false;
		double sum = 0;
		for (int i = 0; i <= 8; i++) {
			double term = (double)i/(i+1);
			System.out.printf((sw?"-":"+")+"%d/%d", i, i+1);
			sum += sw ? - term : term;
			sw = !sw;
		} // for i
		System.out.printf("\b=%f\n", sum);
		
		// sum += (double)(sw?i:-i)/(i+1); 내가 쓴 것
		
		// 복습퀴즈 7번
//		7. 한 문자를 입력받아서 "대문자", "소문자", "숫자", "한글", "특수문자" 라고
//		   출력하는 코딩을 하세요.
//		   ( 특수문자는 # ! @ % )
		Scanner scanner = new Scanner(System.in);
		char one;
		System.out.print("한 문자 입력 ? ");
		one = scanner.next().charAt(0);
		
		
		if ('A' <= one && one <= 'Z') {
			System.out.println("대문자");
		} else if ('a' <= one && one <= 'z') {
			System.out.println("소문자");
		} else if ('0' <= one && one <= '9') {
			System.out.println("숫자");
		} else if ('가' <= one && one <= '힣') {
			System.out.println("한글");
		} else if ( one == '#' || one == '!' || one == '@' || one == '%' ) {
			System.out.println("특수문자");
		} else {
			System.out.println("기타~");
		}

} // main

}
