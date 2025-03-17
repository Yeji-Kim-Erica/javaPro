package days24;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject Arrays 클래스: 배열의 사용을 용이하게 해주는 클래스
 * 			Collections 클래스: 컬랙션 클래스의 사용을 용이하게 해주는 클래스
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list); // []
		
		/* [1]
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		*/
		
		// [2]
		// 값을 추가하는 작업
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list); // [1, 2, 3, 4, 5]
		
		// 오른쪽 2칸씩 회전(이동)
		Collections.rotate(list, 2);
		System.out.println(list); // [4, 5, 1, 2, 3]
		
		// 값을 교환하는 작업
		Collections.swap(list, 0, 2);
		System.out.println(list); // [1, 5, 4, 2, 3]
		
		// 값을 섞는 작업
		Collections.shuffle(list);
		System.out.println(list); // 실행할 때마다 달라짐
		
		// 오름차순 정렬
		Collections.sort(list);
		System.out.println(list); // [1, 2, 3, 4, 5]
		
		// 내림차순 정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list); // [5, 4, 3, 2, 1]
		
		// 인덱스 찾기
		int index = Collections.binarySearch(list, 3);
		System.out.println(index); // 2
		
		// 정렬 뒤집기
		Collections.reverse(list);
		System.out.println(list); // [1, 2, 3, 4, 5]
		
		// 값 초기화
		Collections.fill(list, 0);
		System.out.println(list); // [0, 0, 0, 0, 0]
		
		// 값 한번에 변경
		Collections.replaceAll(list, 0, 100);
		System.out.println(list); // [100, 100, 100, 100, 100]
		
		// 복사
		// Collections.copy(list, ???);
		
		
	} // main
	
} // class
