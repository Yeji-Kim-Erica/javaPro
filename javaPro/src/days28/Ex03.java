package days28;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author 김예지
 * @date 2025. 3. 13.
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		/* [람다식과 스트림(Stream)]
		  1. 자바의 IO(입출력) 스트림(Stream) 과 람다식의 스트림은 다른 개념이다.
		  2. 스트림이란?
		  	많은 데이터를 다룰 때 -> 배열, 컬렉션을 사용해서 -> 처리
		  											  for
		  											  iterator 반복자
		  											  enumeration 열거자
		  											  
			표준화가 되지 않은 중복적인 처리방법을 일괄적으로 처리하는 것
			
		  
		  3. 데이터 소스(배열, 컬렉션, 파일)가 무엇이든 간에
		  	 스트림을 사용하면 같은 방식으로 처리할 수 있다.
		  
		  4. 스트림은 데이터 소스를 변경하지는 않는다.
		  5. 스트림은 일회용이다.
		  6. 스트림은 작업을 내부적으로 반복 처리한다.
		  7. 스트림은 미리 데이터를 다루는 메서드를 정의해놓았다.
		  	
		 */
		
		String[] strArr = {"aaa", "bbb", "ccc"};
		// for문 사용해서 처리
		
		List<String> strList = Arrays.asList("aaa", "bbb", "ccc");
		// iterator 반복자 사용해서 처리
		
		// => 사용하는 방법을 구분짓지 않고 처리하는 방법이 있다!
		// 그게 바로 스트림. 그리고 스트림을 사용하는 이유
		
		// 배열 -> 스트림 변환
		Stream<String> s1 = Arrays.stream(strArr);
		
		// 컬렉션 -> 스트림 변환
		Stream<String> s2 = strList.stream();
		
		// s1.sorted().forEach((s)->System.out.println(s));
		s1.sorted().forEach(System.out::println);
		
		// 스트림은 일회용/일회성이기 때문에 다시 사용 불가
		s1.forEach(System.out::println);
		// stream has already been operated upon or closed
		
		s2.sorted().forEach(System.out::println);
		
	} // main
	
} // class
