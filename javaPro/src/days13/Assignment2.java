package days13;

public class Assignment2 {

	private static void whelk(int[][] m) {
		int sw = 1; // boolean sw = false +1 -1
		int n = 5;
		int row = 0, col = -1;
		int v = 1;

		while (true) {
			// 행 고정, 열 증가/감소 for문
			for (int i = 0; i < n; i++) {
				col += sw;
				// System.out.printf("가로 %d,%d\n", row, col);
				m[row][col] = v++;
			} // for i
			n--;
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

		dispM(m);
		
	} // main

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
