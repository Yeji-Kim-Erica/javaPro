package days23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author kenik
 * @date 2025. 3. 6. - 오후 2:51:04
 * @subject 
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		 
		Map<String, String> hm = new HashMap<>(); 
		
		hm.put("admin", "관리자");
		hm.put("kenik", "이창익");  
		hm.put("hong", "홍길동"); 
		
		System.out.println( hm );
		
		// 1. 모든 key 출력
		Set<String> ks = hm.keySet();
		Iterator<String> ir = ks.iterator();
		while (ir.hasNext()) {
			String key = (String) ir.next();
			String value = hm.get(key);
			System.out.printf("%s-%s\n", key, value);
		} // while
		
		System.out.println("-".repeat(60));
		
		// 4:01 수업 시작~ 
		// 2. 모든 value 출력
		Collection<String> vs = hm.values();
		ir = vs.iterator();
		while (ir.hasNext()) {
			String value = (String) ir.next();
			System.out.println(value);
		} // while
 
		// 3. 모든 엔트리( key-value 쌍 ) 출력.
		// value  hm.get(key)
		Set<Entry<String, String>> es = hm.entrySet();
		Iterator<Entry<String, String>> eir = es.iterator();
		
		while (eir.hasNext()) {
			Entry<String, String> entry = eir.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.printf("%s-%s\n", key, value);
		} // while


	} // main 

} // class








