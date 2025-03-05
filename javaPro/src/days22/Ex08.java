package days22;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject 
 * @content [컬렉션에 저장된 요소에 접근하는 데에 사용되는 인터페이스]
 			인터페이스: Enumeration 열거자, Iterator 반복자, ListIterator 반복자...
 			ㄴ Enumeration 구버전 / Iterator 신버전
 			ㄴ ListIterator: 기능이 향상된 Iterator(반복자)
 				ㄴ 양방향 조회 기능이 추가되었음 (List 인터페이스 구현 컬렉션 클래스)
 */
public class Ex08 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		System.out.println(list); // [1, 2, 3, 4, 5]
		
		// 양방향 조회 기능이 있는 반복자
		ListIterator ir = list.listIterator();
		while (ir.hasNext()) {
			String n = (String) ir.next();
			System.out.println(n);
		}
		System.out.println("-".repeat(60));
		while (ir.hasPrevious()) {
			String n = (String) ir.previous();
			System.out.println(n);
		}
		
	} // main
	
} // class
