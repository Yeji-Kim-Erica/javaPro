package days18;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject 완전히 다른 클래스에서 내부클래스의 멤버에 접근하는 방법
 * @content
 */
public class Ex03_05 {

	public static void main(String[] args) {
	
		// 인스턴스 클래스 내부 변수 접근
		Outer2 outer = new Outer2();
		Outer2.InstanceInner ii = outer.new InstanceInner();
		ii.a = 100;
		System.out.println(ii.a);
		
		// 정적 클래스 내부 변수 접근
		// [1]
		System.out.println(Outer2.StaticInner.c);
		// [2]
		Outer2.StaticInner si = new Outer2.StaticInner();
		si.b = 200;
		System.out.println(si.b);
		
	} // main
	
} // class

class Outer2{ // 외부클래스
	static int x = 100;
	
	class InstanceInner{ // 1.
		int a = 10; // a를 다른 외부클래스에서 사용하는 법
	}
	
	static class StaticInner{ // 2.
		int b= 20; // b
		static int c = 30; // c
	}
	
	void method01() {
		
		class LocalInner{ // 3.
			int iv = 40;
		}
		
	}
	
}