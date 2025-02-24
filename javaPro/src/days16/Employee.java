package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */
// 사원이라면 공통적으로 가지고 있는 멤버들을 선언한 클래스
public class Employee {
	// 필드
	private String name; 	 // 사원명
	private String addr; 	 // 주소
	private String tel; 	 // 연락처
	private String hiredate; // 입사일자
	
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
		System.out.printf("사원명: %s, 주소: %s, 연락처: %s, 입사일자: %s",
						this.name, this.addr, this.tel, this.hiredate);
	}

}
