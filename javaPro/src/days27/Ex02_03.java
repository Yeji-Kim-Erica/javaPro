package days27;

/**
 * @author 김예지
 * @date 2025. 3. 12.
 * @subject
 * @content
 */
public class Ex02_03 {
	
	// [1] 함수형 인터페이스를 매개변수로 사용한 경우
	static void execute(MyFunction f) {
		f.run();
	}
	
	// [2] 함수형 인터페이스를 리턴값으로 사용한 경우
	static MyFunction getMyFunction() {
//		MyFunction f = () -> System.out.println("f.run()...");
//		return f;
		return () -> System.out.println("f.run()...");
	}

	public static void main(String[] args) {
		// [1]
		MyFunction f1 = () -> System.out.println("f1.run()...");
		execute(f1); // f1.run()...
		
		// [1-1] 람다식을 매개변수로 사용한 경우
		execute(() -> System.out.println("f1.run()...")); // f1.run()...
		
		// [2]
		MyFunction f = getMyFunction();
		f.run(); // f.run()...
		
	} // main
	
} // class

@FunctionalInterface
interface MyFunction {
	void run();
}