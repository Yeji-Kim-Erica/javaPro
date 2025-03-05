package days20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 김예지
 * @date 2025. 2. 28.
 * @subject
 * @content
 */
public class Ex05_03 {

	public static void main(String[] args) {
		String source = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
		String pattern = "홍길동";
		
		StringBuffer sb = new StringBuffer();
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		
		System.out.println(source);
		
		int cnt = 0;
		while (m.find()) {
			cnt++;
			System.out.printf("start:%d ~ end:%d\n", m.start(), m.end());
			if (cnt == 2) m.appendReplacement(sb, "김예지");
		} // while
		m.appendTail(sb);
		
		System.out.println(sb);
		
	} // main
	
}
