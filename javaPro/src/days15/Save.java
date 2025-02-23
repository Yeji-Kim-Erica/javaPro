package days15;

/**
 * @author 김예지
 * @date 2025. 2. 21.
 * @subject
 * @content
 */

// 저축과 관련된 클래스
public class Save {

	// 필드
	// 인스턴스 변수(필드)
	private String name; // 예금주
	private int money; // 예금액
	
	// 클래스(static) 변수 또는 필드
	// 모든 인스턴스가 공유해서 사용하기 때문에 공유변수(shared)라고 불리기도 한다. 불리는 또 다른 이름은 정적(static)변수다.
	// static으로 클래스 변수를 선언하면, 클래스가 만들어질 때 클래스 로더에 의해 이 rate라는 기억공간은 올라가있다.
	// 클래스 하나 당 하나
	private static double rate = 0.04; // 이자율
	
	
	// 생성자 (Alt + Shift + S)
	public Save() { } // 디폴트 생성자
	
	public Save(String name, int money, double rate) { // 매개변수가 3개인 생성자
		this.name = name;
		this.money = money;
		this.rate = rate;
	}
	
	// 인스턴스 메소드: 인스턴스가 생성되어야 사용할 수 있는 메소드
	// 인스턴스가 한번 이상 생성되어야 메모리에 올라가서 사용이 가능함.
	// 객체를 생성 안하면 사용이 불가
	
	public void printSave() {
		System.out.printf("> 예금주:%s, 예금액:%d, 이자율:%.2f\n"
	            , this.name, this.money, this.rate);
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 클래스 메소드 (= static 메소드 = 정적 메소드)
	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		// Cannot use this in a static context
		Save.rate = rate; // 클래스명.클래스멤버명을 사용해야 함. this는 사용불가 (아직 객체 생성 안돼서 this에 들어갈 주소값 없음)
	}
	
	
} // class
