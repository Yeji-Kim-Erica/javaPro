package days14;
/**
 * @author 김예지
 * @date 2025. 2. 20.
 * @subject
 * @content
 */

// 신형자동차 클래스 선언
public class Car {

	// 멤버변수(객체의 속성) == 필드(field)
	String name; // 자동차 이름
	int speed; // 속도
	int wheelCount; // 바퀴수
	
	// 메소드(method) == 멤버함수(객체의 기능)
	public void dispCarInfo() {
		System.out.printf("> 차명:%s, 속도:%d \n", name, speed);
	}
	
}
