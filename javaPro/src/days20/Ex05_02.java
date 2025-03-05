package days20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 김예지
 * @date 2025. 2. 28.
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		String source = "안녕하세요. 김예지입니다. "
				+ "폰번호:010-5560-1211, 집번호:055-337-0548 입니다.";
		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		
		// m.matches();
		// m.find();
		
		while (m.find()) {
			System.out.printf("%s\t%s %s %s\n", m.group(),
										m.group(1), m.group(2), m.group(3));
		} // while
		
		
		
		
		
		
//		while (m.find()) {
//			System.out.printf("%s\n", m.group());
//		} // while
		
		/*	출력결과
		 	010-5560-1211
			055-337-0548
		 */
		
	} // main
	
} // class
