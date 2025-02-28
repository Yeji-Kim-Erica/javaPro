package days20;

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
		 
		 boolean String.matches(String regex)
		 
		 */
		
		String[] data = { "bat", "baby", "bonus", "cA", "ca", "co", "c.",
				"c0", "car", "combat", "count", "date", "disc", "fx" };
		String regex = "[a-zA-Z&&[^b-d]].*";
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%s - %s패턴 : %b\n", data[i], regex, data[i].matches(regex));
		} // for i
		
		
	} // main
	
} // class
