package days20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kenik
 * @date 2025. 2. 28. - 오후 12:03:12
 * @subject 
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		String source = "안녕하세요. 홍길동입니다."
				+ "폰번호:011-1234-5678, 집번호: 9입니다.";
		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		
		// m.matches()
		// m.find() 
		while ( m.find() ) {
			System.out.printf("%s\t%s\t%s\t%s\n", m.group()
					, m.group(1), m.group(2), m.group(3));
		} // while
		
		
		

	} // main

} // class
  