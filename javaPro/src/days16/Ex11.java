package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */
public class Ex11 {
	/* [상속 계층도]
	 * 
		    Object            모든 클래스의 최상위 부모 클래스이다. 
	       	  ↑                
	       Employee           
	   ↑                 ↑
	Regular             Temp
	   ↑
	SalesMan  
	
	1. 상속성 정리
	2. 다형성/인터페이스
	3. 업캐스팅, 다운캐스팅
	4. 오버로딩/오버라이딩
	5. 추상화 (추상메소드, 추상클래스)
	6. this, super 키워드 설명
	7. final 키워드 설명
	등등
	
	 */
	
	public static void main(String[] args) {
		
		// [1] 사원 객체 생성 후 사원 정보를 출력하는 메소드 호출
//		Employee emp1 = new Employee("권태정", "서울시 강남구", "010-1234-1234", "2020.01.01");
//		emp1.dispEmpInfo();
		
		// [2] 정규직 사원 객체 생성 + 호출
//		Regular emp2 = new Regular("김도훈", "서울시 당산동", "010-1111-2222", "2018.12.12", 3000000);
//		System.out.printf("%,d원", emp2.getPay()); // 3,000,000원
//		emp2.dispEmpInfo(); // Regular 클래스에서 오버라이딩
		
		// 
		// int i = (int) 100L;
		// [클래스들 간의 형변환]
		// 자동 업캐스팅(upcasting) : 자식객체를 생성해서 부모클래스에 참조
		// Regular 클래스에서 자동으로 Employee 클래스로. 클래스 간의 형변환이 일어난 상태
		Employee emp2 = new Regular("김도훈", "서울시 당산동", "010-1111-2222", "2018.12.12", 3000000);
		emp2.dispEmpInfo(); // 급여정보까지 문제없이 나옴.
		// 자식객체를 생성하고 부모객체를 참조시킨 뒤 오버라이딩한 메소드를 사용하면 자식객체의 내용이 나옴
		// emp2.getPay(); // The method getPay() is undefined for the type Employee 호출 불가
		
	} // main

} // class
