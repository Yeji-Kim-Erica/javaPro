package days16;

// 사원이라면 "공통적으로 가지고 있는 멤버들"을 선언한 클래스
// 추상클래스 : 객체를 생성할 수 없는 클래스
// 미완성된 == abstract
public abstract class Employee extends Object{

	// 필드
	private String name;  		// 사원명
	private String addr; 		// 주소
	private String tel; 		// 연락처
	private String hiredate; 	// 입사일자
	
	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	// 생성자
	public Employee() {
		super();
		System.out.println("> Employee 디폴트 생성자 호출됨.");
	}
	public Employee(String name, String addr, String tel, String hiredate) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("> Employee 4 생성자 호출됨.");
	}
	
	// 메소드
	public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s\n"
				, this.name, this.addr, this.tel, this.hiredate);
	}
	
	/*
	// 가상 메소드	
	public virtual int getPay() {
		return 0;		
	}
	*/
	
	// {} 몸체(body) 가 없는 함수 원형(prototype)만 있는 메서드
	// 불완전한 메소드 : 추상메소드
	// This method requires a body instead of a semicolon
	// The abstract method getPay in type Employee can only be defined by an abstract class
	public abstract int getPay() ;
}
