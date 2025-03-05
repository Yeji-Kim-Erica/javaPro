package days22;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		/*
		 [큐(Queue) 구조]
		 1. FIFO 구조 (First In First Out)
		 2. Queue 인터페이스
		 3. Queue 인터페이스를 구현한 클래스: LinkedList, PriorityQueue
		 4. offer() 데이터 추가, poll()/peek(), isEmpty()
		 
		 
		 */
		
		Queue q = new LinkedList(); // 굳이 Queue 인터페이스에 담는 이유: FIFO 구조를 사용하겠다는 뜻
		q.offer("김예지");
		q.offer("남현수");
		q.offer("서재웅");
		System.out.println(q.offer("이정인")); // true/false
//		System.out.println(q.poll()); // 김예지
		
		
		
	} // main
	
} // class
