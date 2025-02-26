package days18;

/**
 * @author kenik
 * @date 2025. 2. 26. - 오전 10:23:23
 * @subject 
 * @content
 */
public class Ex03_02 {
	
	// 1. 인스턴스 클래스 
	class InstanceClass{
		int iv = 100; // 인스턴스 변수 선언 O
		// The field cv cannot be declared static in
		// a non-static inner type, unless initialized 
		// with a constant expression
		// static int cv = 100; 클래스 변수 선언  X
		final static int COUNT = 100; // 상수 선언 O
	}
	
	// 2. 정적 클래스
	static class StaticInner{
		int iv = 100; // 인스턴스 변수 선언 O
		static int cv = 100; // 클래스 변수 선언 O
		final static int COUNT = 100; // 상수 선언 O
	}
	
	void method1() {
		
		// 3. 로컬 클래스
		class LocalInner{
			int iv = 100;// 인스턴스 변수 선언 O
			// static int cv = 100; // 클래스 변수 선언 X
			final static int COUNT = 100; // 상수 선언 O
		}
		
	}

	public static void main(String[] args) {

		// InstanceClass.COUNT;
//		StaticInner.COUNT;
//		StaticInner.cv;
		

	} // main

} // class
  