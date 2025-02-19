package days13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 김예지
 * @date 2025. 2. 19.
 * @subject 검색(Search)
 * @content		ㄴ 항목의 집합 중에 특정 항목을 찾아내는 것.
 * 				1) 순차 검색 (Sequence Search)
 * 				2) 이진 검색 (Binary Search)
 * 
 * 				문제) 찾는 숫자(9)가 있는 위치를 모두 출력하기
 */
public class Ex05_02 {

	public static void main(String[] args) {
		// 30개의 정수 0~20
		int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
	            , 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 배열에서 찾을 정수 입력 ? ");
		int n = scanner.nextInt(); // 12
		
		// 만약에 찾는 값이 배열 속에 없다면 -1 반환
		int[] indexArr = sequenceSearch(m, n);
		
		if (indexArr.length != 0 ) {
			for (int i = 0; i < indexArr.length; i++) {
				System.out.printf("찾는 정수 %d는 %d 위치에 있다.\n", n, indexArr[i]);
			} // for i
		} else {  // X
			System.out.println("찾는 정수는 없다.");
		} // if

		
		/*
		// 내가 쓴 코딩
		if (index[0] == -1) System.out.println("찾는 정수는 없다.");
		else {
			for (int i = 0; i < index.length; i++) {
				System.out.printf("찾는 정수 %d는 %d 위치에 있다.\n", n, index[i]);
			} // for i
		}
		*/
	} // main

   private static int[] sequenceSearch(int[] m, int n) {
	      // [5, 7, 27, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1]
	      // [5, 7, 27]
	      int [] temp = new int[m.length]; // 30   
	      Arrays.fill(temp, -1);
	      
	      int index = 0;
	      // 검색 작업 -> index = 찾은위치값
	      for (int i = 0; i < m.length; i++) {
	         if( m[i] == n ) {
	            temp[index++] = i;
	         }
	      } // for i 
	      
	      return  Arrays.copyOf(temp, index);
	   }

	
	/*
	// 내가 쓴 코딩
	private static int[] sequenceSearch(int[] m, int n) {
		int[] index = {-1};
		// 검색 작업 -> index = 찾은 위치 값
		for (int i = 0; i < m.length; i++) {
			if(m[i]==n) {
				int[] temp = Arrays.copyOf(index, index.length+1);
				temp[index.length-1] = i;
				index = temp;
			}
		}
		
		return Arrays.copyOf(index, index.length-1);
	}
	*/
	
} // class
