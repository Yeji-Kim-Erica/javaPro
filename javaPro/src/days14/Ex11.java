package days14;

/**
 * @author 김예지
 * @date 2025. 2. 20.
 * @subject
 * @content
 */
public class Ex11 {
	
	// [필드]
	// 	ㄴ 1) 인스턴스 변수
	public String color;
	// 	ㄴ 2) 클래스 변수
	public static int number;
	
	// ↓ [메소드]
	public static void main(String[] args) {
		/* 암기해두면 좋은 내용들
		 * 
		 [자바 변수의 선언 위치에 따른 종류]
		 1. 인스턴스 변수			: '클래스 안'에 선언
		 -> 클래스 안(필드)에 선언된 변수 중 static이 붙지 않은 변수
		 2. 클래스(static) 변수	: '클래스 안'에 선언
		 3. 지역변수				: '메소드 안'or'초기화블럭 안'or'생성자' 안에 선언
		 
		 <변수 생성 시기>
		 1. 인스턴스 변수: 인스턴스가 생성될 때
		 2. 클래스(static) 변수: 클래스가 메모리에 올라갈 때 (== 프로그램이 시작될 때)
		 3. 지역변수: 변수 선언문이 실행될 때
		 
		 <변수 소멸 시기>
		 1. 인스턴스 변수: 객체가 소멸될 때 (더 이상 참조되지 않을 때 해당 인스턴스가 가비지가 되어 소멸대상이 됨)
		 2. 클래스(static) 변수: 클래스가 메모리에 올라갈 때 (== 프로그램이 종료될 때)
		 3. 지역변수: 해당 지역을 벗어날 때
		 
		 */
		
		// 지역변수들.. (ex: age, name, args)
		int age; 
		String name;
		
	} // main
	
} // class
