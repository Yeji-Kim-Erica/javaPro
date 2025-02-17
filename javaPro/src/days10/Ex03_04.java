package days10;

/**
 * @author yejikim
 * @date 2025. 2. 14. - 오후 12:07:40
 * @subject
 * @content
 */
public class Ex03_04 {
	public static void main(String[] args) {
		// 별 찍기 [4]
		/*
		****
		 ***
		  **
		   *
		*/

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(i <= j ? "*" : " ");
			} // for j
			System.out.println();
		} // for i

		// 내가 쓴 코드
		for (int i = 1; i <= 4; i++) { // 행
			System.out.print(" ".repeat(i - 1));
			for (int j = 1; j <= 5 - i; j++) { // 열
				System.out.print("*");
			} // for j
			System.out.println(); // 개행
		} // for i

		System.out.println();

		// [1번째 풀이]
		for (int i = 1; i <= 4; i++) { // 행
			for (int j = 1; j <= i - 1; j++) { // 열
				System.out.print(" ");
			} // for j
			for (int j = 1; j <= 5 - i; j++) { // 열
				System.out.print("*");
			} // for j
			System.out.println(); // 개행
		} // for i

		System.out.println();

		// [2번째 풀이]
		for (int i = 1; i <= 4; i++) { // 행
			System.out.print(" ".repeat(i - 1));
			for (int j = 1; j <= 5 - i; j++) { // 열
				System.out.print("*");
			} // for j
			System.out.println(); // 개행
		} // for i

	} // main

} // class
