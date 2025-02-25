package days17;

import days16.Employee;
import days16.Temp;

/**
 * @author kenik
 * @date 2025. 2. 25. - 오전 10:25:31
 * @subject 
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		/*  3. 영업직(SalesMan) 객체 생성
		Employee emp3 = new SalesMan("박지웅", "경기도 수원", "010-8732-9877", "2015.03.15", 500000, 20, 100000);
		// 1. 확인 : 업캐스팅을 해도 
		//          실제 영업직 사원 객체의 사원정보출력하는 dispEmpInfo()
		//          메소드가 호출된다. 
		emp3.dispEmpInfo();
		// emp3.getPay();  X 문제점 파악.
		 */

		// 4. 임시직(Temp) 객체 생성
		Employee emp4  = new Temp("안준호", "서울 강북", "010-4334-3894", "2022.02.12", 15, 200000);
		emp4.dispEmpInfo();

	} // main

} // class
