package days23;

import java.util.TreeSet;

/**
 * @author 김예지
 * @date 2025. 3. 6.
 * @subject
 * @content
 */
public class Ex05_03 {

	public static void main(String[] args) {
		int[] score = {80, 95, 50, 85, 45, 65, 10, 100};
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < score.length; i++) ts.add(score[i]);
		
		System.out.println(ts); // [10, 45, 50, 65, 80, 85, 95, 100]
		
		// 범위 검색 50 이상 80 미만
		System.out.println(ts.subSet(50, 80)); // [50, 65]
		
		// 범위 검색 80 이상
		System.out.println(ts.tailSet(80)); // [80, 85, 95, 100]
		
		// 범위 검색 80 미만
		System.out.println(ts.headSet(80)); // [10, 45, 50, 65]
		
		// 역순으로 접근 가능
		// ts.descendingSet();
		// ts.descendingIterator();
		
	} // main
	
} // class
