package days15;

/**
 * @author 김예지
 * @date 2025. 2. 21.
 * @subject
 * @content
 */
public class Person {

	// private: 해당 클래스 내에서만 참조 가능
	// 필드
	String name; // 이름
	private int age; // 나이
	private boolean gender; // 성별. 단축키로 getter setter: Alt + Shift + S

	// 생성자
	public Person(boolean g) {
		// super();
		// this.gender = gender;
		gender = g;
	}

	public Person(String name, int age, boolean gender) {
		// super();
		// [this의 3가지 용도 중 첫번째] 멤버를 가리킬 때의 this
		this(name, age);
		this.gender = gender;
		System.out.println("> Person 3 생성자 호출됨.");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("> Person 2 생성자 호출됨.");
	}

	public Person() {
		// [this의 3가지 용도 중 두번째] 생성자에서 또 다른 생성자를 호출할 때의 this
		this("익명", 1, true);
		// ↑ 줄여서 쓸 수 있음
//		this.name = "익명";
//		this.age = 1;
//		this.gender = true;

		System.out.println("> Person 0 디폴트 생성자 호출됨.");
	}

	// 메소드 역할: private 필드의 값을 생성. 얻어올 때 사용하는 메소드.
	// [ getter ] 값을 얻어옴
	public int getAge() {
		return age;
	}

	// [ setter ] 값을 설정
	// p1.setAge(20);
	public void setAge(int a) {
		if (a >= 0 && a <= 120) {
			age = a;
		} else {
			// 강제로 예외(오류)를 발생시키는 코딩
			throw new RuntimeException("[경고] 0~120의 나이를 입력!!!");
		}
	}

	// getGender boolean isGender()
	public boolean isGender() { // isGender만 있으면 -> 읽기 전용의 필드
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
