package days17;

import days16.*;

/**
 * @author 김예지
 * @date 2025. 2. 25.
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		
		// Employee emp1 = new Employee("권태정", "서울시 강남구", "010-1234-1234", "2020.01.01"); // 다운캐스팅 불가
		Employee emp1 = new Regular("김도훈", "서울시 당산동", "010-1111-2222", "2018.12.12", 3000000); // 다운캐스팅 가능
		emp1.dispEmpInfo();
		
		// Type mismatch: cannot convert from Employee to Regular
		// 클래스들 간의 형변환 - 업캐스팅(자동), 다운캐스팅(강제)
		// (변환하고자하는 자료형) cast 연산자로 강제 형변환
		// 업캐스팅을 했던 클래스만 다시 다운캐스팅을 할 수 있음
		Regular emp2 = (Regular) emp1;
		
		System.out.println("end");
		
	} // main
	
}
