package days15;

/**
 * @author 김예지
 * @date 2025. 2. 21.
 * @subject
 * @content
 
 	1. 기본형 매개변수와 참조형 매개변수
 	2. 기본형 리턴자료형과 참조형 리턴자료형
 	
 	MyPoint 클래스 선언: 좌표를 관리하기 위한 필드, 메서드를 가진 클래스
 
 */
public class Ex03 {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint();
		p1.x = 10;
		p1.y = 20;
		
		// MyPoint p2 = p1.offsetPoint(100);
		// p2.dispMyPoint(); // 출력결과: > x=110, y=120
		
		p1.offsetPoint(100).dispMyPoint(); // 출력결과: > x=110, y=120
		// p1.plusPoint(100).dispMyPoint(); plusPoint의 리턴자료형이 int이므로 dispMyPoint가 매개변수로 받을 수 없음
		
		/*
		MyPoint p1 = new MyPoint();
		// 객체명.필드
		// 객체명.메서드()
		p1.dispMyPoint(); // 출력결과: > x=0, y=0
		
		MyPoint p2 = new MyPoint();
		p2.x = 10;
		p2.y = 20;
		p2.dispMyPoint(); // 출력결과: > x=10, y=20
		
		// x, y 좌표값 모두 내가 준 값(100)만큼 이동.
		p1.offsetPoint(100); // 기본형 매개변수 (100)
		p1.dispMyPoint(); // 출력결과: > x=100, y=100
		
		p1.offsetPoint(p2); // 참조형 매개변수 (p2)
		p1.dispMyPoint(); // 출력결과: > x=110, y=120
		
		// x 좌표만 이동...
		int x = p1.plusPoint(10); // 기본형 리턴자료형
		System.out.println(x); // 출력결과: 120
		
		// 클래스 복사
		MyPoint p3 = p1.offsetPoint(5); // 참조형 리턴자료형
		p3.dispMyPoint(); // 출력결과: > x=15, y=25 (앞의 x += 100 메서드를 주석처리해서)
		p1.dispMyPoint(); // 출력결과: > x=10, y=20
		*/
		
	} // main
	
}
