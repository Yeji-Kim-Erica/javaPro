package days05;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author yejikim
 * @date 2025. 2. 7. - 오전 7:38:30
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		// [암기] 배열은 초기화하지 않으면 그 자료형의 기본값으로 초기화되어있다.
		// int의 기본값 : 0
		// double의 기본값 : 0.0
		// String의 기본값 : null
		// boolean의 기본값 : false
		// char의 기본값 : 널문자 '\u0000'
		
		// Arrays 클래스 : 배열을 다루기 쉽도록 여러 기능이 구현된 클래스
		
		//배열 선언
//		int [] kors = new int [3];
		
//		// 각 요소를 초기화하는 코딩
//		kors[0] = 89;
//		kors[1] = 34;
//		kors[2] = 66;
//		
//		System.out.println(Arrays.toString(kors));
		
		// 배열 선언과 동시에 초기화하는 코딩 (앞으로 강사님은 배열초기화라고 부르실 예정)
//		int [] kors = new int[] {89, 34, 66};
		int [] kors = {89, 34, 66}; // 이렇게만 써도 됨.
		
	} // main
	
}
