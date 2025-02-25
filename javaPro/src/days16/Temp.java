package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */

// [ 임시직 사원 클래스 ]
public class Temp extends Employee {

	// 필드: name, addr, tel, hiredate
	
	// 필드
	private int days; // 근무일수
	private int payOfDay; // 하루 일당
	
	// 생성자
	public Temp() {
		super();
		System.out.println("> Temp 디폴트 생성자 호출됨.");
	}
	
	public Temp(String name, String addr, String tel, String hiredate, int days, int payOfDay) {
		super(name, addr, tel, hiredate);
		this.days = days;
		this.payOfDay = payOfDay;
		System.out.println("> Temp 6 생성자 호출됨.");
	}

	// 사원 정보를 출력하는 메소드
	@Override
	public void dispEmpInfo() {
		super.dispEmpInfo();
		System.out.printf(", 근무일수: %d, 하루일당: %d\n", this.days, this.payOfDay);
	}
	
	// 급여 계산해서 반환하는 메소드
	public int getPay() {
		return this.days * this.payOfDay;
	}
	
} // Temp class
