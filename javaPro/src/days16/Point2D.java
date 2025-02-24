package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */

// 부모클래스
public class Point2D {
	// 필드
	private int x;
	private int y;
	
	// 생성자
	public Point2D() { // 생성자는 상속되지 않는다. (암기)
		System.out.println("> Point2D 디폴트 생성자 호출됨...");
	}
	
	public Point2D(int a) { // 생성자는 상속되지 않는다. (암기)
		this.x = a;
		this.y = a;
		System.out.println("> Point2D 1 생성자 호출됨...");
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("> Point2D 2 생성자 호출됨...");
	}

	// getter, setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// 메소드
	public void dispPoint2D() {
		System.out.printf("x=%d, y=%d\n", this.x, this.y);
	}
	
	public String getXY() {
		return String.format("(%d, %d)", this.x, this.y);
	}
	
	public Point2D offsetPoint(int i) { // 기본형 매개변수
		x += i;
		y += i;
		return this; // this의 3번째 용도, 참조형 리턴자료형
	}
	
	public void offsetPoint(Point2D p) { // 참조형 매개변수
		x += p.x;
		y += p.y;
	}
	
	public Point2D plus(Point2D p) {
		int xValue = x + p.x;
		int yValue = y + p.y;
		
		Point2D newp = new Point2D();
		newp.x = xValue;
		newp.y = yValue;
		
		return p;
	}
}
