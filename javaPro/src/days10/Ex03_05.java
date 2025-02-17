package days10;

/**
 * @author yejikim
 * @date 2025. 2. 14. - 오후 12:07:40
 * @subject
 * @content
 */
public class Ex03_05 {
	public static void main(String[] args) {
		// 별 찍기 [5]
		/*
		   *
		  **
		 ***
		****
		*/

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(i+j >= 5? "*" : " ");
			} // for j
			System.out.println();
		} // for i

		// [1번째 방법]
		for (int i = 1; i <= 4; i++) { // 행
			for (int j = 1; j <= 4 - i; j++) { // 열
				System.out.print(" ");
			} // for j
			for (int j = 1; j <= i; j++) { // 열
				System.out.print("*");
			} // for j
			System.out.println(); // 개행
		} // for i

		// [2번째 방법]
		for (int i = 1; i <= 4; i++) { // 행
			System.out.print(" ".repeat(4 - i));
			for (int j = 1; j <= i; j++) { // 열
				System.out.print("*");
			} // for j
			System.out.println(); // 개행
		} // for i

	} // main

} // class
