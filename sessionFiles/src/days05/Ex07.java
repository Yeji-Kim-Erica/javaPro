package days05;

/**
 * @author kenik
 * @date 2025. 2. 7. - 오후 3:06:41
 * @subject 
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 자바에서 임의의 수를 발생시키는 코딩.
		// 1) Math.random() 메서드 ***
		// 2) Random 클래스
		
		// Math 클래스 :  수학과 관련된 기능이 구현된 클래스
//		System.out.println( Math.abs(10) );  // 10
//		System.out.println( Math.abs(-10) ); // 10
		
		/*
		// 0.0 <=   double  < 1.0
		for (int i = 0; i < 10 ; i++) {
			System.out.println( Math.random() );			
		} // for i
		*/
		
		// 로또 번호 1~45 임의의 수 6개...
		// double -> int 형변환
		// 1 <= (int)(Math.random() * 45)+1 < 46
		
		// 국어 0~100
		// 1 <=   (int)(Math.random()*100)+1  < 101   1~100  X
		// 0 <=   (int)(Math.random()*101)  < 101
				
		/* [로또번호 중복 문제 있다]
		int lottoNumber ;
		for (int i = 1; i <= 6; i++) {
			lottoNumber = (int)(Math.random() * 45)+1;
			System.out.printf("[%d]", lottoNumber);
		} // for i
		System.out.println();
		*/
		
		// 3 -3    ~   19 -3
		//  0 ~ 16  
		// 3 <=   (int)(Math.random()*17)+3  <= 19
		

	} // main

} // class






