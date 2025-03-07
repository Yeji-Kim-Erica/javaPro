package days23;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * @author 김예지
 * @date 2025. 3. 6.
 * @subject 
 * @content 
 */
public class Ex08_02 {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days18\\Ex10.java";
		char one = '\u0000';
		int code = -1;
		
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		
		for (int i = '0'; i <= 'z'; i++) {
			char letter = (char) i;
			if (Character.isAlphabetic(letter) || Character.isDigit(letter)) hm.put(letter, 0);
		} // for i
		
		try (FileReader reader = new FileReader(fileName);){

			while ( (code = reader.read()) != -1 ) {
				if ( Character.isUpperCase(code) || Character.isLowerCase(code) || Character.isDigit(code)) {
					one = (char) code;
					hm.put(one, hm.get(one) + 1);
					}
			} // while

			// 막대그래프 그리기
			Set<Entry<Character, Integer>> es = hm.entrySet();
			Iterator<Entry<Character, Integer>> ir = es.iterator();
			while (ir.hasNext()) {
				Entry<Character, Integer> entry = ir.next();
				char key =  entry.getKey();
				int value = entry.getValue();
				System.out.printf("%c(%2d) %s\n", key, value, "#".repeat(value));
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	} // main
	
} // class
