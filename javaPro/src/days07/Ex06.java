package days07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author yejikim
 * @date 2025. 2. 11. - 오후 2:36:44
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {

		// 1 <= <= 100 임의의 정수를 중복되지 않게 배열에 채워넣기

		// [1]

//		int index = 0, n;      
//	      int [] m = new int[10];
//	      m[index++] = (int)( Math.random()*100)+1;
//	      // 1
//	      while ( index < m.length ) {
//	         n =  (int)( Math.random()*100)+1; 
//	         boolean flag = false;
//	         for (int i = 0; i < index; i++) {
//	            if( m[i] == n ) {
//	               System.out.println("*");
//	               flag = true;
//	               break;
//	            }
//	         } // for i    
//	         if( !flag ) m[index++] = n;
//	      } // while

		// [2] n과 가장 가까운 수 (근사치)를 구해서 출력

		int[] m = new int[10];
		m = new Random().ints(1, 101).distinct().limit(10).toArray();

		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수 n 입력 : ");
		int n = sc.nextInt();
		
		int[] mArr = new int[m.length];
		for (int i = 0; i < m.length; i++) {
			mArr[i] = Math.abs(m[i] - n);
		} // for i

		System.out.println(Arrays.toString(m));
		System.out.println(Arrays.toString(mArr));
		
		int minDiff = IntStream.of(mArr).min().getAsInt();
		System.out.println(minDiff);
		
		for (int i = 0; i < mArr.length; i++) {
			if (mArr[i] == minDiff) {
				System.out.printf("%d번째 값: %d \n", i+1, m[i]);
			}
		} // for i

	} // main

}
