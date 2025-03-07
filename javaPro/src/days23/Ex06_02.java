package days23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author 김예지 
 * @date 2025. 3. 6. 
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		Map<String, String> hm = new HashMap<>(); // {hong=홍길동, admin=관리자, dpwl1003=김예지}, 순서 유지 X
		
		hm.put("admin", "관리자");
		hm.put("dpwl1003", "김예지");
		hm.put("hong", "홍길동");
		
		System.out.println(hm);
		
		// 1. 모든 key값 출력
		Set<String> ks = hm.keySet();
		Iterator<String> ir = ks.iterator();
		while (ir.hasNext()) {
			String key = (String) ir.next();
			System.out.println(key);
		}
		System.out.println("-".repeat(60));
		
		// 2. 모든 value 값 출력
		Collection<String> vs = hm.values();
		ir = vs.iterator();
		while (ir.hasNext()) {
			String value = (String) ir.next();
			System.out.println(value);
		}
		
		// 3. 모든 엔트리(key-value 쌍) 출력
		Set<Entry<String, String>> es= hm.entrySet();
		Iterator<Entry<String, String>> eir = es.iterator();
		while (eir.hasNext()) {
			Entry<String, String> entry = eir.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.printf("%s-%s\n", key, value);
		}
		
	} // main
	
} // class
