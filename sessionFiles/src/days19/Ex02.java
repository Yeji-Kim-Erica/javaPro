package days19;

/**
 * @author kenik
 * @date 2025. 2. 27. - 오전 9:30:47
 * @subject 
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// Object의 메소드
		// 1. hashCode()
		// 2. getClass()
		// 3. toString()  오버라이딩.
		// 4. equals()    오버라이딩.
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		
		System.out.println( p1 == p2 );      // false
		System.out.println( p1.equals(p2) ); // true
		
		// [ 5. clone() ]		
		// Type mismatch: cannot convert from Object to Point
		try {
			// Point p3 = (Point) p1.clone();  // 다운캐스팅
			Point p3 = p1.clone();  // 다운캐스팅 X
			System.out.println( p3 );
		} catch (CloneNotSupportedException e) { 
			e.printStackTrace();
		}
		

	} // main

} // class

class Point extends Object implements Cloneable{
	
	int x;
	int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// p1.equals(p2)
	@Override
	public boolean equals(Object obj) {
		
		if (obj != null && obj instanceof Point) {
			Point p = (Point)obj;
			return this.x == p.x && this.y == p.y;
		} // if
		
		return false;
	}
	
	/*
	// CloneNotSupportedException  "checked예외"
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = null; 
		obj = super.clone(); 
		return obj;
	}
	*/
	
	// 10:02 수업 시작~
	// jdk1.5 부터 '공변 반환 타입' 추가
	// 오버라이딩 주의할점 - 부모의 리턴자료형, 매개변수, 예외 등등
	// 부모리턴자료형 -> 자식리턴자료형 변경...
	@Override
	protected Point clone() throws CloneNotSupportedException {
		Point obj = null; 
		obj = (Point) super.clone(); 
		return obj;
	}
	
	// days19.Point@16진수hashcode
	@Override
	public String toString() {
		return String.format("(x=%d,y=%d)", this.x, this.y);
	}
	
	
	
}






  