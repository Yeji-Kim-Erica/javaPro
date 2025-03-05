package days22;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject
 * @content
 */
public class Ex07_03 {

	public static void main(String[] args) {
		/* [Deque 인터페이스]
		 	== Double Enabled Queue
		 	양쪽으로 가능한 큐
		 */
		
		Deque q = new LinkedList();
		q.offerFirst("A");
		q.offerLast("B");
		
		System.out.println(q);
		
		System.out.println(q.pollFirst());
		System.out.println(q.pollLast());
		
	} // main
	
} // class
