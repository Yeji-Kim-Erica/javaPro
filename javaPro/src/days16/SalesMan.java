package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */

// 최종(마지막)클래스 : 자식 클래스를 가질 수 없는 클래스
public final class SalesMan extends Regular {
	// 필드: name, addr, tel, hiredate, basepay를 물려받음
	// 생성자: 생성자는 상속되지 않음
	// 메소드: dispEmpInfo(), getPay()를 물려받음

	// 필드
	private int sales; // 판매량
	private int comm; // 하나 팔 때마다 받는 커미션

	// 생성자
	public SalesMan() {
		super();
		System.out.println("> SalesMan 디폴트 생성자 호출됨.");
	}

	public SalesMan(String name, String addr, String tel, String hiredate, int basePay, int sales, int comm) {
		super(name, addr, tel, hiredate, basePay);
		// super 키워드로 부모의 생성자를 호출해서 private로 선언된 부모의 필드를 초기화
		this.sales = sales;
		this.comm = comm;
		System.out.println("> SalesMan 7 생성자 호출됨.");
	}

	// 메소드
	@Override
	public int getPay() {
		return super.getPay() + this.sales * this.comm;
	}

	@Override
	public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본급:%d"
	                  + " 판매량=%d, 커미션=%d\n"
	                  ,this.getName(), this.getAddr(), this.getTel()
	                  , this.getHiredate(), this.getBasePay()
	                  , this.sales, this.comm);
	}
	
} // SalesMan class

/*
// The type SalesManTwo cannot subclass the final class SalesMan
class SalesManTwo extends SalesMan { // 자식 클래스를 가질 수 없는 최종(마지막)클래스
	
}
*/