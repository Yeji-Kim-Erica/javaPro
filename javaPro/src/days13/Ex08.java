package days13;

import java.util.Arrays;

/**
 * @author 김예지
 * @date 2025. 2. 19.
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// 1차원 배열 m
		int[] m = {1,2,3,4,5,6,7,8};
		
		// 1차원 배열 m -> 2차원 배열 n 변환 (이동)
		// [][][][]
		// [][][][]
		int[][] n = new int[2][4];
		
		// 내가 쓴 코드
//		for (int i = 0, k = 0; i < n.length; i++) {
//			for (int j = 0; j < n[i].length; j++, k++) {
//				n[i][j] = m[k];
//			} // for j
//		} // for i
		
		for (int i = 0; i < m.length; i++) {
			n[i/n[0].length][i%n[0].length] = m[i];
		} // for i

		for (int i = 0; i < n.length; i++) {
			System.out.println(Arrays.toString(n[i]));
		} // for i
		
	} // main
	
} // class
