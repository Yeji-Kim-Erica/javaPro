package days19;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
//		System.out.println("abC".compareTo("abc")); // -32
//		System.out.println("abC".compareToIgnoreCase("abc")); // 0
		
		String url = "http://";
		// String url = "www.naver.com"
		// String url = "ftp://www.naver.com"
		// String url = "https://www.naver.com"
		
//		url.charAt(0) == 'h';
//		url.charAt(1) == 't';
//		url.charAt(2) == 't';
//		url.charAt(3) == 'p';
//		url.charAt(4) == ':';
//		url.charAt(5) == '/';
//		url.charAt(6) == '/';
		
//		url.substring(0, 7).equals("http://");
		
		// startsWith(prefix), endsWith(suffix) 메서드 활용
		String prefix = "http://";
		System.out.println(url.startsWith(prefix)); // true
		
		String fileName = "Sample.java";
		System.out.println(fileName.endsWith(".java")); // true
		
		/*
		 Ex04_03.java 파일에서 url 이  http:// 으로 시작하는 체크를 정규표현식을 사용해서 검사하는 코딩을 해 보세요 . 
		 */
		
		url = "http://school.programmers.co.kr/learn/courses/30/lessons/181944";
		
		System.out.println(url.matches("http://.*"));
		// matches 함수 자체에 regex 앞뒤로 ^와 $가 들어가있는 것과 마찬가지이므로, ^나 $를 쓰지 않음.
		
	} // main
	
} // class
