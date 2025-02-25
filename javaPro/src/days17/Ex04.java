package days17;

import days16.Employee;
import days16.Regular;
import days16.SalesMan;
import days16.Temp;

/**
 * @author 김예지
 * @date 2025. 2. 25.
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		/*
		Employee emp1 = new Employee("권태정", "서울시 강남구", "010-1234-1234", "2020.01.01");
		Regular emp2 = new Regular("김도훈", "서울시 당산동", "010-1111-2222", "2018.12.12", 3000000);
		SalesMan emp3 = new SalesMan("박지웅", "경기도 수원", "010-8732-9877", "2015.03.15", 500000, 20, 100000);
		Temp emp4 = new Temp("안준호", "서울 강북", "010-4334-3894", "2022.02.12", 15, 200000);
		*/
		
		// 클래스 배열 초기화
		Employee[] emps = {
//				new Employee("권태정", "서울시 강남구", "010-1234-1234", "2020.01.01"),
				new Regular("김도훈", "서울시 당산동", "010-1111-2222", "2018.12.12", 3000000),
				new SalesMan("박지웅", "경기도 수원", "010-8732-9877", "2015.03.15", 500000, 20, 100000),
				new Temp("안준호", "서울 강북", "010-4334-3894", "2022.02.12", 15, 200000)
		};
		
		/*
		for (int i = 0; i < emps.length; i++) {
			사원정보출력메소드(emps[i]);
		} // for i
		*/
		사원정보출력메소드(emps[1]);
		
		/* [ 다형성(polymorphism) ]
		 1. 다양한 성질
		 2. 여러 가지 형태(Type)를 가질 수 있는 능력
		 3. 업캐스팅
		 	: 자식 객체를 생성해서 부모클래스 타입으로 참조할 수 있는 것
		 4. 상속관계
		 */
		
	} // main

	private static void 사원정보출력메소드(Employee emp) { // 매개변수의 다형성
		// 연산자 instanceof
		if (emp instanceof SalesMan) {
			// 다운캐스팅
			SalesMan s1 = (SalesMan) emp;
			s1.getPay();
			System.out.println("타입이 SalesMan 이다.");
		} else if (emp instanceof Regular) {
			System.out.println("타입이 Regular 이다.");
		} else if (emp instanceof Temp) {
			System.out.println("타입이 Temp 이다.");
		} else if (emp instanceof Employee) {
			System.out.println("타입이 Employee 이다.");
		}
		// 출력결과
		// 타입이 SalesMan 이다.
		
		// 연산자 instanceof 주의할 점 (범위 작->큰 순으로, elseif 써야 함. 아니면 이렇게 됨)
		/*
		if (emp instanceof Employee) {
			System.out.println("타입이 Employee 이다.");
		}
		if (emp instanceof Regular) {
			System.out.println("타입이 Regular 이다.");
		}
		if (emp instanceof SalesMan) {
			System.out.println("타입이 SalesMan 이다.");
		}
		if (emp instanceof Temp) {
			System.out.println("타입이 Temp 이다.");
		}
		// 출력결과
		
//		 	타입이 Employee 이다.
//			타입이 Regular 이다.
//			타입이 SalesMan 이다.
		 // 결과가 셋 다 나와버림
		*/
		
		// 매개변수 Employee emp = 실제 R/S/T 업캐스팅 되어져서 전달
		emp.dispEmpInfo();							   // Employee emp = new Regular()
	}												   // Employee emp = new SalesMan()
													   // Employee emp = new Temp()
	
	// 화장실 다녀오세요 -> 알아서 여자는 여자화장실, 남자는 남자화장실
	// 도형의 면적을 구하세요 -> 알아서 원은 원의 면적, 삼각형은 삼각형의 면적, 사각형은 사각형의 면적
	
	/*
	// 오버로딩
	private static void 사원정보출력메소드(Employee emp) {
		emp.dispEmpInfo();
	}

	private static void 사원정보출력메소드(Regular emp) {
		emp.dispEmpInfo();
	}

	private static void 사원정보출력메소드(SalesMan emp) {
		emp.dispEmpInfo();
	}

	private static void 사원정보출력메소드(Temp emp) {
		emp.dispEmpInfo();
	}
	*/

} // class
