package days16;

/**
 * @author kenik
 * @date 2025. 2. 24. - 오후 12:42:53
 * @subject 
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 오후  is-a 관계( 상속 관계 )
		/* 1. 상속 ( [inherit]ance )
		 * 2. 상속
		 *      부모 -> 자식 ( 재산 )
		 *      부모 -> 자식 ( 코드 )
		 *      ? 기존 클래스를 재사용하여 새로운 클래스를 작성(선언)하는 것.
		 * 3. 상속 장점
		 *      ㄴ 코드 재사용 + 코딩양이 적다.
		 *      ㄴ 생산성 향상, 유지 보수 용이.
		 * 4. 자바에서 상속 구현 방법
		 *    class 새로운클래스명 extends 기존클래스{
		 *    }            
		 * 5. 기존클래스 == 부모클래스, 기초(base) 클래스, [super] 클래스, 상위 클래스
		 *    새로운클래스== 자식 "   , 파생(derived) 클래스, sub 클래스, 하위 클래스
		 *    
		 *         (부모클래스)
		 *              ↑
		 *         (자식클래스)
		 * 6. 예) 
		 *     좌표 관리는 클래스 : Point2D.java
		 *                          Point3D.java
		 *                          
		 *      int x1, y1;                            
		 *      int x2, y2;
		 *      int x3, y3;
		 *            :
		 *      int x30, y30;
		 *      
		 *      int[] xArr = new int[30];      
		 *      int[] yArr = new int[30];
		 *      		 *            
		 *      Point2D [] p = new Point2D[30];		 *                                   
		 * */
		
		Point2D p = new Point2D(10,20);
		p.dispPoint2D();
		
		// 2년 정도 Point2D 클래스 사용 중~
		// 좌표 : x, y, z 관리...

	} // main

} // class












