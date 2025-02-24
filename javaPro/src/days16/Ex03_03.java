package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		
		// 가변인자 사용 사례: printf
		// System.out.printf(String format, Object... args) → Object... args
		
		System.out.println(joinNames("/", "홍길동", "홍길동", "홍길동")); // 홍길동/홍길동/홍길동
		
	} // main
	
	public static String joinNames(String delimiter, String... args) {
		return String.join(delimiter, args);
	}
	
} // class
