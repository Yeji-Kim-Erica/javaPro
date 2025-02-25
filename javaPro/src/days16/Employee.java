package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */
// 사원이라면 "공통적으로 가지고 있는 멤버들을 선언"한 클래스
// 추상클래스: 객체를 생성할 수 없는 클래스
// 미완성된 == abstract
// 클래스와 메소드에서만 abstract를 사용
public abstract class Employee {
	// 필드
	private String name; // 사원명
	private String addr; // 주소
	private String tel; // 연락처
	private String hiredate; // 입사일자

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
		System.out.printf("사원명: %s, 주소: %s, 연락처: %s, 입사일자: %s", this.name, this.addr, this.tel, this.hiredate);
	}

	// 가상 메소드: 어차피 뒤에서 오버라이딩 해야돼서 형식만 만들어두는 메소드
//	public virtual(자바에서는 이 단어는 안씀) int getPay() {
//		return 0;
//	}
	
	// {} 몸체(body)가 없는 함수 원형(prototype)만 존재하는 메소드
	// 불완전한 메소드: 추상메소드라고 부름
//	public int getPay(); // This method requires a body instead of a semicolon
//	public abstract int getPay(); // The abstract method getPay in type Employee can only be defined by an abstract class
	public abstract int getPay();

}
