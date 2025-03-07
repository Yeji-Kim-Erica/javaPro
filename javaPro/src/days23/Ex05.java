package days23;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author 김예지
 * @date 2025. 3. 6.
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// Set - HashSet, LinkedHashSet, TreeSet
		
		/* [TreeSet]
		 	1. 중복허용 X, 순서유지X
		 	2. 이진 검색 트리 (binary Search Tree) 라는 자료구조로 데이터 저장하는 컬렉션 클래스
		 	3. 이진 검색 트리 - 정렬, 검색, 범위 검색에서 높은 성능.
		 	4. 링크드리스트처럼 노드(Node)가 서로 연결된 구조
		 	5. 				  최상위노드 -- 루트(root)노드
		 		노드들 간의 관계 :	부모노드 - 자식노드
		 						형제노드
		 	6. 노드 구조
		 		class TreeNode {
		 			TreeNode 왼쪽자식노드;
		 			int value;
		 			TreeNode 오른쪽자식노드;
		 		}
		 	7. 이진 검색 트리 구조
		 		부모노드의 왼쪽에는 부모노드 값보다 작은 값의 자식노드가 배치되고,
		 		부모노드의 오른쪽에는 부모노드 값보다 큰 값의 자식노드가 배치된다.
		 		
					 						[0x100][7][0x200]
					 		
					 		[0x300][4][n]								[n][9][n]
					 			0x100									  0x200
					 	
					 [n][1][n]		[n][5][0x500]				
					   0x300			  	0x400
					 	
					 							[n][6][n]
					 							  0x500
		 */
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(5);
		ts.add(6);
		ts.add(1);
		
		System.out.println(ts); // [1, 4, 5, 6, 7, 9]
		ts.add(5); // 중복허용X
		System.out.println(ts); // [1, 4, 5, 6, 7, 9]
		
		System.out.println(ts.first()); // 1
		System.out.println(ts.last()); // 9
		
		SortedSet<Integer> ss = ts.subSet(4, 7); // 4 이상 7 미만
		System.out.println(ss); // [4, 5, 6]
		
		System.out.println(ts.higher(1)); // 결과: 4 -> 1보다 큰 값 중 가장 가까운 값 (1의 부모)
		System.out.println(ts.lower(9)); // 결과: 7 -> 9보다 작은 값 중 가장 가까운 값 (9의 왼쪽 자식)
		
		System.out.println(ts.floor(3)); // 결과: 1 -> 3보다 작거나 같은 값
		System.out.println(ts.ceiling(3)); // 결과: 4 -> 3보다 크거나 같은 값
		
	} // main
	
} // class
