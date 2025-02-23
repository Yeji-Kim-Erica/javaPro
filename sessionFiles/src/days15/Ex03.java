package days15;

/**
 * @author kenik
 * @date 2025. 2. 21. - 오전 11:11:59
 * @subject 
 * @content      
 *            1. 기본형 매개변수와 참조형 매개변수
 *            2. 기본형 리턴자료형와 참조형 리턴자료형
 *            
 *            MyPoint 클래스 선언 : 좌표를 관리하기 위한 필드,메서드를 가진 클래스
 */
public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 [0][0][0x300]                     [0x100]
		  x  y                              p1
		 0x100
		  
		 [10][20][0x300]                   [0x200]
		  x  y                              p2
		 0x200 
		  
		            [dispMyPoint()]
		            0x300
		 * */
		
		MyPoint p1 = new MyPoint();
		p1.x = 10;
		p1.y = 20;
		
		//MyPoint p2 = p1.offsetPoint(100);
		//p2.dispMyPoint();
		
		 p1
		   .offsetPoint(100)
		   .dispMyPoint();
		
		 // int [p1.plusPointX(100)].dispMyPoint();
		 // 10.dispMyPoint();
		
		/*
		MyPoint p1 = new MyPoint();
		// 객체명.필드
		// 객체명.메서드()
		p1.dispMyPoint();

		MyPoint p2 = new MyPoint();
		p2.x = 10;
		p2.y = 20;
		p2.dispMyPoint(); // > x=10, y=20
		
		// x, y 좌표값 모두  내가 준 값(100) 만큼 이동.
		p1.offsetPoint(100);
		p1.dispMyPoint();
		
		p1.offsetPoint(p2);
		p1.dispMyPoint();
		
		// x 좌표만 이동..
		int x = p1.plusPointX(10);  // 기본형 리턴자료형
		System.out.println( x
				);
		
		// 클래스 복사
		MyPoint p3 = p1.offsetPoint(5);
		p3.dispMyPoint();
		p1.dispMyPoint();
		*/
		

	} // main

	
} // class








