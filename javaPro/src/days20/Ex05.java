package days20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 김예지
 * @date 2025. 2. 28.
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		 [정규표현식(Regular Expression)] regex
		 : 문자열 속에서 원하는 패턴(pattern)과 일치하는 문자열을 찾기 위해 사용되는 식
		 	ㄴ 미리 정의된 기호와 문자
		 	ㄴ java.util.rex 패키지
		 		ㄴ Pattern 클래스: 정규식을 정의하기 위한 클래스
		 		ㄴ Matcher 클래스:  실제 데이터와 만들어진 패턴 객체(정규식)를 비교해서 체크하는 클래스
		 		-> 정규표현식과 관련된 자바 클래스
		 */
		
		String[] data = { "bat", "baby", "bonus", "cA", "ca", "co", "c.",
				"c0", "car", "combat", "count", "date", "disc", "fx" };
		String regex = "[a-zA-Z&&[^b-d]].*";
	      // String regex = "c[a-z]*"; // c문자 시작해서 소문자 0~여러개 패턴
	      // String regex = "c[a-z]";  // c문자 + 소문자 1개
	      // String regex = "c[a-zA-Z]"; // c문자 + 알파벳 1개
	      
	      // String regex = "c[a-zA-Z0-9]"; // c문자로 시작, 알파벳/숫자 1개
	      // String regex = "c\\w"; // c문자로 시작 + 알파벳/숫자/_ 중 1개
	      // String regex = ".*"; // 아무 문자나 0개 이상
	      // String regex = "c."; // c문자로 시작 + 아무 문자나 1개
	      // String regex = "c\\."; // c + 문자
	      // String regex = "c[0-9]"; // c문자로 시작 + 숫자 1개
	      // String regex = "c.*t"; // c문자로 시작 + 아무 문자나 0개 이상 + t문자로 끝남
	      // String regex = "[b|c]"; // b문자 또는 c문자
	      // String regex = "[bc]"; // b문자 또는 c문자
	      // String regex = "[b-c].*"; // b ~ c 문자로 시작 + 아무 문자나 0개 이상
	      // String regex = "[^bc].*"; // b문자 또는 c문자가 아닌 문자로 시작 + 아무 문자나 0개 이상

	      // String regex = ".*a.*"; // a문자 포함

	      // String regex = "[^bcd].*"; // b 또는 c 또는 d 문자가 아닌 문자로 시작 + 아무 문자나 0개 이상

	      // String regex = "[a-zA-Z].*"; // 알파벳으로 시작 + 아무 문자나 0개 이상
	      // String regex = "[ae-zA-Z].*"; // 대문자 또는 소문자 a 또는 소문자 e ~ z 중 한 문자로 시작 + 아무 문자나 0개 이상
		
		// [2]
		Pattern pattern = Pattern.compile(regex);
		for (int i = 0; i < data.length; i++) {
			Matcher matcher = pattern.matcher(data[i]);
			if (matcher.matches()) {
				System.out.println(data[i]);
			}
		} // for i
		
		/*
		// [1]  boolean String.matches(String regex)
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%s - %s패턴 : %b\n", data[i], regex, data[i].matches(regex));
		} // for i
		*/
		
	} // main
	
} // class
