package days07;

import java.util.Arrays;

/**
 * @author yejikim
 * @date 2025. 2. 11. - 오전 11:12:02
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		// [시험문제] 그동안 써봤던 String 메서드 기능 설명
		// 문자열 메서드
		// 1. charAt()
		// 2. equals() / equalsIgnoreCase()
		// 3. length()
		// 4. valueOf()
		// 5. toUpperCase()/toLowerCase()
		// 6. format()
		// 7. toCharArray()
		// 8. "-".repeat(50)
		// 9. trim(): 앞뒤 공백 제거
		
		// String regex 에서 regex는 정규표현식
		
		String data = "홍길동,이창익,서영학,정창기";
		String regex = ",";
		String [] names = data.split(regex);
		System.out.println(Arrays.toString(names));
		
		// for문 예시
		
		int size = names.length;
		for (int i = 0; i < size; i++) {
			System.out.printf("names[%d]=\"%s\"\n", i, names[i]);
		} // for i
		
		// [foreach문] == 확장for문
//		for ( : 배열 또는 컬렉션 클래스) { }
		
//		for(String name : names) {
//			System.out.println(name);
//		} // 알아서 순서대로 배열의 요소에 모두 접근해서 출력
		
	} // main
	
}
