package days10;

/**
 * @author yejikim
 * @date 2025. 2. 14. - 오전 11:34:38
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// 별 찍기 [1]
		/*
		****
		****
		****
		****
		*/
		
//		for (int i = 1; i <= 4; i++) {
//			System.out.println("*".repeat(4));
//		} // for i
		
		/*
		for (int i = 1; i <= 4; i++) { // 행
			for (int j = 1; j <= 4; j++) { // 열
				System.out.print("*");
			} // for j
			System.out.println(); // 개행
		} // for i
		*/
		
		// 중첩 for문 사용해서 별 찍기
		// 별 찍기 [2]
		/*
		*
		**
		***
		****
		*/
		
		for (int i = 1; i <= 4; i++) { // 행
			for (int j = 1; j <= i; j++) { // 열
				System.out.print("*");
			} // for j
			System.out.println(); // 개행
		} // for i

	} // main

}
