package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject
 * @content
 */
public class Ex01_01 {

	public static void main(String[] args) {

		LinkedHashMap<Character, LinkedHashSet<String>> words = new LinkedHashMap<>();
		for (int i = 'A'; i <= 'z'; i++) {
			if (Character.isUpperCase(i))
				words.put((char) i, new LinkedHashSet<String>());
			else if (Character.isLowerCase(i))
				words.put((char) i, new LinkedHashSet<String>());
		} // for i

		String fileName = ".\\src\\days18\\Ex10.java";
		String line = null;
		String[] lineArr = null;

		try (FileReader reader = new FileReader(fileName); BufferedReader br = new BufferedReader(reader)) {
			while ((line = br.readLine()) != null) {
				lineArr = line.split("\\W+|\\d+|_+");
				for (int i = 0; i < lineArr.length; i++) {
					if (!(lineArr[i]).equals("")) {
						char first = lineArr[i].charAt(0);
						if (Character.isAlphabetic(first)) {
							words.get(first).add(lineArr[i]);
						}
					}
				} // for i
			} // while
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch

		Set<Entry<Character, LinkedHashSet<String>>> es = words.entrySet();
		Iterator<Entry<Character, LinkedHashSet<String>>> eir = es.iterator();
		while (eir.hasNext()) {
			Entry<Character, LinkedHashSet<String>> entry = eir.next();
			char key = entry.getKey();
			LinkedHashSet<String> value = entry.getValue();
			System.out.printf("[%c로 시작하는 단어 -%d개]\n", key, value.size());
			Iterator<String> hsir = value.iterator();
			int no = 1;
			while (hsir.hasNext()) {
				String word = hsir.next();
				System.out.printf("\t%d. %s\n", no++, word);
			}
			System.out.println("=".repeat(50));
		}
		
		System.out.println("end");

	} // main

} // class
