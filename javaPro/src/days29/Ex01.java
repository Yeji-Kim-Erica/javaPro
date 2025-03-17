package days29;

import java.util.Optional;
import java.util.OptionalInt;

/**
 * @author 김예지
 * @date 2025. 3. 14.
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {

	  /*	[Optional<T>와 OptionalInt]
	   * 
       *     1) Optional : 지네릭 클래스, 'T 타입의 객체'를 감싸는 래퍼 클래스이다.
       *                           모든 타입의 참조변수를 담을 수 있다. 
       *                           
       *     2) 최종 연산의 결과를 Optional  객체로 반환.
       *     
       *     3) Optional 객체 생성하기
       *        (1) of(), ofNullable() 사용. 
       *        (2) 만일 참조변수의 값이 null일 가능성이 있으면, of() 대신에 ofNullable() 사용 
       *        
       *     4)Optional객체의 값 가져오기
       *       (1) get(), orElse() 사용 
       *       (2) Stream처럼 Optional 객체도 filter(), map(), flatMap() 사용 가능.
       *       (3) isPresent() : Optional 객체의 값이 null이면 false, 아니면 true 반환하는 메서드.
       *       (4) ifPresent() : 참조변수 str이 null이 아닐 때만 출력, null이면 아무 일도 일어나지 않는다.
       */
		
		// "abcd" 문자열 -> Optional 객체로 생성
		Optional<String> optStr = Optional.of("abcde");
		
		// map() 메서드 사용
		Optional<Integer> optInt = optStr.map(String::length);
		//										ㄴ 메서드 참조
		
		// get() 메서드로 값을 얻어오기
		System.out.println("optStr="+optStr.get());
		System.out.println("optInt="+optInt.get());
		
		// of() : Optional 객체 생성 메서드
		int result = Optional.of("123")
							.filter( x -> x.length() >0)
							.map(Integer::parseInt)
							.get();
		System.out.println("result1="+result);
		
		// orElse()
		int result2 = Optional.of("")
				.filter( x -> x.length() >0)
				.map(Integer::parseInt)
				// .get(); // No value present 오류 발생
				.orElse(-1); // 값이 없을 때는 -1을 반환
		System.out.println("result2="+result2);
		
		// ifPresent()
		Optional.of("456")
				.map(Integer::parseInt)
				.ifPresent(x -> System.out.printf("result3=%d\n", x));
		
		// OptionalInt
		OptionalInt optInt1 = OptionalInt.of(0); // 0이라는 값을 저장한 객체
		OptionalInt optInt2 = OptionalInt.empty(); // 빈 객체를 생성
		
		System.out.println(optInt1.isPresent()); // 객체 값이 null이 아니므로 true 출력
		System.out.println(optInt2.isPresent()); // 객체 값이 null이기 때문에 false 출력
		
		System.out.println(optInt1.getAsInt()); // 0
		System.out.println(optInt1.equals(optInt2)); // false
		
		// String s = null;
		Optional<String> opt1 = Optional.ofNullable(null);
		Optional<String> opt2 = Optional.empty();
		
		System.out.println(opt1); // Optional.empty
		System.out.println(opt2); // Optional.empty
		System.out.println(opt1.equals(opt2)); // true
		
	} // main
	
} // class
