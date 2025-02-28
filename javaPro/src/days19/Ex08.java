package days19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject java.util 패키지
 * @content		ㄴ 자주 사용되는 유용한 유틸리티 (클래스)
 */
public class Ex08 {

	public static void main(String[] args) {
		// [1] java.util.Arrays 클래스
		int[] m = {3,5,2,4,1};
		// Arrays.toString() : 배열 출력
		System.out.println(Arrays.toString(m)); // [3, 5, 2, 4, 1]
		
		// Arrays.fill() : 기본값 채우기
//		Arrays.fill(m, -1);
//		System.out.println(Arrays.toString(m)); // [-1, -1, -1, -1, -1]
		
		// Arrays.sort() : 오름차순 정렬
		Arrays.sort(m);
		System.out.println(Arrays.toString(m)); // [1, 2, 3, 4, 5]
		
		// Arrays.sort(Collections.reverseOrder()) : 내림차순 정렬
		// int[] m -> Integer[] 변환 (1)
//		Integer[] n = new Integer[m.length];
//		for (int i = 0; i < m.length; i++) {
//			n[i] = m[i];
//		} // for i
		
		// int[] m -> Integer[] 변환 (2)
		// [1]
		IntStream is = Arrays.stream(m);
		Integer[] n = is.boxed().toArray(Integer[]::new);
		// IntStream의 int 배열 -> 래퍼클래스 Integer 배열로 박싱
		
		// [2]
		// Arrays.sort(n, Collections.reverseOrder());
//		Arrays.sort(n, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2.compareTo(o1);
//			}
//		});
		
		// [3]
		Arrays.sort(n, (o1, o2) -> o2.compareTo(o1));
		System.out.println(Arrays.toString(n)); // [5, 4, 3, 2, 1]
		
//		Arrays.copyOf(m, m.length+3);
//		Arrays.copyOfRange(m, int from, int to);
		
//		Arrays.binarySearch(m, 100);
		
		// 두 배열이 같은지 여부 체크
		// Arrays.compare(int[] m, int[] n);
		
		// int[] -> List 변환
		// List<int[]> Arrays.asList(m);
		
	} // main
	
} // class
