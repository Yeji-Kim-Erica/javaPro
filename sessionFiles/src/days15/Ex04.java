package days15;

import java.util.Date;
import java.util.Random;

/**
 * @author kenik
 * @date 2025. 2. 21. - 오후 12:12:04
 * @subject 
 * @content
 */
public class Ex04 {
	
	// 생성자(constructor) 
	Ex04(){
		
	}

	public static void main(String[] args) {
		/*
		 * [생성자(constructor)] p 220
		 * 1. 일종의 메서드이다.
		 * 2. 리턴자료형 X                 void X
		 * 3. 반드시 메서드명은 클래스명하고 동일하게 설정.
		 * 4. 매개변수 X 없는 생성자를 "디폴트생성자(default constructor)"라고 부른다
		 * 5. 생성자의 역할 : 필드 초기화
		 * 6.    "  가 호출시점 : 인위적으로 생성자를 호출할 수 없다.
		 *                        객체를 생성할 때만 자동으로 호출된다. 
		 * 7. 제한자(modifier)를 사용할 수 있다.
		 * 8. 생성자도 오버로딩이 가능한다.  ( 중복 선언 )
		 * 9. 생성자는 상속되지 않는다.
		 * 10. 생성자가 하나도 없는 경우에는 컴파일러가 자동으로 디폴트 생성자를 추가한다.                        
		 * */
		
		/* 1 + 2
		MyPoint p1 = new MyPoint();  // 1
		// x, y 필드 초기화          // 2
		p1.x = 10;
		p1.y = 20;
		*/
		
		// new MyPoint(); 
		 
		// The constructor MyPoint(int, int) is undefined
		// MyPoint p1 = new MyPoint(10, 20);
		
		MyPoint p1 = new MyPoint(10, 20);
		p1.dispMyPoint();
		
		
		// Random rnd = new Random(100); 
		
		/*
		Date d = new Date();
		d.setYear(2000-1900);   // getter, setter
		d.setMonth(10-1);
		*/
		Date d = new Date(2000-1900, 10-1, 1);
		System.out.println( d.toLocaleString() );

	} // main

} // class









