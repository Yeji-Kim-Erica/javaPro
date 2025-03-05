package days22;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject PriorityQueue
 * @content 우선권, 우선 순위
 			ㄴ FIFO 구조 X
 			ㄴ 저장된 순서에 상관없이 우선 순위가 높은 것부터 꺼내는 구조
 			ㄴ null은 저장할 수 없음 (Null을 저장하려고 하면 NullPointerException이 발생함)
 			
 */
public class Ex07_06 {

	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3);
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		
//		System.out.println(pq); // [1, 2, 5, 3, 4]
		
		// 숫자: 작은 숫자의 우선순위가 더 높다
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		/* 출력결과:
			1
			2
			3
			4
			5
		 */
		
	} // main
	
} // class
