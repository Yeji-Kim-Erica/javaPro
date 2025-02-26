package days18;

import java.util.ArrayList;
import java.util.Collection;

import days16.Employee;
import days17.Car;
import days17.Engine;

/**
 * @author kenik
 * @date 2025. 2. 26. - 오전 11:24:33
 * @subject 
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		/*
		// Y_Engine -> Car 
		Y_Engine engine = new Y_Engine();
		Car tCar = new Car(engine);
		// tCar.~~~
		tCar.speedDown(100);
		tCar.speedDown(10);
		tCar.stop();
		*/
		
		Car tCar = new Car( new Engine() {

			@Override
			public void moreFuel(int fuel) { 
			}

			@Override
			public void lessFuel(int fuel) { 
			}

			@Override
			public void stop() { 
			}
			
		});
		
		
		// 2. 
		Employee newTemp = new Employee() {			
			@Override
			public int getPay() {
				return 0;
			}
		};
		
		// 예)
//		ArrayList list = new ArrayList(new Collection() {
//		}); 
		
		// 그러면 익명 클래스는 생성되고 나서 거의 바로 
		// 가비지가 되는 건가요?
		
		System.out.println(" end ");
		

	} // main

} // class

/*
class TempTwo extends Employee{

	@Override
	public int getPay() {
		return 0;
	}
	
}
*/
/*
class Y_Engine implements Engine{
    int speed;
	
	@Override
	public void moreFuel(int fuel) {
		speed += fuel * 0.5;
	}

	@Override
	public void lessFuel(int fuel) {
		speed -= fuel * 0.5;
	}

	@Override
	public void stop() {
		 speed = 0;
	}
	
}
*/

