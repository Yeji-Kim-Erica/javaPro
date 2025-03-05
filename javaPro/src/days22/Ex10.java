package days22;

import java.util.HashSet;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject C -> L -> ArrayList, Vector, LinkedList, Stack, Queue(LinkedList, PriorityQueue)
 * @content C -> Set -> ... (Collection을 물려받은 Set을 물려받은 클래스)
 			- 중복허용 X
 			- 순서유지 X
 			Collection을 물려받은 Set을 물려받은 클래스, [HashSet 클래스]
 */
public class Ex10 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(15);
		hs.add(15);
		hs.add(null);
		hs.add(null);
		System.out.println(hs); // [null, 1, 9, 15] null, 15는 한번만 추가됨(중복을 허용하지 않음). 숫자의 순서가 바뀜(순서 유지가 안됨).
		
	} // main
	
} // class
