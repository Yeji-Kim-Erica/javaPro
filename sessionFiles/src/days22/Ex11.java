package days22;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author kenik
 * @date 2025. 3. 5. - 오후 5:20:55
 * @subject 
 * @content
 */
public class Ex11 {
	
	public static void main(String[] args) {
		// Set 인터페이스의 특징 
		// 중복 허용 X, 순서 유지 O
		// [HashSet 컬렉션 클래스]
		// HashSet<int> hs = new HashSet<int>();
		
		//  <> 제네릭 : 기본형 X, 참조형 O
//		HashSet<Integer> hs = new HashSet<Integer>();
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(new Integer(100));
		hs.add(20);  // Auto Boxing
		hs.add(20);  // Auto Boxing
		hs.add(20);  // Auto Boxing
		hs.add(15);
		hs.add(15);
		hs.add(15);
		hs.add(30);
		//  [100, 20, 30, 15]
		System.out.println( hs );
		
		
		
	} // main

} // class






  