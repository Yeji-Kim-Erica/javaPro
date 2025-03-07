package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days18\\Ex10.java";
		Map<Character, LinkedHashSet<String>> hm = new LinkedHashMap<>();
		for (int i = 'A'; i <= 'z'; i++) {
			if (Character.isAlphabetic(i))
				hm.put((char) i, new LinkedHashSet<String>());
		} // for i
		
		String line = null;
		
		try (FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader)) {
			
			StringBuilder sb = new StringBuilder();
			while ((line = br.readLine()) != null) {
				sb.append(line + " ");
			} // while
			
			String content = sb.toString();
			Pattern pattern = Pattern.compile("[A-Za-z][A-Za-z0-9가-힣]*"); // 시작은 알파벳 대문자, 소문자 중 하나
			Matcher matcher = pattern.matcher(content);
			
			char key;
			HashSet<String> value;
			while (matcher.find()) {
				String word = matcher.group();
				key = word.charAt(0);
				value = hm.get(key);
				value.add(word);
			} // while
			
			Set<Entry<Character, LinkedHashSet<String>>> es = hm.entrySet();
			Iterator<Entry<Character, LinkedHashSet<String>>> ir = es.iterator();
			while (ir.hasNext()) {
				Entry<Character, LinkedHashSet<String>> entry = ir.next();
				key = entry.getKey();
				value = entry.getValue();
				System.out.printf("[%c로 시작하는 단어 -%d개]\n", key, value.size());
				int no = 1;
				Iterator<String> ir2 = value.iterator();
				while (ir2.hasNext()) {
					String word = (String) ir2.next();
					System.out.printf("\t%d. %s\n", no++, word);
				}
				System.out.println("=".repeat(50));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
		System.out.println("end");
		
	} // main
	
} // class
