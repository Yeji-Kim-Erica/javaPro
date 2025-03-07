package days24;

import java.util.Arrays;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject [열거형(enum)]
 * @content 반복자/열거자와는 다른 것임. 열거형은 자료형이다.
 			열거형: 상수들의 집합을 정의하는 클래스 타입
 			
 	열거형: 서로 관련된 상수들의 집합을 나타내는 특별한 클래스 타입
 	  ㄴ 선언 방법
 		enum 열거형이름 {상수명, 상수명, ...}
 	  ㄴ 사용방법
 	  	강사님 자료 보고 추가..
 	  ㄴ
 	
 */
public class Ex09 {
	
	/* 중첩클래스의 의미가 됨 (enum은 클래스로 컴파일됨)
	enum Card {
		CLOVER, HEART, SPADE, DIAMOND
	}
	*/
	
	public static void main(String[] args) {
		/* 옛날엔 이렇게 썼다...
		switch (card) {
		case Card.CLOVER: // 클로버
			break;
		case Card.HEART: // 하트
			break;
		case Card.SPADE: // 스페이드
			break;
		case Card.DIAMOND: // 다이아몬드
			break;

		default:
			break;
		} // switch
		*/
		
		System.out.println(Card.CLOVER); // CLOVER
		System.out.println(Card.CLOVER.name()); // "CLOVER"
		System.out.println(Card.CLOVER.ordinal()); // 0 (상수의 순서)
		
		Card cardType = Card.valueOf("CLOVER");
		System.out.println(cardType); // CLOVER (문자열 CLOVER와 일치하는 상수 값을 가져옴)
		
		// Card 열거형의 모든 상수값을 얻어올 때
		Card[] cardArr = Card.values();
		System.out.println(Arrays.toString(cardArr));
		// [CLOVER, HEART, SPADE, DIAMOND]
		
		
	} // main
	
} // class

/* 옛날엔 이렇게 썼다...
class Card {
	
	public static final int CLOVER = 1;
	public static final int HEART = 2;
	public static final int SPADE = 3;
	public static final int DIAMOND = 4;
	
}
*/

/* 해당 패키지 안에서만 사용하겠다는 의미
enum Card{
	CLOVER, HEART, SPADE, DIAMOND
}
*/

// days24.Card.java -> public
























