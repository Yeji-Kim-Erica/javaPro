package days13;

import java.util.Arrays;

/**
 * @author 김예지
 * @date 2025. 2. 19.
 * @subject
 * @content
 */
public class Ex08_03 {

	public static void main(String[] args) {
		// 정보처리기사 실기 (나중에 풀어보기)
		//      4행 3열  2차원 배열
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		int[][] n = new int[2][6];

		// 4행 3열 2차원 배열 m 을 2행 6열 2차원 배열 n으로 변환시켜서 배열 n을 출력.

		System.out.println(Arrays.toString(n));

		dispM(m);

	} // main

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%2d]", m[i][j]);
			} // for j
			System.out.println();
		} // for i

	}

}
