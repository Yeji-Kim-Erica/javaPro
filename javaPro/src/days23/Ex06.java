package days23;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * @author 김예지 
 * @date 2025. 3. 6.
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// Map
		/* [Map]
		 	1. 키-값 쌍으로 데이터를 저장하는 구조
		 		엔트리(Entry)
		 	2. 키는 중복허용 X, 순서 유지 X
		 	3. Map 인터페이스를 구현한 클래스
		 		1) HashMap (신버전) == ArrayList
		 		4) Hashtable (구버전, 멀티스레드 안전. 동기화처리 O) == Vector
		 		=> [Hash]: 해싱이라는 기법을 사용해서 데이터를 저장 -> 검색 성능이 뛰어남
		 		
		 		* 해싱 기법: 해시 함수(hash function)을 이용해서 데이터를 해시테이블(hash table)에 저장하고 검색하는 기법
		 			ㄴ 해시 함수는 데이터가 저장되어있는 곳을 알려주기 때문에 다량의 데이터 중에 원하는 데이터를 빠르게 검색할 수 있다.
		 		
		 		> 동기화 처리 유무
		 		 - 동기화 처리 X: HashMap, ArrayList
		 		 - 동기화 처리 O: Hashtable, Vector
		 		
		 		2) TreeMap: 검색, 정렬이 용이
		 		3) LinkedHashMap: 삽입한 순서를 유지
		 		
		 */
		
		// <K, V>
		// K: Key로 사용할 타입을 입력
		// V: Value로 사용할 타입을 입력
		HashMap<String, String> hm = new HashMap<>(); // {hong=홍길동, admin=관리자, dpwl1003=김예지}, 순서 유지 X
		// LinkedHashMap<String, String> hm = new LinkedHashMap<>(); // {admin=관리자, dpwl1003=김예지, hong=홍길동}, 순서 유지 O
		// Key: ID, Value: 이름
		
		hm.put("admin", "관리자");
		hm.put("dpwl1003", "김예지");
		hm.put("hong", "홍길동");
		
		System.out.println(hm);
		
		// 검색, 수정, 삭제 - [key], value
		
		// 키 값으로 찾기
		System.out.println(hm.containsKey("dpwl1003")); // true
		// value 값으로 찾기
		System.out.println(hm.containsValue("김예지")); // true
		
		// 수정
		if (hm.containsKey("hong")) {
			// 해당 키 값이 저장된 엔트리(Entry)를 찾아야 함
			// System.out.println(hm.get("hong")); value 값 확인
			// hm.put("hong", "서주원");
			hm.replace("hong", "서주원");
		}
		System.out.println(hm);
		hm.put("park", "박지성");
		hm.put(null, null);
		hm.put(null, "널");
		System.out.println(hm);
		
		// null 키의 엔트리 삭제
		hm.remove(null); // 삭제된 엔트리의 Value 값을 돌려줌
		System.out.println(hm);
		
		// String value = hm.get("abc");
		String value = hm.getOrDefault("abc", "익명");
		System.out.println(value);
		
		// merge() 병합 메소드
		Map<String, Integer> map = new HashMap<>();
        
        // 초기 데이터 추가
        map.put("apple", 1);
        map.put("banana", 2);
        
        // merge() 메서드 사용 예
        map.merge("apple", 3, (oldValue, newValue) -> oldValue + newValue);  // 기존 값 + 새 값
        map.merge("banana", 1, (o, n) -> o + n); // 기존 값 + 새 값
        map.merge("cherry", 5, (oldValue, newValue) -> oldValue + newValue); // cherry는 처음 등장
        
        System.out.println(map); // {banana=3, cherry=5, apple=4}
		
	} // main
	
} // class
