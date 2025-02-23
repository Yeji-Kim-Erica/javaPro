package days15;

/**
 * @author 김예지
 * @date 2025. 2. 21.
 * @subject
 * @content [3] this가 단독으로(홀로) 사용될 때 this의 용도: 리턴값 (MyPoint 페이지 plusMyPoint 참고)
 */
public class Ex06_03 {

	public static void main(String[] args) {
		
		// [MyPoint 클래스 이용해서 설명]
		MyPoint p1 = new MyPoint(1,2);
		MyPoint p2 = new MyPoint(100,200);
		
		// 클래스 복사
//		MyPoint p3 = p1.plusMyPoint(p2);
//		p3.dispMyPoint(); // > x=101, y=202
		p1.plusMyPoint(p2).dispMyPoint();
		p1.dispMyPoint(); // > x=101, y=202
		
	} // main
	
} // class
