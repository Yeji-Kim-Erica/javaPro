package days16;

// 사원이라면 "공통적으로 가지고 있는 멤버들"을 선언한 클래스
public class Employee extends Object{

	// 필드
	private String name;  		// 사원명
	private String addr; 		// 주소
	private String tel; 		// 연락처
	private String hiredate; 	// 입사일자
	
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
	
}
