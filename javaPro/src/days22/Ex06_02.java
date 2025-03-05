package days22;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("양재원");
		list.add("서주원");
		list.add("안우혁");
		list.add("이정인");
		
		// 순서가 유지됨
		System.out.println(list); // [양재원, 서주원, 안우혁, 이정인]
		
		list.addFirst("김현수");
		list.addLast("박지웅");
		System.out.println(list); // [김현수, 양재원, 서주원, 안우혁, 이정인, 박지웅]
		
		// 양재원, 서주원 사이에 홍길동 삽입
		list.add(list.indexOf("서주원"), "홍길동");
		System.out.println(list); // [김현수, 양재원, 홍길동, 서주원, 안우혁, 이정인, 박지웅]
		
		// 안우혁 삭제
		list.remove("안우혁");
		System.out.println(list); // [김현수, 양재원, 홍길동, 서주원, 이정인, 박지웅]
		
		// list.iterator();
		
		// 내림차순으로 반복자
		Iterator ir = list.descendingIterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		/* 출력결과: 내림차순
			박지웅
			이정인
			서주원
			홍길동
			양재원
			김현수
		 */
		
		System.out.println("-".repeat(50));
		
		// 첫번째로 일치하는 객체를 제거: removeFirstOccurrence()
		list.removeFirstOccurrence("홍길동");
		System.out.println(list); // [김현수, 양재원, 서주원, 이정인, 박지웅]
		
	} // main
	
} // class
