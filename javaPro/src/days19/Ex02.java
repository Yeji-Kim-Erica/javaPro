package days19;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// Object의 메소드
		// 1. hashCode()
		// 2. getClass()
		// 3. toString() 오버라이딩
		// 4. equals()	 오버라이딩
		// 5. clone() << 오늘 배울 내용
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		
		System.out.println(p1 == p2); // false
		System.out.println(p1.equals(p2)); // true
		
		// [5. clone()]
		try {
			// Point p3 = (Point) p1.clone(); // clone()의 리턴자료형이 Object이므로 다운캐스팅
			Point p3 = p1.clone();
			System.out.println(p3);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
	} // main
	
} // Ex02 class

class Point extends Object implements Cloneable{
	int x;
	int y;
	
	public Point() { }
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Point) {
			Point p = (Point) obj; // 캐스팅연산자 써서 다운캐스팅.
			return this.x == p.x && this.y == p.y;
		} // if
		
		return false;
	}

	// jdk 1.5부터 공변반환타입이 추가됨
	// 오버라이딩 주의할 점: 부모클래스의 메소드의 리턴자료형, 매개변수, 예외 등등을 변경 X
	// 공변반환타입이 추가 -> 자식의 리턴자료형을 부모의 리턴자료형과 다르게 변경하는 것이 가능하다.
	@Override
	protected Point clone() throws CloneNotSupportedException {
		Point obj = null;
		obj = (Point) super.clone();
		return obj;
	}
	
	/*
	// CloneNotSupportedException: checked 예외
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = null;
		obj = super.clone();
		return obj;
	}
	*/
	
	@Override
	public String toString() {
		return String.format("(x=%d, y=%d)", x, y);
	}
	
}
