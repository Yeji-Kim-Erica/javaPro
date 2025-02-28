package days19;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject [문자열을 다루는 클래스]
 * @content	1. String 클래스
 			2. StringBuffer 클래스
 			3. StringBuilder 클래스
 			4. StringTokenizer 클래스 == String.split() Ex05_04.java
 			5. StringJoiner 클래스	 == String.join()
 */
public class Ex04 {

	public static void main(String[] args) {
		/* [1. String 클래스]
			  ㄴ 문자열 자료형
			  	ㄴ 문자열 나열 char[]
			  ㄴ String 클래스는 "변경 불가능한(immutable) 클래스"임 << 암기해둘것!!
		*/
		
//		String name = new String("홍길동");
//		System.out.println(name.toString());
		
		String name = "홍길동"; // name의 주소값이 "홍길동"이라는 의미
		System.out.println(name); // "홍길동"이라는 주소값을 가진 기억공간에 저장된 데이터 "홍길동"을 출력
		
		String name2 = "홍길동"; // name과 name2는 주소값이 "홍길동"으로 동일함
		//따라서
		System.out.println(name == name2); // 출력결과: true
		// 주소값끼리 비교한 것으로, true가 출력됨
		
		String name3 = new String("홍길동");
		System.out.println(name == name3); // 출력결과: false
		// 새롭게 인스턴스가 생성되어 주소값이 서로 다르므로 false
		
		System.out.println(name.hashCode());
		System.out.println(name3.hashCode());
		
		System.out.println(((Object)name).toString());
		System.out.println(((Object)name3).toString());
		// name과 name3의 주소값을 보려면 어떻게 해야 할까?......
		
		
	} // main
	
} // class
