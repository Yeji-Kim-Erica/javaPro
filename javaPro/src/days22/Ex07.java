package days22;

import java.util.Stack;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject 스택(Stack)과 큐(Queue)
 * @content 
 			ArrayList - 읽기속도가 빠르다
 			LinkedList - 
 			1) 순차적으로 추가/삭제: ArrayList가 빠르다
 			2) 중간에 추가/삭제: Linked List가 빠르다
 			Vector - 멀티스레드 안전
 */
public class Ex07 {

	public static void main(String[] args) {
		// 스택(Stack)과 큐(Queue)
		/*
		 [Stack]
		 1. java.util 패키지에 있음
		 2. LIFO 자료구조 (Last In, First Out)
		 3. push() 요소 추가, pop() 요소 반환 및 삭제, peek() 요소 반환, isEmpty(), search() 인덱스 값 반환 ()
		 4. Vector 클래스의 자식 클래스
		 */
		
		Stack s = new Stack(); // Vector 클래스 함수 사용하면 안됨.
		s.push("박지웅");
		s.push("서주원");
		s.push("안우혁");
		s.push("최인석");
		
		System.out.println(s.search("서주원")); // 3 (1부터 시작)
		
		/*
		System.out.println(s.peek()); // 최인석
		System.out.println(s.peek()); // 최인석
		*/
		
		/*
		System.out.println(s.pop()); // 최인석
		System.out.println(s.pop()); // 안우혁
		System.out.println(s.pop()); // 서주원
		System.out.println(s.pop()); // 박지웅
		// System.out.println(s.pop()); EmptyStackException
		*/
		
		/*
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
		*/
		
	} // main
	
} // class
