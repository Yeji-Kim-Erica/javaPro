package days18;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject 03_03과 03_04의 차이 확인해볼것!!!
 * @content 외부클래스에서 내부클래스 선언
 */
public class Ex03_03 { // 외부클래스

	class InstanceInner{} // 1.
	static class StaticInner{} // 2.
	
	// 외부의 인스턴스 멤버 간에 서로 직접 접근 가능하다.
	InstanceInner ii = new InstanceInner();
	// 외부의 static 필드 선언
	static StaticInner si = new StaticInner();
	
	// 인스턴스 메서드
	void method01() {
		
		class LocalInner{} // 3. 로컬 클래스
		
		// 로컬 클래스 외부에서도 로컬클래스를 쓰고 싶다면?
		LocalInner li = new LocalInner();
		
		// 인스턴스 메소드 안에서 1. 2. 사용하려면
		InstanceInner ii = new InstanceInner();
		StaticInner si = new StaticInner();
	}
	
	// static 메서드
	static void method02() {
		// LocalInner li = new LocalInner(); 불가능
		StaticInner si = new StaticInner(); // 가능
		
		// InstanceInner ii = new InstanceInner();
		// No enclosing instance of type Ex03_03 is accessible.
		// Must qualify the allocation with an enclosing instance of type Ex03_03
		// (e.g. x.new A() where x is an instance of Ex03_03).
		
		// 인스턴스 클래스를 static 메서드에서 사용하려면 외부 클래스 객체를 생성 후 사용 가능하다.
		Ex03_03 outer = new Ex03_03();
		InstanceInner ii = outer.new InstanceInner();
	}
	
	public static void main(String[] args) {
		
		
		
	} // main
	
} // Ex03_03 class
