package days17;

import days16.Employee;
import days16.SalesMan;
import days16.Temp;

/**
 * @author 김예지
 * @date 2025. 2. 25.
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
//		Employee emp3 = new SalesMan("박지웅", "경기도 수원", "010-8732-9877", "2015.03.15", 500000, 20, 100000);
//		emp3.dispEmpInfo();
		// 출력결과
		/*
		 사원명:박지웅, 주소:경기도 수원, 연락처:010-8732-9877, 입사일자:2015.03.15, 기본급:500000 판매량=20, 커미션=100000
		 */
		// 확인[1] 업캐스팅을 해도 실제 영업직 사원 객체의 사원정보를 출력하는 dispEmpInfo() 메소드가 호출된다.
		// 확인[2] emp3.getPay(); 는 불가하다
		
		Temp emp4 = new Temp("안준호", "서울 강북", "010-4334-3894", "2022.02.12", 15, 200000);
		emp4.dispEmpInfo();
		// 출력결과
		/*
		 사원명: 안준호, 주소: 서울 강북, 연락처: 010-4334-3894, 입사일자: 2022.02.12, 근무일수: 15, 하루일당: 200000
		 */
		
		
	} // main
	
	
} // class
