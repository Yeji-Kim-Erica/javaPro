package days18;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		/*[내부(inner) 클래스]
		 	1. 사용빈도가 거의 없다. 개념 정도만 이해하자.
		 	2. 중첩클래스
		 	3. AWT, Swing과 같은 GUI 애플리케이션(윈도우 애플리케이션)에서
		 	   이벤트를 처리할 목적으로 자주 사용한다.
		 	   (자바로 만드는 경우 거의 없음. visual basic 쓰면 간단하기 때문)
		 	4. 내부클래스의 종류와 특징: 선언 위치에 따라 종류가 나뉨
		 		1) 인스턴스 클래스: 외부클래스의 필드 위치에 선언
		 		2) 정적(static) 클래스: 외부클래스의 필드 위치에 선언
		 		3) 지역(local) 클래스: 외부클래스의 메소드 안이나 초기화 블럭 안에 선언
		 		4) 익명==무명(Anonymous) 클래스
		 			- 클래스의 선언 부분 + 객체 생성 (선언과 동시에 객체가 생성)
		 			- 두 기능이 합쳐진 이름 없는 클래스
		 			- 일회용으로 쓰임
		 */
		
		
		
	} // main
	
} // Ex03 class

/*
class Engine{
	
}
class Car{
	// has-a 관계
	private Engine engine;
}

class Ship{
	private Engine engine;
}
*/

class Car{ // 외부클래스
	
	class Engine{ // 내부클래스 중 인스턴스 클래스: 다른 클래스에서는 해당클래스를 쓸 일이 없을 때
		
	}
	
}

class Outer{
	// 필드
	int iv = 0; // 인스턴스 변수
	static int ic = 0; // 클래스 변수
	class InstanceClass{ // 인스턴스 클래스
		// 주로 외부클래스의 인스턴스멤버들과 관련된 작업을 더 용이하게 하기 위한 목적
		// 다른 클래스에서는 해당클래스를 쓸 일이 없을 때 사용
	}
	
	static class StaticClass{ // 정적(static) 클래스
		// 주로 외부클래스의 static멤버들과 관련된 작업을 더 용이하게 하기 위한 목적
		// 마치 static 멤버처럼 사용된다.
	}
	
	{ // 인스턴스 초기화 블럭
		class LocalClass{ // 지역(local) 클래스
			
		}
	}
	// 메서드
	void disp() {
		
		class LocalClass{ // 지역(local) 클래스
			// 지역변수처럼, 해당 지역(영역)에서만 사용되는 클래스
		}
		
	}

	// 생성자
}
