package days24;

import java.util.Enumeration;
import java.util.Properties;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		System.out.println(System.getProperty("user.dir"));
		// C:\Class\JavaClass\javaPro
		*/
		
		Properties p = System.getProperties();
		
		// propertyNames() : 모든 key값을 열거자로 반환하는 메서드
		Enumeration<String> en = (Enumeration<String>) p.propertyNames();
		while (en.hasMoreElements()) {
			String key = en.nextElement();
			String value = p.getProperty(key);
			System.out.printf("%s=%s\n", key, value);
		}
		
	} // main
	
} // class
