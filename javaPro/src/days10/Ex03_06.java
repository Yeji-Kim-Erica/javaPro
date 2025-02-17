package days10;

/**
 * @author yejikim
 * @date 2025. 2. 14. - 오후 12:07:40
 * @subject
 * @content
 */
public class Ex03_06 {
	public static void main(String[] args) {
		// 별 찍기 [6] 이등변 삼각형
		/*
		  *
		 ***
		*****
		*/

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i+j>=4 && j-i<=2 ? "*" : " ");
			} // for j
			System.out.println();
		} // for i

		// 풀이
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3 - i; j++) {
				System.out.print(" ");
			} // for j
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			} // for j
			System.out.println();
		} // for i

		// 행 개수를 입력 받아서 그리기
		int row = 11;

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			} // for j
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			} // for j
			System.out.println();
		} // for i

	} // main

} // class
