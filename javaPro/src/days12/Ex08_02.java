package days12;

/**
 * @author 김예지
 * @date 2025. 2. 18.
 * @subject
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		// 3차원 배열
		int[][][] m = new int[2][3][4];
		System.out.println(m.length); // 면 크기: 2
		
		System.out.println(m[0].length); // 0면의 행 크기: 3
		System.out.println(m[1].length); // 1면의 행 크기: 3
		
		System.out.println(m[0][0].length); // 0면 0행의 열 크기: 4
		
		/*        m[0]      m[1]
	    *       [0x200주소][주소]                [0x100주소]
	    *       0x100                     			m
	    *       
	    *         m[0][0]
	    *       [0x300주소][주소][주소]
	    *       0x200
	    *       
	    *       [4바이트][4바이트][4바이트][4바이트]
	    *       0x300
	    * */
		
		// 178페이지 참고
		
		dispM(m);
		
	} // main

	private static void dispM(int[][][] m) {
		for (int i = 0; i < m.length; i++) { // 면 크기
			System.out.printf("[%d]면\n",i);
			for (int j = 0; j < m[i].length; j++) { // 각 면의 행 크기
				for (int k = 0; k < m[i][j].length; k++) {
					System.out.printf("m[%d][%d][%d]=%d",i,j,k,m[i][j][k]);
				} // for k
				System.out.println();
			} // for j
			System.out.println();
		} // for i
	}
	
}
