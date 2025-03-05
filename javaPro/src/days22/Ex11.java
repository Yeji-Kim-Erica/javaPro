package days22;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		// Set 인터페이스의 특징: 중복 허용 X, 순서 유지 X
		// [HashSet 컬렉션 클래스]
		// HashSet<int> hs = new HashSet<int>(); X
		// 제네릭으로 기본형은 사용할 수 없다.
		
		// <> 제네릭 : 참조형을 사용한다.
		// <E> 제네릭 안의 E는 Element, 요소를 말한다.
		/*
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(new Integer(100));
		hs.add(20); // AutoBoxing이 가능하므로 굳이 new 연산자로 생성할 필요 없음
		hs.add(15);
		hs.add(15);
		hs.add(15);
		hs.add(15);
		hs.add(30);
		hs.add(30);
		hs.add(30);
		
		System.out.println(hs); // [100, 20, 30, 15]
		*/
		
		// 중복을 허용하지 않으면서 순서가 유지되는 클래스: LinkedHashSet
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		hs.add(100);
		hs.add(20); // AutoBoxing이 가능하므로 굳이 new 연산자로 생성할 필요 없음
		hs.add(15);
		hs.add(15);
		hs.add(15);
		hs.add(15);
		hs.add(30);
		hs.add(30);
		hs.add(30);
		
	} // main
	
} // class
