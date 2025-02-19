package days12;

/**
 * @author 김예지
 * @date 2025. 2. 18.
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		/* 1차원 배열
		int[] m = new int[8];
		// 1차원 배열의 크기
		System.out.println(m.length);
		dispM(m);
		*/
		
		// 2차원 배열
		int[][] m = new int[4][3];
		System.out.println(m.length); // 행 크기: 4
		System.out.println(m[0].length); // 0행의 열크기: 3
		System.out.println(m[1].length); // 1행의 열크기
		System.out.println(m[2].length); // 2행의 열크기
		System.out.println(m[3].length); // 3행의 열크기
		/*
		 m[0]        m[1]    m[2] m[3]
		[0x200]     [0x300]    []   []              [0x100주소]
		0x100                                           m 
			 
		[4바이트][4바이트][4바이트]
		0x200 
			      
		[4바이트][4바이트][4바이트]
		0x300
		*/
		
		dispM(m);
		
	} // main

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d]=%d ", i, j, m[i][j]);
			} // for j
		System.out.println();
		} // for i
	}

	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d ", i, m[i]);
		} // for i
		System.out.println();
	}
	
} // class
