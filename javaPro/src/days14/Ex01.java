package days14;

/**
 * @author 김예지
 * @date 2025. 2. 20.
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {

		int[][] m = new int[5][5];
		// 골뱅이
		whelk(m);
		
		// 마방진

		dispM(m);

	} // main

	private static void whelk(int[][] m) {
		int sw = 1; // boolean sw = false +1 -1
		int n = 5; // 수행횟수
		int row = 0, col = -1; // 행, 열 인덱스 값
		int v = 1;

		while (true) {
			// 행 고정, 열 증가/감소 for문
			for (int i = 0; i < n; i++) {
				col += sw;
				// System.out.printf("가로 %d,%d\n", row, col);
				m[row][col] = v++;
			} // for i
			n--; // 수행횟수 1 감소
			if (n == 0)
				break;
			// if( v == 26) break;
			// 열 고정, 행 증가/감소 for문
			for (int i = 0; i < n; i++) {
				row += sw;
				// System.out.printf("세로 %d,%d\n", row, col);
				m[row][col] = v++;
			} // for i
			sw *= -1;
		} // while
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
	} // dispM 메서드

} // class
