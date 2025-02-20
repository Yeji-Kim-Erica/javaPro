package days14;

// default(package) 접근지정자: 디폴트이기 때문에 아무것도 화면상으로는 적히지 않는다. (public 없이)
// default: 같은 패키지 내부에서만 사용(참조, 상속) 가능하다.

// public: 어디서든 사용 가능하다.
public class Person {
	// 필드
	public String name;
	public int age;
	
	// 메서드
	public void work() {
		System.out.println(name + "이/가 일한다.");
	}
	public void run() {
		System.out.println(name + "이/가 달린다.");
	}
	
}
