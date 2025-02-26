package days18;

/**
 * @author kenik
 * @date 2025. 2. 26. - 오전 11:08:45
 * @subject   외부클래스 > 내부 클래스 선언
 * @content   
 *            -> 완전히 다른 클래스에서 내부클래스의 멤버를 접근하는 방법
 */
public class Ex03_05 {

	public static void main(String[] args) {
		// 
		Outer2 outer = new Outer2();
		Outer2.InstanceInner ii = outer.new InstanceInner();
		ii.a = 100;
		System.out.println( ii.a );
		// 
		System.out.println( Outer2.StaticInner.c ); 
		Outer2.StaticInner si = new Outer2.StaticInner();
		si.b = 200;
		System.out.println( si.b ); 
		
	}

}

class Outer2{  // 외부 클래스 
	
	static int x = 100;
	
	class InstanceInner{  // 1.
		int a = 10;  // a
	}
	
	static class StaticInner{ // 2.
		int b = 20;  // b
		static int c = 30; // c
	}
	
	void method01() {
		
		class LocalInner{ // 3.
			int iv = 40;
		}
		
	}
	
}













  