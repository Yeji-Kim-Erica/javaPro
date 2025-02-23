package days15;

/**
 * @author 김예지
 * @date 2025. 2. 21.
 * @subject
 * @content
 */
public class MyPoint {

	// 필드
	public int x; // 필드를 초기화하지 않으면 자료형의 기본값으로 초기화되어있다.
	public int y;
	
	// 디폴트 생성자 선언
	public MyPoint() {
		System.out.println("> MyPoint 디폴트 생성자 호출됨");
	}

	public MyPoint(int x, int y) {
		// 생성자 안에는 항상 필드를 초기화하는 코드가 들어간다.
		this.x = x;
		this.y = y;
	}
	
	// 메서드
	
	public MyPoint plusMyPoint(MyPoint p) { // [3] this가 단독으로(홀로) 사용될 때 this의 용도: 리턴값
		this.x += p.x;
		this.y += p.y;
		return this;
	}
	
	// p1.dispMyPoint();
	// p2.dispMyPoint();
	
	public void dispMyPoint() { // 좌표를 출력하는 메소드
		System.out.printf("> x=%d, y=%d\n", this.x, this.y);
		// 여기서의 x, y는 호출한 객체(p1 또는 p2)의 x, y이다.
	}

	// p1.offsetPoint(100);
	/*
	public void offsetPoint(int d) { // 기본형 매개변수 d
		x += d; // 이동할 거리 d
		y += d; // 이동할 거리 d
	}
	*/
	
	public MyPoint offsetPoint(int d) { // 기본형 매개변수 d, 참조형 리턴자료형
		MyPoint p = new MyPoint();
		p.x = x + d;
		p.y = y + d;
		
		return p;
	}

	// p1.offsetPoint(p2);
	// p1.x += p2.x;
	// p1.y += p2.y;
	public void offsetPoint(MyPoint p) { // 참조형 매개변수 p, 클래스 복사
		x += p.x;
		y += p.y;
	}

	// p1.plusPoint(10);
	public int plusPoint(int d) { // 기본형 리턴자료형
		return x + d;
	}
	
}
