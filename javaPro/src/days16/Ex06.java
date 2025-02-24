package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		
		/* [ 클래스들 간의 2가지 관계 ]
		 	1. has-a 관계 (소속관계): 어떤 클래스가 다른 클래스의 부품으로 들어감
		 		예) Car 클래스
		 			ㄴ Engine 클래스
		 	2. is-a 관계 (상속관계):
		 */
		
		// 자동차 만들기
		
		// 생성자를 사용한 의존성 주입(DI)
		Engine k_engine = new Engine();
		Car car1 = new Car(k_engine);
		car1.speedUp(10);
		
		// Setter를 사용한 의존성 주입(DI)
		Engine h_engine = new Engine();
		car1.setEngine(h_engine);
		
		int speed = car1.getEngine().speed;
		System.out.println("현재 속도 : " + speed);
		
		// System 필드
		// 안에 PrintStream out; (has-a 관계)
		//	ㄴ 안에 printf(), println(), print()
		System.out.println();
		
		System.out.println("end");
	} // main
	
} // class
