package days28;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author 김예지
 * @date 2025. 3. 13.
 * @subject [메서드 참조]
 * @content 메서드 -> 간결하게 람다식으로
 				   ()  ->  {하나의 메서드만을 호출하는 경우}
 				   				ㄴ 메서드 참조라는 방법으로 람다식을 간략히 사용 가능
 				   				
 			[메서드 참조의 3가지 방식]
 			1) static 메서드 참조			- 클래스명::메서드명
 			2) 인스턴스 메서드 참조			- 클래스명::메서드명
 			3) 특정 객체 인스턴스 메서드 참조	- 특정객체::메서드명
 			
 */
public class Ex02 {

	public static void main(String[] args) {
		// 문자열 s를 매개변수로 받아서 int 정수로 반환하는 람다식
		// Function<String, Integer> f = s -> Integer.parseInt(s); // 기존 방법
		Function<String, Integer> f = Integer::parseInt; // 메서드 참조
		
		// BiFunction<String, String, Boolean> f2 = (s1, s2) -> s1.equals(s2); // 기존 방법
		BiFunction<String, String, Boolean> f2 = String::equals; // 메서드 참조
		
		MyClass obj = new MyClass();
		// Function<String, Boolean> f3 = (x) -> obj.equals(x); // 기존 방법
		Function<String, Boolean> f3 = obj::equals; // 메서드 참조
		
		// [생성자의 메서드 참조]
		// Supplier<MyClass> s = () -> new MyClass(); // 기존 방법
		Supplier<MyClass> s = MyClass::new; // 메서드 참조
		
		// BiFunction<Integer, String, MyClass> s2 = (i, s) -> new MyClass(i, s);
		// Lambda expression's parameter s cannot redeclare another local variable defined in an enclosing scope.
		// 위에 이미 지역변수로 s가 선언되어 있어서 오류
		
		// BiFunction<Integer, String, MyClass> s2 = (i, str) -> new MyClass(i, str); // 기존 방법
		BiFunction<Integer, String, MyClass> s2 = MyClass::new; // 메서드 참조
		
		// [배열의 메서드 참조]
		// Function<Integer, int[]> f4 = x -> new int[x]; // 기존 방법
		Function<Integer, int[]> f4 = int[]::new; // 메서드 참조
		
		
	} // main
	
} // class

class MyClass{

	public MyClass() { }
	
	public MyClass(Integer i, String s) {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
