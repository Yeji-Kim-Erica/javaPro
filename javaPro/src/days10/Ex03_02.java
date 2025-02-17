package days10;

/**
 * @author yejikim
 * @date 2025. 2. 14. - 오전 11:34:38
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// 중첩 for문 사용해서 별 찍기
		// 별 찍기 [2]
		/*
		*
		**
		***
		****
		*/

		// [2번째 방법]
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(i >= j ? "*" : " ");
			} // for j
			System.out.println();
		} // for i

		// [1번째 방법]
//		for (int i = 1; i <= 4; i++) { // 행
//			for (int j = 1; j <= i; j++) { // 열
//				System.out.print("*");
//			} // for j
//			System.out.println(); // 개행
//		} // for i

	} // main

}
