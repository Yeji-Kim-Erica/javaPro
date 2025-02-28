package days19;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 2. 27. - 오전 10:38:19
 * @subject 
 * @content
 */
public class Ex04_02 {
	
	// Alt + Shift + S

	public static void main(String[] args) {

		// String s = "public static void main(String[] args) {";
		// 1. 문자열 길이 반환하는 메서드
		// System.out.println( s.length() ); // 40

		// 2. 문자열 속에서 특정 위치의 한 문자를 반환하는 메서드
		// System.out.println( s.charAt(0) );
		/*
		 * for (int i = 0; i < s.length(); i++) { System.out.printf("'%c'",
		 * s.charAt(i)); } // for i
		 */

		/*
		 * // 3. 대문자 변환, 소문자 변환 // 대문자 변환하는 새로운 문자열 반환. // s 문자열 불변 X
		 * System.out.println( s.toUpperCase() ); System.out.println( s.toLowerCase() );
		 * System.out.println( s );
		 */

		// 4. String [] s.split(regex)

		/*
		 * // 5. String -> char [] char [] sArr = s.toCharArray(); System.out.println(
		 * Arrays.toString(sArr) ); // 6. char[] -> String // String s2 = new
		 * String(sArr); String s2 = String.valueOf(sArr); System.out.println(s2 );
		 */

		// 7. trim() 문자열 앞 뒤의 공백 제거해서 문자열 반환하는 메서드
		// System.out.printf("[%s]", " 홍길동 ".trim() );

		// 11:01 수업 시작~
		// [문제]  s 문자열 속에 main 문자열 찾아서 MAIN으로 변경 코딩.
		// String s = "public static void main(String[] args) {";
		/*
		String searchWord = "in"; // 검색어   i999n   i\d*n
		// [3]
		System.out.println( s.replace(searchWord, searchWord.toUpperCase()) );
		System.out.println( s.replaceAll(searchWord, searchWord.toUpperCase()) );
		System.out.println( s.replaceFirst(searchWord, searchWord.toUpperCase()) );
		*/
		/*
		// [2]
		String [] sArr = s.split(searchWord);
		System.out.println( String.join(searchWord.toUpperCase(), sArr) );
		*/
		/* [1]
		if( s.contains(searchWord)  ) {  // [true], false
			int index = s.indexOf(searchWord);
			System.out.println( s.substring(0, index)  
					+ searchWord.toUpperCase() 
			        + s.substring(index + searchWord.length()) );
		} // if
		*/
		
		// indexOf()
		// contains()
		// substring()
		// join()
		// split()
		// replace()~
		
		// String s = "public static void main(String[] args) {";
//		System.out.println(  s.indexOf("main") ); // 21
//		System.out.println(  s.lastIndexOf("main") ); // 27
		
		
		/*
		// 문자열 연결
		String s2 =  "aaa" + "bbb" + "ccc"; // 문자열 연결 연산자 +
		String s3 = "aaa".concat("bbb").concat("ccc");  // 메서드
		
		// 문자열 
		s2.equals(s3);
		s2.equalsIgnoreCase(s3);
		*/
		
		String s = "public static void 메인(String[] args) {";
		
		// s 문자열 속에 한글을 제외한 모든 문자는 제거..
		System.out.println( s.replaceAll("[a-zA-Z() {}\\[\\]]", "") );
		//       . 한글은 제외 정규표현식
		
		// [과제] 비밀번호 정규표현식 
		//       알파벳 대문자 1개, 소문자 1개, 숫자 1개, 특수문자 1개
		//       문자열 길이 8~15 사이.
		// String regex ="";
		
		//         
		String s2 = reverse(s);
		//System.out.println(s2 ); 

	} // main

	private static String reverse(String s) {
		// s.toCharArray()
		// X
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			result = s.charAt(i) + result;
		} // for i
		return result;
	}

} // class









  