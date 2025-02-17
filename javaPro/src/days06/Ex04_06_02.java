package days06;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오후 2:13:11
 * @subject
 * @content
 */
public class Ex04_06_02 {

	public static void main(String[] args) {
		
		// 까먹었음. 다시 공부해
		
		// 람다식과 스트림(Stream)
		int [] m = {10, 31, 98, 38, 68, 91, 95, 76, 27, 29};
		
		// [1]
		// int[] -> int 스트림 변환
//		OptionalInt max = IntStream.of(m).max();
		OptionalInt max = IntStream.of(m).max();
		
		// getAsInt() : OptionalInt -> int
		if (max.isPresent()) { // isPresent : 값이 존재하냐에 대해 true/false로 결과값
			System.out.println(max.getAsInt());
		}
//		if(max.isPresent()) {
//			System.out.println(max.getAsInt());
//		}
		
		// [2]
//		max = new Random().ints(0,101).limit(10).max();
		max = new Random().ints(0,101).limit(10).max();
		
		System.out.printf("max=%d", max);
		
	} // main
	
}
