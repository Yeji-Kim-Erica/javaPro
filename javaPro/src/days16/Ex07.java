package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// is-a 관계 (상속관계)
		/*
		 	1. 상속 ([inherit]ance)
		 	2. 상속
		 		부모 -> 자식 (코드를 물려줌)
		 		기존의 클래스를 재사용하여 새로운 클래스를 작성(선언)하는 것을 상속이라고 함.
		 	3. 상속의 장점
		 		ㄴ 코드의 재사용 + 코딩양이 적어짐
		 		ㄴ 생산성 향상, 유지/보수가 쉬워짐
		 	4. 자바에서 상속을 구현하는 방법
		 		class 새로운 클래스명 extends 기존클래스 {
		 		}
		 	5. 기존의 클래스를 부모클래스(= 기초(base)클래스, super클래스, 상위 클래스)라고 함 -> super를 많이 씀
		 	   기존의 클래스를 물려받은 새로운 클래스를 자식클래스(= 파생(deprived)클래스, sub클래스, 하위 클래스)라고 함
		 	
		 		(부모클래스)
		 			↑
		 		(자식클래스)
		 	6. 예)
		 		좌표 값을 관리하는 클래스 : Point2D.java
		 			ㄴ 물려받을 클래스 : Point3D.java
		 		int[] xArr = new int[30];
		 		int[] yArr = new int[30];
		 		
		 		Point2D[] p = new Point2D[30];
		 */
		
		Point2D p = new Point2D(10,20);
		p.dispPoint2D();
		
		// 시간이 지나서 좌표 x, y, z를 관리할 3D 클래스를 만들 때
		
	} // main
	
} // class
