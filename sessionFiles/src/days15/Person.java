package days15;

public class Person {
	
	// 필드
	// private : 해당 클래스 내에서만 참조 가능.
	String name; // 이름
	private int age;  // 나이
 	private boolean gender;  // 성별  Alt + Shift + S
 	
 	// 생성자 
 	public Person(boolean g) {
 		//super();
 		//this.gender = gender;
 		gender = g;
 	}	
 	
 	public Person() {
 	    // [ this의 두 번째 용도 ]  생성자에서 또 다른 생성자를 호출 할 때의 this
 		this("익명", 1, true);
// 		this.name = "익명";
// 		this.age = 1;
// 		this.gender = true;
 		
 		System.out.println("> Person 0 디폴트 생성자 호출됨.");
 	}
 	
 	public Person(String name, int age) { 
		this.name = name;
		this.age = age; 
		System.out.println("> Person 2 생성자 호출됨.");
	}
 	
	public Person(String name, int age, boolean gender) {
		this(name, age);
		// super();
		// [ this의 첫 번째 용도 ]  멤버를 가리킬 때의 this
		// this.name = name;
		// The assignment to variable name has no effect
		//this.name = name;
		//this.age = age;
		this.gender = gender;
		System.out.println("> Person 3 생성자 호출됨.");
	}

	// 메소드 역할 : private 필드의 값을 설정.얻어올 때사용 하는 메서드
 	// [ getter ]
	public int getAge() {
		return age;
	}
	// [ setter ]
	// p1.setAge(20)
	public void setAge(int a) {
		if ( a >= 0 && a <= 120) {
		   age = a;
		}else {
			// 강제로 예외(오류)를 발생 코딩.
			throw new RuntimeException("[경고] 0~120의 나이를 입력!!!");
		}
	}
	
	// getGender  boolean isGender()
	// 읽기 전용의 필드 
	public boolean isGender() {
		return gender;
	}

	/*
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	*/

}
