package days14;

/**
 * @author 김예지
 * @date 2025. 2. 20.
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		Car car = null;
		car = new Car();
		
		dispCar(car);
		dispCar(new Car()); // 이렇게 하면 main 함수 안에서는 이 인스턴스를 다시 사용할 일이 없다는 것. (다시 참조 불가능)
		
	} // main

	private static void dispCar(Car car) {
		car.dispCarInfo();
	}
	
	
	
}
