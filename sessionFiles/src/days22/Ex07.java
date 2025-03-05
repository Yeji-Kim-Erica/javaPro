package days22;

import java.util.Stack;

/**
 * @author kenik
 * @date 2025. 3. 5. - 오후 2:00:59
 * @subject   ArrayList  - 읽기 빠르다.
 * @content   LinkedList
 *           1) 순차적으로 추가/삭제 : ArrayList 가 빠르다.
 *           2) 중간       추가/삭제 : LinkedList가 빠르다.  
 *            Vector   - 멀티스레드 안전.
 */
public class Ex07 {

	public static void main(String[] args) {
		// 스택(Stack)과 큐(Queue)
		/*
		 * [Stack]
		 * 1. java.util 패키지
		 * 2. LIFO 자료구조
		 * 3.  push() 요소 추가
		 *     pop()  요소 얻어오기 , 제거 O
		 *     peek()       "      , 제거 X
		 *     isEmpty()   
		 *     index search() 검색
		 * 4. Vector 클래스의 자식클래스   
		 * 
		 * */
		
		Stack  s = new Stack();
		s.push("박지웅"); // 1
		s.push("서주원"); // 2             3
		s.push("안우혁"); // 3             2
		s.push("최인식"); // 4   LIFO구조  1
		
		System.out.println( s.search("서주원") ); // 3
		
		// push(), pop(), peek(), isEmpty(), search();  (암기)
		
		/*
		s.clear();
		// EmptyStackException
		System.out.println( s.peek() );
		*/
		/*
		System.out.println( s.peek() ); // 제거 X
		System.out.println( s.peek() );
		*/
		
		/*
		while (  !s.isEmpty()  ) {
			System.out.println( s.pop() ); 
		} // while
		*/
		/*
		System.out.println( s.pop() ); 
		System.out.println( s.pop() ); 
		System.out.println( s.pop() ); 
		System.out.println( s.pop() );
		// EmptyStackException
		System.out.println( s.pop() );
		*/ 
		
		
	} // main

} // class
  