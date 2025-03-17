package days28;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author 김예지
 * @date 2025. 3. 13.
 * @subject
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
		// 특정 범위의 정수 -> 스트림
		// 예) 1,2,3,4 정수값을 가진 스트림
		IntStream is1 = IntStream.range(1, 5);
		// 예) 1,2,3,4,5 정수값을 가진 스트림
		IntStream is2 = IntStream.rangeClosed(1, 5);
		
		// [임의의 수(난수) 생성] Random 클래스
		IntStream is3 = new Random().ints();
		LongStream is4 = new Random().longs();
		DoubleStream is5 = new Random().doubles();
		
		IntStream lotto = new Random().ints(1, 46).distinct().limit(6);
		
		// IntStream(기본형 스트림) -> 스트림 : map 메서드
		Stream<String> slotto = lotto.sorted().mapToObj(i -> i + "/");
		slotto.forEach(System.out::print);
		
	} // main
	
} // class
