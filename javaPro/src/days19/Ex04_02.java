package days19;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject String 클래스가 가지고 있는 메소드들 살펴보기
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		String s = "public static void main(String[] args) {";
		
		// 1. 문자열.length() : 문자열의 길이를 반환하는 메서드
//		System.out.println(s.length()); // 40
		
		// 2. .charAt(숫자) : 문자열 속에서 특정 위치의 한 문자를 반환하는 메서드
		// System.out.println(s.charAt(0)); // p
//		for (int i = 0; i < s.length(); i++) {
//			System.out.printf("'%c',", s.charAt(i));
//		} // for i
	// 'p','u','b','l','i','c',' ','s','t','a','t','i','c',' ','v','o','i','d',' ','m','a','i','n','(','S','t','r','i','n','g','[',']',' ','a','r','g','s',')',' ','{',
		
		// 3. 문자열.toUpperCase(), 문자열.toLowerCase() : 문자열을 대문자/소문자로 변환
//		System.out.println(s.toUpperCase()); // PUBLIC STATIC VOID MAIN(STRING[] ARGS) {
//		System.out.println(s); // public static void main(String[] args) {
		// 문자열은 불변이기 때문에 실제 s 값이 바뀌지는 않음.
		
		// 4. String[] s.split(regex)
		
		// 5. 변수명.toCharArray() : String -> char[]
//		char[] sArr = s.toCharArray();
//		System.out.println(Arrays.toString(sArr));
	// [p, u, b, l, i, c,  , s, t, a, t, i, c,  , v, o, i, d,  , m, a, i, n, (, S, t, r, i, n, g, [, ],  , a, r, g, s, ),  , {]
		
		// 6. new String(배열명), String.valueOf(배열명) : char[] -> String
		//	1) String s2 = new String(sArr);
		//	2) String s2 = String.valueOf(sArr);
//		System.out.println(s2); // public static void main(String[] args) {
		
		// 7. 문자열.trim() : 문자열 앞뒤의 공백을 제거해서 문자열을 반환하는 메서드
//		System.out.printf("[%s]", " 홍길동 ".trim()); // [홍길동]
		
		// [문제] s 문자열 속에 있는 main 문자열을 찾아서 MAIN으로 변경하는 코딩
//		String searchWord = "main"; // 검색어
		
		// 8. 문자열.contains(문자열)
		
		/*
		// [1]
		if (s.contains(searchWord)) { // [true], false
			int index = s.indexOf(searchWord);
			System.out.println(s.substring(0, index)
							+ searchWord.toUpperCase()
							+ s.substring(index + searchWord.length()));
		} // if
		
		// [2]
		String[] sArr = s.split(searchWord);
		System.out.println(String.join(searchWord.toUpperCase(), sArr));
		*/
		
		// 9. 문자열.replace(old문자열, new문자열)
		
		// [3]
//		String searchWord2 = "in";
//		System.out.println(s.replace(searchWord, searchWord.toUpperCase()));
//		// public static void MAIN(String[] args) {
//		System.out.println(s.replaceAll(searchWord2, searchWord2.toUpperCase()));
//		// public static void maIN(StrINg[] args) {
//		System.out.println(s.replaceFirst(searchWord2, searchWord2.toUpperCase()));
//		// public static void maIN(String[] args) {
		
//		String s = "public static void main(String[] args) {";
//		System.out.println(s.indexOf("in")); // 21 (앞에서부터 찾아서 해당 문자의 인덱스 값을 돌려줌)
//		System.out.println(s.lastIndexOf("in")); // 27 (뒤에서부터 찾아서 해당 문자의 인덱스 값을 돌려줌)
		
		// 10. +, 문자열.concat(문자열) 문자열 연결
		
		// 11. equals
		
		// 내가 쓴 코딩
//		String[] sArr = s.split("");
//		for (int i = sArr.length-1; i >= 0; i--) {
//			System.out.print(sArr[i]);
//		} // for i
		
		// 풀이 [1]
		String s2 = reverse(s);
		System.out.println(s2);
		
		// s 문자열 속 한글을 제외한 모든 문자는 제거
		String s1 = "public static void 메인(String[] args) {";
		System.out.println(s1.replaceAll("[a-zA-Z() {}\\[\\]]", ""));
										// 영문자 괄호
		System.out.println(s1.replaceAll("[^ㄱ-힣]", ""));
		
		// [과제] 비밀번호 정규표현식
		// 알파벳 대문자 1개, 소문자 1개, 숫자 1개, 특수문자 1개 이상 포함
		// 문자열 길이 8~15사이
		
		
	} // main

	private static String reverse(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			result = s.charAt(i) + result;
		} // for i
		return result;
	}
	
} // class
