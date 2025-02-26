package days18;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
		String[] s = {"kbs", "sbs", "mbc", "jtbc"};
		System.out.println(Arrays.toString(s)); // [kbs, sbs, mbc, jtbc]
		
		// 문자열 배열을 내림차순 정렬...
		
		// 내림차순 정렬 방법 [1]
		// Arrays.sort(s, Collections.reverseOrder());
		
		// 내림차순 정렬 방법 [2]
//		StringComparator c = new StringComparator();
//		Arrays.sort(s, c);
		
		// 내림차순 정렬 방법 [3]: 익명클래스 사용해서 정렬
		/*
		Arrays.sort(s, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1); // o1, o2 자리바꿔서 내림차순으로 만들었음 (-1 곱한 효과)
			}
		});
		*/
		
		// 내림차순 정렬 방법 [4]: 람다와 스트림 사용해서 정렬 (암기해둘것!!)
		// [3]과 같은 내용을 람다식으로 표현한 것
		// 람다식: 람다 연산자를 이용한 수식
		Arrays.sort(s, (o1, o2) -> o2.compareTo(o1)); // o1, o2 자리바꿔서 내림차순으로 만들었음 (-1 곱한 효과)
		
		// 결과 출력
		System.out.println(Arrays.toString(s)); // [sbs, mbc, kbs, jtbc]
		
		/*
		String a = "abC";
		String a2 = "abc";
		String b = "abD";
		String c = "abE";
		
		// System.out.println(a.equals(b)); // false
		// System.out.println(a.equalsIgnoreCase(b)); // false
		
		// compareTo() 메서드: 문자열의 내용이 같으면 0이 나옴
		System.out.println(a.compareTo(b)); // -1
		System.out.println(b.compareTo(a)); // 1
		System.out.println(a.compareTo(c)); // -2
		System.out.println(c.compareTo(a)); // 2
		
		// compareToIgnoreCase() 메서드: 문자열의 내용이 대소문자 상관없이 같으면 0이 나옴
		System.out.println(a.compareTo(a2)); // -32
		System.out.println(a.compareToIgnoreCase(a2)); // 0
		*/
		
	} // main
	
} // class

/*
class StringComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1; // 다운캐스팅
		String s2 = (String) o2; // 다운캐스팅
		return -1 * s1.compareTo(s2); // -1을 곱해서 내림차순으로 변경
	}
	
}
*/