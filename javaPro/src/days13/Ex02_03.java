package days13;

/**
 * @author 김예지
 * @date 2025. 2. 19.
 * @subject 3차원 배열의 초기화
 * @content Ex02, Ex02_02, Ex02_03
 */
public class Ex02_03 {

	public static void main(String[] args) {
		
//		int[][][] m = new int[2][3][4];
		
		// 3차원 배열의 초기화
		int[][][] m = { { {1,2,3,4},
						  {5,6,7,8},
						  {9,10,11,12} },
						{ {1,2,3,4},
						  {5,6,7,8},
						  {9,10,11,12} } };
		
		dispM(m);
		
	} // main

	private static void dispM(int[][][] m) {
		for (int i = 0; i < m.length; i++) { // 면 크기 m.length
			System.out.printf("[%d]면\n", i);
			for (int j = 0; j < m[i].length; j++) { // 행 크기 m[i].length
				for (int k = 0; k < m[i][j].length; k++) { // 열 크기 m[i][j].length
					System.out.printf("m[%d][%d][%d]=%d ", i, j, k, m[i][j][k]);
				} // for k
				System.out.println();
			} // for j
			System.out.println();
		} // for i
	}
	
}
