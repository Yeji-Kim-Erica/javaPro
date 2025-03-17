package days29;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author 김예지
 * @date 2025. 3. 14.
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		/* [스트림의 최종 연산]
       *     1) forEach() : peek() 메서드와 달리 스트림의 요소를 소모하면서 처리되는 최종연산
       *     2) 조건 검사 - allMatch(), anyMatch(), noneMatch(), findFirst(), findAny()
       *     3) 통계 - count(), sum(), average(), max(), min()
       *     
       *     4) 리듀싱 - reduce()
       *       (1) 스트림의 요소를 줄여나가면서 연산을 수행하고 최종결과를 반환한다.
       *       (2) 매개변수의 타입 - BinaryOperator<T> 
		 */
		
		String[] strArr = {
		         "Inheritance", "Java", "Lambda", "stream",
		         "OptionalDouble", "IntStream", "count", "sum"
		      };
		
		// String[] -> Stream 변환: of()
		// Stream<String>
		Stream.of(strArr).forEach(System.out::println);
		
		System.out.println("=".repeat(50));
		
		// 조건을 검사하는 최종 연산: allMatch(), anyMatch(), noneMatch() => 결과값은 boolean형
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length()==0); // true
		System.out.println(noEmptyStr);
		
		Optional<String> sword = Stream.of(strArr).filter(s -> s.charAt(0)=='s').findFirst();
		System.out.println(sword.get()); // stream
		
		// String<String[]> -> IntStream으로 변환
		IntStream is1 = Stream.of(strArr).mapToInt(String::length); // 문자열의 길이를 Stream으로
		IntStream is2 = Stream.of(strArr).mapToInt(String::length);
		IntStream is3 = Stream.of(strArr).mapToInt(String::length);
		IntStream is4 = Stream.of(strArr).mapToInt(String::length);
		
		// 스트림의 요소 개수
		// is1.count();
		int count = is1.reduce(0, (a,b) -> a + 1);
		//					   ㄴ 0: 제일 첫번째 요소와 비교할 값
		System.out.println(count); // 8
		
		// 0 11 4 6 5
		// a b
		// 0+1 => 1
		// 1
		
		// 문자열의 총길이
		int sum = is2.reduce(0, (a,b) -> a + b);
		System.out.println(sum); // 58
		
		// 문자열의 길이가 가장 큰 것
		// int max = is3.reduce(0, (a,b) -> (a > b) ? a : b);
		// System.out.println(max); // 14
		OptionalInt max = is3.reduce(Integer::max);
		System.out.println(max.getAsInt()); // 14
		
		// 문자열의 길이가 가장 작은 것
		int min = is4.reduce(Integer.MAX_VALUE, (a,b) -> (a > b) ? b : a);
		System.out.println(min); // 3
		
	} // main
	
} // class
