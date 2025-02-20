package days14;

/**
 * @author 김예지
 * @date 2025. 2. 20.
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) throws InterruptedException {
		// 1은 0행의 가운데 위치
		// 열증가, 행감소 (행이 벗어나면 가장 큰 행, 열이 벗어나면 가장 작은 열)
		// 이미 값이 있는 경우, 행만 증가.

		int[][] m = new int[5][5];
		// 마방진
		magicSquare(m);

		dispM(m);

	} // main

	private static void magicSquare(int[][] m) throws InterruptedException {
		int v = 1;
		int row, col;
		int nextRow, nextCol;
		row = 0;
		col = m[0].length/2;
		m[row][col] = v++;
		
		while (v <= m.length*m[0].length) {
			
			Thread.sleep(1000); // 1초간 현재 스레드(일꾼) 일시정지하게 하는 코드
			dispM(m);
			
			// 1. 열 증가, 행 감소
			nextCol = col + 1;
			nextRow = row - 1;
			// 2. 행 벗어난 경우
			if (nextRow == -1) nextRow = m.length - 1;
			// 3. 열 벗어난 경우
			if (nextCol == m[0].length) nextCol = 0;
			// 4. 그 다음 위치에 값이 있는 경우
			if (m[nextRow][nextCol] != 0) {
				nextRow = row + 1;
				nextCol = col;
			}
			row = nextRow;
			col = nextCol;
			m[row][col] = v++;
			dispM(m);
		}
		
		/* 내가 쓴 코드
		int num = 1;
		int row = 0;
		int col = 2;

		while (num <= 25) {

			// 숫자 대입, 열 증가, 행 감소
			if (m[row][col] == 0) {
				m[row--][col++] = num++;
			} else { // 이미 값이 있는 경우, 행만 증가
				m[++row][col++] = num++;
				row--;
			}

			// 행이 벗어나면 가장 큰 행
			if (row < 0)
				row = m.length - 1;

			// 열이 벗어나면 가장 작은 열
			if (col > m.length - 1)
				col = 0;

		}
		*/
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
