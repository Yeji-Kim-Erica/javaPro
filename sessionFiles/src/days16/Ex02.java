package days16;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 2. 24. - 오전 9:49:53
 * @subject 
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		//		10. 아래 두 문자열의 대소문자 구분 없이, 순서 상관 없이 같은 문자여부를 체크하는 코딩을 하세요. 
		String n = "keNik";    //  [][][][][]
		String m= "kKnie";     //  [][][][][]

		// (암기) 두 문자열을 비교할 때는 == 연산자 X, equals(), equalsIgnores()
		// System.out.println( n.equalsIgnoreCase(m) );
		// 2. 대문자로 변화
		// System.out.println( n.toUpperCase() );
		// 1. 문자열 오름차순 정렬
		//    int [] m ={  3 5 2 4 1  }
		char [] nArr = n.toUpperCase().toCharArray(); 		
		Arrays.sort(nArr);
		char [] mArr = m.toUpperCase().toCharArray();
		Arrays.sort(mArr);
		
		System.out.println( Arrays.toString(nArr));
		System.out.println( Arrays.toString(mArr));
		
		// char [] -> String 변환
		n = String.valueOf(nArr);
		m = String.valueOf(mArr);
		
		System.out.println(  n.equals(m) );
		 
		// 3. 같은 문자열 비교


	} // main

	 

} // class







