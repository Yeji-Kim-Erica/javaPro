package days07;

/**
 * @author yejikim
 * @date 2025. 2. 11. - 오후 12:19:41
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {

//		// for문을 사용해서 구구단을 가로로 출력
//		
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d*%d = %2d ", i, j, i*j);
//			} // for j
//			System.out.println();
//		} // for i
//		
//		System.out.println();
//		
//		// for문을 사용해서 구구단을 세로로 출력
//		
//	      for (int i = 2; i <= 9; i++) {
//	          System.out.printf("[ %d단 ]\n", i);
//	          for (int j = 1; j <= 9; j++) {
//	             System.out.printf("%d*%d = %2d\n", i, j, i*j);
//	          } // for j
//	          System.out.println();
//	       } // for i

		// 새 문제

		int dan = 2, width = 3;
		while (dan <= 9) {
			for (int i = 1; i <= 9; i++) {
				for (int j = dan; j < dan + width; j++) {
					if (j > 9) break;
					System.out.printf("%d*%d=%02d ", j, i, j * i);
				} // for j
				System.out.println();
			} // for i
			dan += width;
			System.out.println();
		}

		// 선생님 풀이
		
//		for (int k = 1; k <= 2; k++) {
//			for (int i = 1; i <= 9; i++) {
//				for (int d = 4 * k - 2; d <= 4 * k - 2 + 3; d++) { // 단
//					System.out.printf("%d*%d=%2d ", d, i, d * i);
//				} // for d
//				System.out.println();
//			} // for i
//			System.out.println();
//		} // for k

	} // main

}
