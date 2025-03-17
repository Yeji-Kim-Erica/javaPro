package days27;

/**
 * @author 김예지
 * @date 2025. 3. 12.
 * @subject
 * @content
 */
public class Ex02_05 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method(100);
		
	} // main
	
} // class

class Outer {
	int a = 10; // a: 외부변수 1
	
	class Inner {
		int b = 20; // b: 외부변수 2
		void method(int i) { // i: 외부변수 4 => 람다식에서 사용되는 순간 자동으로 final int i가 됨
			int c = 30; // c: 외부변수 3 => 람다식에서 사용되는 순간 자동으로 final int c가 됨
			// c = 100;
			// i = 200; 왜 i, c에 값을 할당하니까 아래에서 에러가 발생할까?
			// Local variable i defined in an enclosing scope must be final or effectively final
			// 람다식에서 i와 c 변수를 사용/참조하면 그 순간 그 변수들은 final을 붙이지 않아도 상수로 간주한다. **
			
//			MyFunction2 f = (i) -> { // 에러 발생: method의 매개변수 i와 myMethod의 매개변수 i의 이름이 중복되기 때문
			MyFunction2 f = () -> {
				// 외부변수를 참조하는 람다식
				// Local variable i defined in an enclosing scope must be final or effectively final
				// 람다식에서 i와 c 변수를 사용/참조하면 그 순간 그 변수들은 final을 붙이지 않아도 상수로 간주한다.
				System.out.println("i : " + i);
				System.out.println("c : " + c);
				
				// 여기서 b와 a는 상수로 간주하지 않는다. => 값을 변경할 수 있다.
				this.b = 10000;
				Outer.this.a = 20000;
				System.out.println("b : " + this.b);
				System.out.println("a : " + Outer.this.a);
			};
			f.myMethod();
		}
	}
	
}

@FunctionalInterface
interface MyFunction2 {
	void myMethod();
}