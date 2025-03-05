package days21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author 김예지
 * @date 2025. 3. 4.
 * @subject
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("권태정");
		list.add("김도훈");
		list.add("김민선");
		list.add("서재웅");
		list.add("김승효");
		list.add("김도훈");
		
		// [문제 1] 모든 요소 출력
		// [1] get() 메소드
		
		// [2] iterator 객체
		// iterator: 반복자
		// enumeration: 열거자
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
	} // main
	
} // class
