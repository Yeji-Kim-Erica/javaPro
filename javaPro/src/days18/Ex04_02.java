package days18;

import java.util.ArrayList;
import java.util.Collection;

import days16.Employee;
import days17.Car;
import days17.Engine;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject 익명 클래스를 사용하는 이유: 말그대로 한번만 사용하면 되는 클래스일 때! (자주 사용됨)
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// Car, Engine 내용과 관련
		// Y_Engine이 새롭게 개발됨. 테스트를 위해 잠깐 엔진을 넣어볼 예정.
		// Y_Engine -> Car
		/*
		Y_Engine engine = new Y_Engine();
		Car tCar = new Car(engine);
		// tCar.~~~
		tCar.speedDown(100);
		tCar.speedDown(10);
		tCar.stop();
		*/
		
		// 아직 이름도 정해지지 않은 시엔진을 한번만 넣어볼려고 할 때
		Car tCar = new Car(new Engine() { // Engine 타입의 익명클래스

			@Override
			public void moreFuel(int fuel) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void lessFuel(int fuel) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		// 2.
		Employee newTemp = new Employee() {
			
			@Override
			public int getPay() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		// 예)
//		ArrayList list = new ArrayList(new Collection<E>() {
//			// Collection 인터페이스의 익명클래스를 만들어서 바로 매개변수로 쓴 것
			// 익명클래스의 내용을 받은 참조변수가 살아있는 한 해당 익명클래스는 계속 사용됨.
			// 해당 객체/지역변수가 없어지면 가비지가 됨
//		});
		
		System.out.println(" end ");
		
	} // main

}

/*
class TempTwo extends Employee{

	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
*/

/*
class Y_Engine implements Engine {

	int speed;

	@Override
	public void moreFuel(int fuel) {
		speed += fuel * 0.05;
	}

	@Override
	public void lessFuel(int fuel) {
		speed -= fuel * 0.05;
	}

	@Override
	public void stop() {
		speed = 0;
	}

}
*/
