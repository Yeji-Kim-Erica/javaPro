package days18;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject
 * @content
 */
public class Ex03_02 {

	// 1. 내부클래스 - 인스턴스 클래스
	class InstanceClass{
		int iv = 100; // 인스턴스 클래스 안에 인스턴스 변수를 선언 가능
		// The field cv cannot be declared static in a non-static inner type,
		// unless initialized with a constant expression
		// static int cv = 100; // 인스턴스 클래스 안에 클래스 변수 선언 불가능
		final static int COUNT = 100; // 하지만 인스턴스 클래스 안에 상수는 선언이 가능
	
	}
	
	// 2. 내부클래스 - 정적 클래스
	static class StaticInner{
		int iv = 100; // 인스턴스 변수 선언 가능
		static int cv = 100; // 클래스 변수 선언 가능
		final static int COUNT = 100; // 상수 선언 가능
	}
	
	void method1() {
		
		// 3. 내부클래스 - 로컬 클래스
		class LocalInner{
			int iv = 100; // 인스턴스 변수 선언 가능
			// static int cv = 100; // 클래스 변수 선언 불가능
			final static int COUNT = 100; // 상수 선언 가능
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(InstanceClass.COUNT);
		System.out.println(StaticInner.COUNT);
		System.out.println(StaticInner.cv);
		
	} // main
	
}
