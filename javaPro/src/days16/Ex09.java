package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// 자식객체를 생성하면
		// 먼저 부모객체를 생성한 후에 자식 객체가 생성된다.
		// (부모의 생성자함수가 먼저 호출되고 자식의 생성자 함수가 호출된다.)
		
		// super 키워드
		// ㄴ 정의: 자식클래스에서 부모클래스의 멤버를 참조하는 데 사용되는 참조변수
		// ㄴ 용도: 1) 부모의 멤버를 가리킬 때의 super
		//		   2) 생성자에서 또 다른 부모의 생성자를 호출할 때의 super()
		//		   3) 단독으로 사용되는 super (사용된 것을 본 적 없음. 거의 없다고 생각하기)
		
		// 자식 객체 c를 생성...
		Child c = new Child();
		
		System.out.println("end");
		
		
	} // main
	
} // class

// 모든 클래스의 최상위 부모클래스는 Object이다.
class Parent{ // extends Object
	// 필드
	int x = 10;
	// 생성자
	Parent() {
		System.out.println("> Parent 디폴트 생성자 호출됨.");
	}
	// 메소드
	void dispParent() {
		//
	}
	// final + 메소드 선언 : 자식 클래스에서 오버라이딩(재정의)할 수 없는 메소드
	public final void test() {
		System.out.println("> parent.test()...");
	}
}
	
class Child extends Parent{
	// int x = 10; 필드 상속
	// dispParent(){ } 상속
	// test(){ } 상속
	// 부모의 생성자는 상속되지 않음
	// 상속: 차를 물려받음. 호출: 차를 가끔 빌려탐
	
	// 부모에게 물려받은 필드가 존재하는 상태에서 똑같은 이름으로 x 선언 가능한가? Yes
	int x = 20;
	int y; // 새로 추가된 필드
	
	public Child() {
		super(); // 생략해도 컴파일러가 자동으로 자식객체 생성하기 전에 부모객체를 먼저 생성함(부모의 디폴트 생성자 호출). (생략 가능)
		System.out.println("> Child 디폴트 생성자 호출됨");
	}
	
	// 메소드
	void dispChild() {
		System.out.println( x ); // Child의 x
		System.out.println( this.x ); // Child의 x
		System.out.println( super.x ); // Parent의 x
	}
	
	@Override
	void dispParent() {
		System.out.println("새로 구현했다. (재정의)");
	}
	
	// Cannot override the final method from Parent
	/*
	@Override
	public final void test() {
		System.out.println("> parent.test()...");
	}
	*/
}
