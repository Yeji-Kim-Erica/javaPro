package days13;

import java.util.Arrays;

/**
 * @author 김예지
 * @date 2025. 2. 19.
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 정보처리기사 실기

		int[][] m = new int[5][5];

//		fillM01(m);
//		fillM02(m);
//		fillM03(m);
		fillM04(m);

		dispM(m);
	} // main

	private static void fillM04(int[][] m) {
//		// 내가 처음에 작성한 코딩
//		for (int i = 0; i < m.length; i++) { // 행크기
//			for (int j = 0; j < m[i].length; j++) { // 열크기
//				m[j][i] = 5*(i+1)-j;
//			} // for j
//		} // for i
		
//		// [1] 값을 찾아서 채우기
//		for (int i = 0; i < m.length; i++) { // 행크기
//			for (int j = 0; j < m[i].length; j++) { // 열크기
//				m[i][j] = 5*(j+1)-i;
//			} // for j
//		} // for i
		
		// [2] 방을 찾아서 채우기
		for (int i = 0; i < m.length; i++) { // 행크기
			for (int j = 0; j < m[i].length; j++) { // 열크기
				m[4-j][i] = 5*i+j+1;
			} // for j
		} // for i
	}

	private static void fillM03(int[][] m) {
//		// [1] 값을 찾아서 채우기
//		for (int i = 0; i < m.length; i++) { // 행크기
//			for (int j = 0; j < m[i].length; j++) { // 열크기
//				m[i][j] = (i%2==0)? 5*i+j+1 : 5*(i+1)-j; // 5 == m.length = m[i].length
//			} // for j
//		} // for i
		
		// [2] 방을 찾아서 채우기
		for (int i = 0; i < m.length; i++) { // 행크기
			for (int j = 0; j < m[i].length; j++) { // 열크기
				m[i][(i%2==0) ? j : 4-j] = 5*i+j+1;
			} // for j
		} // for i
	}

	private static void fillM02(int[][] m) {
		/* [1]
		for (int i = 0; i < m.length; i++) { // 행크기
			for (int j = 0; j < m[i].length; j++) { // 열크기
				m[i][j] = m[i].length * (m.length - i) - j;
			} // for j
		} // for i
		*/
		
		// [2]
		for (int i = 0; i < m.length; i++) { // 행크기
			for (int j = 0; j < m[i].length; j++) { // 열크기
				m[4-i][4-j] = 5 * i + j + 1; // 4 == m.length-1, 4 == m[i].length-1
			} // for j
		} // for i
	}

	private static void fillM01(int[][] m) {
		for (int i = 0, v = 1; i < m.length; i++) { // 행크기
			for (int j = 0; j < m[i].length; j++, v++) { // 열크기
				m[i][j] = 5 * i + j + 1; // 5 == m[i].length
			} // for j
		} // for i
	}

	private static void dispM(int[][] m) {
		System.out.println("     0열 1열 2열  3열 4열");

		for (int i = 0; i < m.length; i++) { // 행크기
			System.out.printf("%d행 ", i);
			for (int j = 0; j < m[i].length; j++) { // 열크기
				System.out.printf("[%2d]", m[i][j]);
			} // for j
			System.out.println(); // 개행
		} // for i
	}

}
