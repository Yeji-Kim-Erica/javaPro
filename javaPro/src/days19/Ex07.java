package days19;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		
		// [Wrapper Class] 래퍼 클래스
		// : 기본형을 사용하기 쉽게 하기 위한 클래스
		// 제네릭을 사용할 떄의 Type은 기본형 대신 래퍼클래스를 사용한다.
		
		// [Auto Boxing] [Auto UnBoxing] 용어 이해
		
		/*
		int i = 100;
		System.out.println(i);
		
		// Integer j = new Integer(100);
		// Integer j = new Integer("100");
		Integer j = Integer.valueOf("100");
		
		// float f = j.floatValue();
		// int k = j.intValue();
		*/
		
		// [2]
				int i = 100;
				Integer j = i; // Boxing
				disp(i);
				
				// Boxing: 기본형이 래퍼클래스로 변환되는 것
				// 형변환을 따로 하지 않아도 자동으로 된다 -> 그래서 Auto Boxing
				
				int k = j; // Auto UnBoxing: 래퍼클래스 -> 기본형 형변환
		
		// System.out.printf("출력형식", [Object...]);
		System.out.printf("%s\n", new Point(1, 2));
		
		// 클래스의 상속계층도 (기억)
		// BigInteger: 더 큰 long형 저장
		// BigDecimal: 오차가 없는 수 저장
		
		// 찾아보고 다시 약간 정리하기
		
	} // main
	
	public static void disp(Object obj) { // 기본형 int -> 클래스 Object 변환 가능. 왜?
		System.out.println(obj);		  // int ->(Auto-Boxing) 래퍼클래스 Integer -> Object
	}
	
} // class
