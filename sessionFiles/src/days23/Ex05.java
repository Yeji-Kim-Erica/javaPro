package days23;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author kenik
 * @date 2025. 3. 6. - 오후 2:04:29
 * @subject 
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// Set - HashSet, LinkedHashSet
		//       [TreeSet]
		/*
		 * 1. 중복 허용 X, 순서 유지 X
		 * 2. 이진 검색 트리( binary Search Tree) 라는 자료구조로 데이터 저장 
		 *    하는 컬렉션 클래스  
		 * 3. 이진 검색 트리( binary Search Tree)  - 정렬, 검색, 범위 검색 높은 성능.
		 * 4. 링크드리스트 처럼 노드( Node )가 서로 연결된 구조이다. 
		 * 5.                      최상위노드 --   루트(root)노드
		 *    노드들 간의 관계    :   부모노드 - 자식노드
		 *                            형제노드 
		 * 6. 노드 구조
		 *    class TreeNode{
		 *       TreeNode 왼쪽자식노드;
		 *       int value;
		 *       TreeNode 오른쪽자식노드;
		 *    }                           
		 * 7. 이진 검색 트리 구조
		 *   부모노드의 왼쪽에는 부모노드 값보다 작은 값의 자식노드가 배치가 되고
		 *              오른쪽에는      "        큰값의    자식노드가 배치가 된다. 
		 *
		 *    
		 *                      [0x100][7][0x200]
		 *    
		 *    
		 *           [0x300][4][0x400]              [n][9][n] 
		 *           0x100                          0x200 
		 *    
		 *   [n][1][n]         [n][5][0x500]
		 *   0x300             0x400
		 *   
		 *                             [n][6][n]
		 *                             0x500 
		 *   
		 * */ 
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		ts.add(6);
		
		System.out.println( ts  );
		ts.add(5);  // 중복 허용 X
		System.out.println( ts  );
		//  [1, 4, 5, 6, 7, 9]
		System.out.println( ts.first() ); // 1
		System.out.println( ts.last() );  // 9
		// 
		SortedSet<Integer> ss = ts.subSet(4, 7); // 4<=     <7
		System.out.println( ss );
		
		System.out.println( ts.higher(1) );  // 4
		System.out.println( ts.lower(1) );   // null
		
		System.out.println( ts.floor(3) );   // 1
		System.out.println( ts.ceiling(3) ); // 4
		
		
	} // main

} // class








  