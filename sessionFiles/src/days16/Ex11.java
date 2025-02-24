package days16;

/**
 * @author kenik
 * @date 2025. 2. 24. - 오후 4:48:09
 * @subject 
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {  
		/*
		[ 상속 계층도 ]
		
		         Object            모든 클래스의 최상위 부모 클래스이다. 
		           ↑                
                Employee           
          ↑                  ↑
        Regular             Temp
          ↑
       SalesMan
       
       1. 상속성 정리
       2. 다형성 / 인터페이스
       3. 업캐스팅/ 다운캐스팅
       4. 오버로딩/ 오버라이딩
       5. 추상화(추상메소드, 추상클래스)
       6. this, super 키워드 설명
       7. final 키워드 설명.
       등등
       
       */   

		/*
		// 5:03 수업 시작~~ 
		// 1. 사원 객체 생성 후 사원정보 출력 메소드 호출
		Employee emp1 = new Employee("권태정", "서울시 강남구", "010-1234-1234", "2020.01.01");
		emp1.dispEmpInfo();
		*/
		
		// 2. 정규직 사원 객체 생성 + 호출
		/*
		Regular emp2 = new Regular("김도훈", "서울시 당산동", "010-1272-2322", "2018.12.12", 3000000);
		// System.out.printf("%,d원\n", emp2.getPay() ); // 3,000,000원
		emp2.dispEmpInfo();  // 급여정보가 출력 X -> Regular 클래스에서 오버라이딩.
		syso( emp2.getPay() );
		*/
		
		// int i = (int)100L;
		
		// [클래스들간의 형변환]
		// 자동 업캐스팅(upcasting) : 자식객체 생성 -> 부모클래스에 참조
		// Regular -> 자동 Employee 클래스 간에 형변환
		Employee emp2 = new Regular("김도훈", "서울시 당산동", "010-1272-2322", "2018.12.12", 3000000);
		emp2.dispEmpInfo();
		// emp2.getPay(); 문제점 파악..
				
	} // main

} // class









