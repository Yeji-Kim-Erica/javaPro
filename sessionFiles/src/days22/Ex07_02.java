package days22;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author kenik
 * @date 2025. 3. 5. - 오후 2:18:44
 * @subject 
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		/*
		 * [큐(Queue)구조]
		 * 1. FIFO 구조
		 * 2. Queue 인터페이스
		 * 3.    "             를 구현한 클래스 : LinkedList  등
		 * 4. Stack -  push()    pop()/peek()    isEmpty()   search()
		 *    Queue -  offer()   poll()/peek()   isEmpty()      X
		 * 
		 * */
		
		// FIFO 구조사용할 목적...
		Queue q = new LinkedList();
		q.offer("김예지");
		q.offer("남현수");
		q.offer("서재웅");
		System.out.println(q.offer("이정인") ); // boolean offer()   true/false
		
		while (!q.isEmpty()) {
			System.out.println(  q.poll() );			
		} // while
		 
		
		
		

	} // main

} // class
  