package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */

// 정규직 사원 클래스
public class Regular extends Employee {
	// 필드 - name, addr, tel, hiredate 상속
	// 메소드 dispEmpInfo() 상속
	// 생성자 상속 X

	// 필드
	private int basePay; // 기본급

	// getter, setter
	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	// 생성자
	public Regular() {
		super();
		System.out.println("> Regular 디폴트 생성자 호출됨.");
	}

	public Regular(String name, String addr, String tel, String hiredate, int basePay) {
		super(name, addr, tel, hiredate);
		// super 키워드로 부모의 생성자를 호출해서 private로 선언된 부모의 필드를 초기화
		
		this.basePay = basePay;
		System.out.println("> Regular 5 생성자 호출됨.");
	}
	
	// 메소드
	// Employee 클래스에는 없는 급여 계산하는 메소드를 추가
	public int getPay() {
		return this.basePay; // 정규직은 기본급
	}

	@Override
	public void dispEmpInfo() {
		super.dispEmpInfo();
		System.out.printf(", 급여: %,d원", this.basePay);
	}

}
