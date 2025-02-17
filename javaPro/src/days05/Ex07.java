package days05;

/**
 * @author yejikim
 * @date 2025. 2. 7. - 오후 3:06:42
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		
		// 자바에서 임의의 수를 발생시키는 코딩
		// 1) Math.random() 메서드
		// 2) Random 클래스
		
		// 먼저 Math.random
		
		// Math 클래스 : 수학과 관련된 기능이 구현된 클래스
		
		// 절대값을 구하는 메서드
		// Math.abs(숫자);
		System.out.println(Math.abs(-10)); // 출력결과: 10
		
		// Math.random(); // 0.0 <= double < 1.0 의 랜덤한 double 값을 돌려주는 메서드
		System.out.println(Math.random());
		
		for (int i = 0; i < 1; i++) {
			System.out.println(Math.random());
		} // for i
		
		// 로또 번호 1~45 임의의 수 6개...
		// 1 <= (int)(Math.random()*45)+1 < 46
		
		// 국어 0~100
		for (int i = 0; i < 2; i++) {
			System.out.println((int)(Math.random()*101));
		} // for i
		
		int lottoNumber;
		for (int i = 1; i <= 6; i++) {
			lottoNumber = (int)(Math.random()*45)+1;
			System.out.printf("[%d]", lottoNumber);
		} // for i
		
		System.out.println();
		
		// 위처럼 하면 로또 번호가 중복이 되는 경우가 있음
		// lotto 번호 중복 확인하는 코딩 짜보기 (로직 연습)
		
//		int a, b, c, d, e, f;
//		
//		a = (int)(Math.random()*45)+1;m
//		
//		System.out.printf("[%d][%d][%d][%d][%d][%d]", a, b, c, d, e, f);
//		
		// 3~19
		System.out.println((int)(Math.random()*17)+3);
		
	} // main
	
}
