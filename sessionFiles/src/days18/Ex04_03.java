package days18;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator; 

/**
 * @author kenik
 * @date 2025. 2. 26. - 오후 12:05:37
 * @subject 
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
		String [] s = { "kbs", "sbs", "mbc", "jtbc" };
		System.out.println( Arrays.toString(s) );
		// 문자열 배열을 내림차순 정렬...		
		// [1]
		// Arrays.sort(s, Collections.reverseOrder());
		
		// [2]
//		StringCompartor c = new StringCompartor();
//		Arrays.sort(s, c);
		
		// [3] 익명 클래스 사용해서 처리.
		/*
		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {				
				return o2.compareTo(o1);
			}
		} );
		*/
		//[4] 암기  람다식와 스트림
		Arrays.sort(s, (o1, o2) -> o2.compareTo(o1) );
		
		System.out.println( Arrays.toString(s) );
		
		/*
		String a = "abC";
		String b = "abc";
		
		// System.out.println( a.equals(b) );           // false
		// System.out.println( a.equalsIgnoreCase(b) ); // false
		
		System.out.println( a.compareTo(b) );  // -2
		System.out.println( b.compareTo(a) );  // 2
		
		System.out.println( b.compareToIgnoreCase(a) );  // 2
		*/

	} // main

} // class

/*
class StringCompartor implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		return -1 * s1.compareTo(s2);  
	}	
}
*/

  