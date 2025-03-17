package days24;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author kenik
 * @date 2025. 3. 7. - 오후 1:59:50
 * @subject  Array[s]      클래스 -  배열  
 * @content  Collection[s] 클래스 - 컬렉션 클래스
 */
public class Ex07 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println( list ); // []
		/* [1]
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		*/
		// [2]
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println( list ); // [1, 2, 3, 4, 5]
		
		// 오른쪽 2칸씩 회전(이동)
//		Collections.rotate(list, 2);
//		System.out.println( list ); // [4, 5, 1, 2, 3]
		
		// 0   2   값 교환
//		Collections.swap(list, 0, 2);
//		System.out.println( list );
		
		Collections.shuffle(list);
		System.out.println( list ); // [5, 2, 3, 4, 1]
		
		// 오름차순 정렬
		Collections.sort(list);
		System.out.println( list );
		
		// 내림차순 정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println( list ); // [5, 4, 3, 2, 1]
		
		// 
		int index = Collections.binarySearch(list, 30);
		System.out.println( index );
		
		// 
		Collections.reverse(list);
		System.out.println( list );
		
		Collections.fill(list, 0);
		System.out.println( list );
		
		Collections.replaceAll(list, 0 , 100);
		System.out.println( list );
		
		// Collections.copy(list, ???);
		

	} // main

} // class










  