package days17;

/**
 * @author 김예지
 * @date 2025. 2. 25.
 * @subject
 * @content
 */
public class Ex12 {

	public static void main(String[] args) {
		// [ has-a 관계 (소속관계) ]
		// days16.Car.java
		// days16.Engine.java
		
		// Engine 클래스을 인터페이스로 변경하면 어떤 장점들이 있을까?.. 
		// K사 엔진 생산
		// H사 엔진 생산
		// 10년 후
		// X사 엔진 생산
		
		Car car1 = new Car(new K_Engine());
		car1.setEngine(new X_Engine());
		
		Car car20000 = new Car(new K_Engine());
		
		Car mycar1 = new Car(new H_Engine());
		Car car30000 = new Car(new H_Engine());
		
		Car c = new Car(new X_Engine());
		
	} // main
	
}
