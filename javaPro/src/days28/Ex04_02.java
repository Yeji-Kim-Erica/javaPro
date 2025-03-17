package days28;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author 김예지
 * @date 2025. 3. 13.
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		int[] iArr = {34, 64, 22, 54, 11, 9 , 89, 13, 22, 34, 100};
		
		// 배열 -> 스트림
		// 1) Stream.of(T...args) 또는 Stream.of(T[] args)
		// 2) Arrays.stream(T[] args) 또는 Arrays.stream(T[] args, int startIndex, int endIndex)
		
		// [기본형 스트림]
		// a) IntStream is = Arrays.stream(iArr);
		// b) Stream<Integer> is = Arrays.stream(iArr).boxed();
		IntStream is = IntStream.of(iArr); // c)
		
		// int sum = is.sum();
		// System.out.println(sum); // 452
		
		// 3) int[] -> List 변환
		/*
		List<Integer> list = Arrays.stream(iArr).boxed().collect(Collectors.toList());
		*/
		
		/* 위의 is 스트림을 사용해서 50 이상인 것만 필터링
		IntStream filteredIs = is.filter(i -> i>=50);
		filteredIs.forEach(System.out::println);
		*/
		
		// 5) is 중복 제거 -> 정렬 -> 3개
		
		// 6) is의 max, min
		OptionalInt omax = is.max();
		System.out.println(omax.getAsInt());
		
		// 7) String[] -> Stream 변환
		String[] strArr = {"aa", "bb", "cc"};
		Stream<String> ss = Stream.of(strArr);
		
	} // main
	
} // class
