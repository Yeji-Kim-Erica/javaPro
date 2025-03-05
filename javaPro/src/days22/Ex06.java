package days22;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject C -> L -> LinkedList 컬렉션 클래스
 * @content 1. 배열의 단점
 				1) 배열의 크기가 자동으로 증가하지 X
 				2) 삽입/삭제 과정이 복잡
 					: 데이터들의 순서를 뒤로 하나씩 미뤄주거나 앞으로 당겨줘야 함
 			2. 배열의 장점
 				읽기 성능이 가장 빠르다.
 			
 			3. 배열의 단점 2)를 보완한 클래스 -> LinkedList 컬렉션 클래스
 			
 			LinkedList -> 비연속적이라는 것이 특징이다.
 							ㄴ 이로 인해 다음 요소의 주소를 가지고 있다
 								ㄴ 이로 인해 데이터의 삽입과 삭제가 자유롭다
 			 ㄴ 선생님 그림 참고
 			=> 잦은 삽입과 삭제가 필요할 때 LinkedList 이용
 *
 *           다음요소주소저장
 *           0번째요소      	2번째요소        3번째요소 (삭제)
 *           [0x500]        [0x300 ]       [null]         
 *           [3]            [10]           [5]
 *           0x100          0x200          0x300   
 *           
 *                  1번 요소
 *                  [0x300]
 *                  [100]
 *                  0x500
			
 */
public class Ex06 {

	public static void main(String[] args) {
		Node node1 = new Node();
		node1.value = 10;
		
		Node node2 = new Node();
		node2.value = 15;
		node1.next = node2;
		
		Node node3 = new Node();
		node3.value = 17;
		node2.next = node3;
		
		Node node4 = new Node();
		node4.value = 34;
		node3.next = node4;
		
		Node node = node1;
		while (node != null) {
			System.out.printf("[%d]", node.value);
			node = node.next;
		}
		System.out.println();
		
		// [문제] 노드2와 노드3 사이에 노드5(100) 추가
		Node node5 = new Node();
		node5.value = 100;
		node5.next = node2.next;
		node2.next = node5;
		
		node = node1;
		while (node != null) {
			System.out.printf("[%d]", node.value);
			node = node.next;
		}
		System.out.println();
		
		// [문제] 노드3 삭제
		node5.next = node4;
		
		node = node1;
		while (node != null) {
			System.out.printf("[%d]", node.value);
			node = node.next;
		}
		System.out.println();
		
	} // main
	
} // class

// 단방향 링크드 리스트
class Node {
	int value = 0;
	Node next = null; // 노드의 부소를 저장할 참조변수
}
