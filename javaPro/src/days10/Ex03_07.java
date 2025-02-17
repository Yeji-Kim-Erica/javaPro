package days10;

/**
 * @author yejikim
 * @date 2025. 2. 14. - 오후 2:07:06
 * @subject
 * @content
 */
public class Ex03_07 {

	public static void main(String[] args) {
		// 마름모 그리기

		// __* 		2 1 	1
		// _*** 	1 3 	2
		// ***** 	0 5 	3
		// _*** 	1 3 	4
		// __* 		2 1 	5

		//

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i<=3 && i+j>=4 && j-i<=2 ? "*" : "_");
			} // for j
			System.out.println();
		} // for i
		
		// 집가서 연습

		System.out.println();
		System.out.println();
		
		// 풀이 코드
		for (int i = 1; i <= 5; i++) {
			// 공백 for
			for (int j = 1; j <= (i <= 3 ? 3 - i : i - 3); j++) {
				System.out.print("_");
			} // for j
				// 별 for
			for (int j = 1; j <= (i <= 3 ? 2 * i - 1 : 5 - 2 * (i - 3)); j++) {
				System.out.print("*");
			} // for j
			System.out.println(); // 개행
		} // for i

		// 내가 쓰던 코드
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= Math.abs(3 - i); j++) {
				System.out.print(" ");
			} // for j
			for (int j = 1; j <= Math.abs(2 * i - 1); j++) { // 마무리해서 만들어보기
				System.out.print("*");
			} // for j
			System.out.println();
		} // for i

	} // main

}
