package days15;

import java.util.Date;

/**
 * @author 김예지
 * @date 2025. 2. 21.
 * @subject
 * @content
 */
public class Ex04 {
	
	public Ex04() { // 생성자
		
	}

	public static void main(String[] args) {
		/*
		 [생성자(constructor)] p.220
		 1. 생성자는 일종의 메소드이다.
		 2. 리턴자료형이 없는 메소드라고 생각하면 된다. (리턴자료형이 없지만 void를 굳이 붙이지 않는다.)
		 3. 반드시 메소드명은 클래스명과 동일하게 설정해야 한다.
		 4. 디폴트 생성자 (default constructor): 매개변수가 없는 생성자
		 5. 생성자의 역할: 필드 초기화
		 6. 생성자가 호출되는 시점: 인위적으로 생성자를 호출할 수 없다.
		 						객체를 생성할 때만 자동으로 호출된다.
		 7. 제한자(modifier)를 사용할 수 있다.
		 8. 생성자도 오버로딩이 가능하다. (중복선언)
		 9. 생성자는 상속되지 않는다.
		 10. "생성자가 하나도 없는 경우"에는 컴파일러가 자동으로 디폴트 생성자를 추가한다.
		 */
		
		/*
		MyPoint p1 = new MyPoint(); // [1]
		// x, y 필드 초기화
		p1.x = 10; // [2]
		p1.y = 20; // [2]
		
		p1.dispMyPoint();
		*/
		
		// [1] [2]를 한번에
		// The constructor MyPoint(int, int) is undefined
		MyPoint p1 = new MyPoint(10, 20); // 객체가 생성될 때마다 반드시 생성자가 호출되기 때문에 ()를 붙인다.
		p1.dispMyPoint();
		
		/* 디폴트 생성자를 이용한 필드 초기화
		Date d = new Date();
		d.setYear(2000-1900); // getter, setter...
		d.setMonth(10-1);
		*/
		
		// 생성자를 이용한 필드초기화
		Date d = new Date(2000-1900, 10-1, 1);
		System.out.println(d.toLocaleString());
		
	} // main
	
} // class
