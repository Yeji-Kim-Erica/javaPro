package days13;

/**
 * @author 김예지
 * @date 2025. 2. 19.
 * @subject 가변 배열
 * @content 가변 배열: 행마다 열의 개수가 다를 수 있음
 */
public class Ex03 {

	public static void main(String[] args) {
		// 1반 30명 학생의 성적 처리 done
		// 3반 30명 학생의 성적 처리 done
		// 하지만 만약...
		// 1반 25명, 2반 28명, 3반 20명 이라면?
		
		// 가변 배열 선언 방법
		int[][] m = new int[3][]; // 3개의 행. 열은 정해지지 않음.
		m[0] = new int[25]; // 0행의 열의 개수를 25개로 초기화
		m[1] = new int[28];
		m[2] = new int[20];
		
		dispM(m);
		
	} // main

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 행 크기 m.length
			for (int j = 0; j < m[i].length; j++) { // 열 크기 m[i].length
				System.out.printf("m[%d][%d]=%d ", i, j, m[i][j]);
			} // for j
			System.out.println(); // 개행
		} // for i
	}
	
} // class
