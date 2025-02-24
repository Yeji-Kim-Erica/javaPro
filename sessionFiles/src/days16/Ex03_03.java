package days16;

/**
 * @author kenik
 * @date 2025. 2. 24. - 오전 11:10:05
 * @subject 
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) { // String...args
		// 가변인자 사용 중~~                Object...args
		System.out.printf("%s %d %.2f %b\n", "홍길동", 20, 186.78, true, 'A');

		String [] names = {
				 "홍길동",
				 "김민곤",
				 "이찬희",
				 "오재문"
				};
		System.out.println( joinNames("-", names) );
		System.out.println( joinNames("/", names) );
		System.out.println( joinNames(":", "홍길동","김길동","이길동") );		
	} // main
	
	//public static String joinNames(String...args, String delimiter ) {
	public static String joinNames(String delimiter, String...args) {
		return String.join(delimiter, args);
	}

} // class








