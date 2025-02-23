package days15;

public class MyPoint {
	
	// 필드
	// 필드를 초기화하지 않으면 자료형의 기본값으로 초기화되어져 있다. 
	public int x = 0;
	public int y;
	 
	// 디폴트 생성자 선언 
	public MyPoint() {
		System.out.println("> MyPoint 디폴트 생성자 호출됨.");
	}  
	
	public MyPoint(int x, int y) {
		// 필드 초기화 코딩...
		this.x = x;
		this.y = y;
	}
	

	// 메서드
	// p1.plusMyPoint(                 p2 );
	public MyPoint plusMyPoint(MyPoint p) { // 클래스 복사
		this.x += p.x;
		this.y += p.y;
		return this; // [this 3 용도] 
	}
	 
	// p1.dispMyPoint();
	// p2.dispMyPoint();
	public void dispMyPoint() {
		System.out.printf("> x=%d, y=%d\n", this.x , this.y); // 호출객체.x, 호출객체.y
	}

	// Duplicate method offsetPoint(int) in type MyPoint
	// p2.offsetPoint(100)
	/*
	public void offsetPoint(int d) { // 기본형 매개변수
		x += d;
		y += d;
	}
	*/
	
	// 10, 20
	// p1.offsetPoint(100);
	public MyPoint offsetPoint(int d) { // 참조형 리턴자료형
		//x += d;
		//y += d;
		
		MyPoint p = new MyPoint();  // 110, 120
		p.x = x + d;
		p.y = y + d;
		
		return p;
	}
	
	// p1.offsetPoint(           p2  );
	// p1.x = p1.x + p2.x
	// p1.y = p1.y + p2.y
	public void offsetPoint(MyPoint p) { // 참조형 매개변수, 클래스 복사
		x += p.x;
		y += p.y;
	}

	// p1.plusPointX(10)
	public int plusPointX(int d) {   // 기본형 리턴자료형
		return x + d;
	}

} // class
