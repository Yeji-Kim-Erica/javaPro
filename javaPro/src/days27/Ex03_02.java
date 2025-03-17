package days27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author 김예지
 * @date 2025. 3. 12.
 * @subject 함수형 인터페이스 + 컬렉션 프레임워크(JCF)
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		} // for i
		
		// list의 모든 요소 출력
		
		// [2]
		list.forEach((t) -> System.out.print(t+"/")); // 0/1/2/3/4/5/6/7/8/9/
		
		/* [1]
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t + "/");
			}
		}); // 0/1/2/3/4/5/6/7/8/9/
		*/
		
		System.out.println();
		
		// list 안에서 2의 배수 또는 3의 배수는 제거하려고 하면?
		list.removeIf((t) -> t%2==0 || t%3==0);
		list.forEach((t) -> System.out.print(t+"/")); // 1/5/7/
		
		System.out.println();
		System.out.println();
		
		//
		Map<String, String> map = new HashMap<String, String>();
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		
		// forEach 메서드 사용해서 출력
		map.forEach((key, value) -> System.out.println(key + "/" + value));
		
		System.out.println();
		
	} // main
	
	
} // class
