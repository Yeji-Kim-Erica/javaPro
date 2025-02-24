package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		/* [변수의 초기화 설명]
		 	1. 변수 (변수와 상수)
		 	2. 변수의 종류 3가지 (클래스, 인스턴스, 지역)
		 	3. 변수의 초기화: 변수를 선언하고 처음으로 값을 할당(대입)하는 것.
		 	4. 지역변수는 반드시 초기화를 해야 사용할 수 있음.
		 		ㄴ 인스턴스 변수, 클래스 변수는 초기화하지 않으면
		 			각 자료형의 기본값으로 초기화되어 있다.
		 	5. 필드의 초기화 방법 << 이번에 할 내용
		 		1) 명시적 초기화: 클래스 선언 시 바로 초기값을 할당하는 것
		 		2) 생성자 초기화: 생성자 안에서 초기값을 할당하는 것
		 		3) 초기화 블럭 사용: 
		 		순서: 명시적 초기화 → 생성자 초기화
		 		☞ 홍길동이 아니라 무명으로 뜨는 이유
		 		
		 		클래스 변수의 초기화 순서: 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭
		 		인스턴스 변수의 초기화 순서: 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자
		 */
		
		Member m1 = new Member();
		System.out.println(m1.name);
		System.out.println(m1.age);
		
		Member m2 = new Member();
		System.out.println(m2.name);
		System.out.println(m2.age);
		
		System.out.println(m2.rate);
		
	} // main
	
} // main class

class Member{
	// 필드
	
	// ㄱ. 인스턴스 변수
	String name = "홍길동"; // [1] 명시적 초기화
	int age = 20; // 명시적 초기화
	int count;
	int serialNumber;
	
	// ㄴ. 클래스 변수
	static double rate = 0.04; // 명시적 초기화
	
	// 생성자가 오버로딩 되어있을 때 중복 코딩이 있다면 초기화 블럭 사용 (ex: count++, serialNumber = count)
	// [인스턴스 초기화 블럭]
	// 	ㄴ 객체가 생성될 때마다 매번 실행
	{
		count++;
		serialNumber = count;
		System.out.println("> 인스턴스 초기화 블럭");
	}
	
	// [클래스 초기화 블럭]
	//	ㄴ 일괄적으로 클래스 변수를 초기화하기 위한 목적으로 사용
	static {
		rate = 0.07;
		System.out.println("> 클래스 초기화 블럭");
	}
	
	// 생성자
	Member(){ // [2] 생성자 초기화
//		count++;
//		serialNumber = count;
		name = "무명";
		System.out.println("> Member 디폴트 생성자 호출됨");
	}
	
	Member(String name){
//		count++;
//		serialNumber = count;
		this.name = name;
		System.out.println("> Member 1 생성자 호출됨");
	}
	
} // Member class

/* 인스턴스 초기화 블럭과 디폴트 생산자는 매번 호출되지만 클래스 초기화 블럭은 한번만 실행된다는 것을 알 수 있음.
	 	> 클래스 초기화 블럭
		> 인스턴스 초기화 블럭
		> Member 디폴트 생성자 호출됨
		무명
		20
		> 인스턴스 초기화 블럭
		> Member 디폴트 생성자 호출됨
		무명
		20
		0.07
		
 */





