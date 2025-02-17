package days10;

import java.util.Arrays;

/**
 * @author yejikim
 * @date 2025. 2. 14. - 오후 2:45:55
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 * [ 배열 ]
		 * 1. [] 인덱스 연산자
		 * 2. 정의: 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것.
		 * 		   동일한 자료형을 메모리 상에 연속적으로 놓이게 한 것.
		 * 3. 배열 선언
		 * 	  자료형 [] 배열명(=참조변수/지역변수/변수명) = new 자료형 [배열크기];
		 * 4. 참조타입 그림 (기억할 것)
		 * 5. 배열의 크기 = 배열명.length	-> 속성이기 때문에 괄호가 없음
		 * 				 "문자열".length() -> 메서드이기 때문에 괄호가 있음
		 * 6. 첨자값(index) 0 1 2 3
		 * 
		 * 	 0번째 요소		 : 아랫첨자값(lowerBound)
		 * 	 1번째 요소
		 * 	 2번째 요소
		 * 	 배열크기-1번째 요소	 : 윗첨자값(upperBound)
		 * 7. ArrayIndexOutofBoundException
		 * 8. 배열은 초기화 하지 않아도 각 자료형의 기본값으로 초기화되어있다.
		 * 9. 배열 초기화
		 * 	  1) 배열명[첨자값] = 값;
		 * 	  2) 자료형 [] 배열명 = {값1, 값2, ...};
		 * 	  3) Arrays.fill(배열명, 기본값);
		 */
			  int [] m = new int[100];
			  Arrays.fill(m, -1); // -> 배열 m의 기본값이 -1로 설정되어 초기화된다.
			  
			  dispArr(m);
			  
	} // main

	private static void dispArr(int[] m) {
		// TODO Auto-generated method stub
		
	}
	
}
