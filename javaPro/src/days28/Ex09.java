package days28;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author 김예지
 * @date 2025. 3. 13.
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// [flatMap()]
		//  평평한, 평탄한
		//	ㄴ 스트림의 요소가 배열 또는 스트림인 경우, 스트림의 타입이 Stream<T[]> 또는 Stream<Stream> 일 때 -> Stream<T> : flatMap() 메서드
		
		String [] lineArr = {
	            "Belive or not It is true", 
	            "Do or do not There is no try"
	      };
		
		// String[] -> Stream 변환
		Stream<String> lineSt = Arrays.stream(lineArr);
		
		// 1. map()
		 Stream<Stream<String>> ss1 = lineSt.map(line->Stream.of(line.split(" +")));
		 Stream<String> ss2 = lineSt.flatMap(line->Stream.of(line.split(" +")));
		
	} // main
	
} // class
