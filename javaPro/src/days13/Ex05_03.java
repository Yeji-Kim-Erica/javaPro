package days13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 김예지
 * @date 2025. 2. 19.
 * @subject 검색(Search)
 * @content ㄴ 항목의 집합 중에 특정 항목을 찾아내는 것. 1) 순차 검색 (Sequence Search) 2) 이진 검색
 *          (Binary Search)
 * 
 *          문제) 찾는 숫자(9)가 있는 위치를 모두 출력하기
 */
public class Ex05_03 {

	public static void main(String[] args) {
		// 30개 0~20 정수
		int[] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 
				7, 13, 3, 14, 10, 15, 11, 6, 19, 5, 
				2, 0, 16, 18, 15, 18, 0, 9, 13,	16 };

		Scanner scanner = new Scanner(System.in);
		System.out.print("> 배열에서 찾을 정수 입력 ? ");
		int n = scanner.nextInt(); // 12
		int[] indexArr = sequenceSearch(m, n);
		//
		if (indexArr != null ) {
			for (int i = 0; i < indexArr.length; i++) {
				System.out.printf("찾는 정수 %d는 %d 위치에 있다.\n", n, indexArr[i]);
			} // for i
		} else {  // X
			System.out.println("찾는 정수는 없다.");
		}
		
		System.out.println(Arrays.toString(indexArr));

	} // main

	// [4] ***
	private static int[] sequenceSearch(int[] m, int n) {
		int[] temp = null;
		Arrays.fill(temp, -1);
		int index = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] == n) {
				temp = (temp == null) ? new int[1] : Arrays.copyOf(temp, temp.length+1);
				temp[temp.length-1] = i;
			}
		} // for i
		


		return Arrays.copyOf(temp, index);
	}

} // class
