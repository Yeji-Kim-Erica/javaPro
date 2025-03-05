package days21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kenik
 * @date 2025. 3. 4. - 오전 10:35:18
 * @subject 
 * @content  days20.Ex05_02.java
 */
public class Ex02_03 {

	public static void main(String[] args) {		
		String s = "이름:홍길동, 나이:20살, 성별:여자";

		String name;
		int age;
		boolean gender;

		String pattern = "이름:([가-힣]{2,}), 나이:(\\d+)살, 성별:([가-힣]{2})";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(s);

		if ( m.find() ) {
			 // m.group()
			 name = m.group(1);
			 age = Integer.parseInt( m.group(2) );
			 gender =  m.group(3).equals("남자")?true:false;
			  
			 System.out.println( name ); 
			 System.out.println( age ); 
			 System.out.println( gender ); 
		} // while




	} // main

} // class








