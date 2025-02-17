package days02;

/**
 * @author yejikim
 * @date 2025. 2. 4. - 오후 12:39:07
 * @subject println, print, printf 함수
 * @content
 */

public class Ex04 {
	public static void main(String[] args) {
		// println : 출력 + 개행 O
		// print : 출력 + 개행 X
		// printf : 출력 + 개행 X
		
		// println 함수
		System.out.println("이창익");
		System.out.println("변상호");
		System.out.println("김예지");
		System.out.println("----------"); // 구분선
		System.out.println("-".repeat(10)); // 이렇게도 구분선을 쓸 수 있다
		
		// print 함수
		System.out.print("이창익");
		System.out.print("변상호");
		System.out.print("김예지");
		System.out.println("-".repeat(10));
		
		// 개행의 3가지 방법
		System.out.println("이창익\n"); // \n으로 개행
		System.out.println("변상호" + '\n');	// \n을 따로 합쳐서 개행
		System.out.println("김예지");
		System.out.println(); // println을 이용해서 개행
		System.out.println("-".repeat(10));
	}
}
