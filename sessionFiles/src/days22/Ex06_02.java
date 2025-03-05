package days22;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author kenik
 * @date 2025. 3. 5. - 오후 12:36:59
 * @subject    LinkedList 컬렉션 클래스 
 * @content    C -> L -> 
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add("양재원");
		list.add("서주원");
		list.add("안우혁");
		list.add("이정인");
		
		// [양재원, 서주원, 안우혁, 이정인]
		System.out.println(  list  );
		
		list.addFirst("김현수");
		list.addLast("박지웅");
				
		// 양재원, 서주원 사이에 홍길동을 삽입...
		int index = list.indexOf("서주원");
		list.add(index, "홍길동");
		
		// 안우혁  삭제
		index = list.indexOf("안우혁");
		list.remove(index);
		
		System.out.println(  list  );
		
		System.out.println("-".repeat(60));
		
		// list.iterator();
		
		// 내림차순으로 반복자
		Iterator ir = list.descendingIterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		} // while

		System.out.println("-".repeat(60));
		
		// 첫 번째로 일치하는 객체를 제거..
		list.removeFirstOccurrence("홍길동");
		
		System.out.println(  list  );
	} // main

} // class
  