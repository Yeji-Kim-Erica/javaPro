package days21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author 김예지
 * @date 2025. 3. 4.
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// List, Set, Map...
		// [List] - ArrayList 컬렉션 클래스
		//				ㄴ 가장 많이 사용되는 컬렉션 클래스
		//				ㄴ 순서 유지 O, 중복 허용 O
		
		String[] names = new String[5];
		names[0] = "홍길동"; // 0번째 요소
		names[1] = "김길동"; // 1번째 요소
		
		// <E> : 제네릭
		//  ㄴ E : Element (요소)
		// ArrayList<E>
		// ArrayList list = new ArrayList(10); 기본값이 10개
		ArrayList list = new ArrayList();
		
		System.out.println(list.isEmpty()); // true
		System.out.println(list.size()); // 0 : size는 배열의 크기가 아닌, 배열 안에 들어있는 요소의 크기/개수를 나타냄
		
		list.add("권태정");
		list.add("김도훈");
		list.add("김민선");
		list.add("서재웅");
		list.add("김승효");
		list.add("김도훈");
		System.out.println(list.isEmpty()); // false
		System.out.println(list.size()); // 5
		
		// 순서 유지 O
		System.out.println(list); // [권태정, 김도훈, 김민선, 서재웅, 김승효]
		// 입력한대로 순서가 유지됨
		
		// 중간에 삽입
		list.add(2, "양재원");
		System.out.println(list); // [권태정, 김도훈, 양재원, 김민선, 서재웅, 김승효]
		
//		// 요소 변경
//		list.set(1, "김길동");
//		System.out.println(list); // [권태정, 김길동, 양재원, 김민선, 서재웅, 김승효]
		
//		// 10개였던 배열의 공간을 요소의 사이즈에 맞게 줄이는 메소드
//		list.trimToSize();
//		
//		// 배열에서 값 찾는 메소드: indexOf(), lastIndexOf()
//		int index = list.indexOf("홍길동"); // 앞에서부터 찾아서 index를 돌려줌. 없으면 -1 돌려줌.
//		System.out.println(index); // -1
//		
//		// "김도훈" 요소를 찾아서 삭제
//		// list.contains("김도훈");
//		
//		if ((index=list.indexOf("김도훈")) >= 0) {
//			System.out.println(list.remove(index)); // 김도훈
//		}
//		System.out.println(list);
//		System.out.println(list.remove("김길동")); // true
//		System.out.println(list);
		
		// [문제] 모든 김도훈 요소를 삭제
//		while (list.remove("김도훈"));
		
		/* [3]
		ArrayList removeList = new ArrayList();
		removeList.add("김도훈");
		list.removeAll(removeList);
		*/
		
		// [5] 람다식과 스트림
		// Predicate: 조건을 검사하는 함수형 인터페이스
		// 함수형 인터페이스: @FunctionalInterface
//		Predicate<String> isNameCheck = (name) -> name.equals("김도훈");
//		list.removeIf(isNameCheck);
		
		/* [6] 익명클래스 이용
		list.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.equals("김도훈");
			}
		});
		*/
		
		/* [7] 6과 같은 코딩
		list.removeIf((name) -> name.equals("김도훈"));
		*/
		
		// [문제] 김씨 모두 삭제
		// list.removeIf((name) -> ((String) name).matches("김[가-힣]*"));
		// list.removeIf((name) -> ((String) name).startsWith("김"));
		// list.removeIf((name) -> ((String) name).charAt(0) == '김');
		
		// 이름을 오름차순 정렬하기
		// Arrays.sort(배열명);
//		list.sort(null); // 기본이 오름차순 -> [권태정, 김도훈, 김도훈, 김민선, 김승효, 서재웅, 양재원]
		
		// 이름을 내림차순 정렬하기
//		list.sort(Collections.reverseOrder()); // [양재원, 서재웅, 김승효, 김민선, 김도훈, 김도훈, 권태정]
		
		// 람다식
//		list.sort((o1, o2) -> ((String) o2).compareTo((String) o1)); // [양재원, 서재웅, 김승효, 김민선, 김도훈, 김도훈, 권태정]
		
		System.out.println(list);
		
		// [문제] index == 5 인 이름 요소를 얻어오기: get() 메소드 이용
		int index = 5;
		System.out.println(list.get(index)); // 김승효
		
		// [문제] index 값 1부터 4까지 요소 얻어오기
		int fromIndex, toIndex;
		fromIndex = 1;
		toIndex = 5;
		List subList = list.subList(fromIndex, toIndex);
		System.out.println(subList); // [김도훈, 양재원, 김민선, 서재웅]
		
		// [문제] 모든 요소를 제거
		list.clear();
		System.out.println(list); // []
		System.out.println(list.size()); // 0
		
		
	} // main
	
} // class
