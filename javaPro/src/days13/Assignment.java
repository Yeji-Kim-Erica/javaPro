package days13;

public class Assignment {

	public static void main(String[] args) {
		int[][] m = new int[5][5];
		boolean sw = false;
		int num, row, col, limit, count, round;
		num = 1;
		row = col = count = round = 0;
		limit = m.length; // 5
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				
			} // for j
		} // for i
		
		while (num<=25) {
			// 숫자 대입
			m[row][col] = num++;
			count++;
			
			// 행/열 증가/감소
			if (!sw) {
				col += (col < limit) ? 1 : -1;
			}
			else {
				row += (row < limit) ? 1 : -1;
			}
			
			// 행/열 스위치
			if (count == limit) {
				sw = !sw;
				count = 0;
				round++; // 몇회전
				if (round % 2 == 1) limit--;
			}
		}

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
