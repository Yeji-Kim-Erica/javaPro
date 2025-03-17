package days25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) throws IOException {
		// 키보드로부터 한문자 입력
		// System.in.read();
		
		/* [1]
		InputStream is = System.in;
	//		ㄴ 표준입력장치(키보드)로부터 읽어들일 수 있음. -> 입력은 바이트스트림으로
		System.out.print("> 한 문자 입력 : ");
		int b = is.read(); // 바이트 정수값을 받음
		System.out.printf("%d-%c\n", b, b);
		// a 입력시 97-a 출력
		*/
		
		/* [2] 한글을 입력하려면?
		System.out.print("> 이름을 입력 : ");
		String name;
		// Scanner 사용
		// InputStreamReader 클래스 : 문자 스트림 (끝에 붙은 내용이 중요. Reader!)
		// BufferedReader 클래스 : 문자 스트림
		// InputStream : 바이트 스트림
		
		// 키보드 -> System.in 바이트스트림으로 읽어옴 (리턴 자료형이 InputStream)
		// 한글을 읽어오기 위해서는 3	바이트를 하나의 문자로 읽어와야 함
		// [][][] -> 한문자로 변환해주는 보조 스트림: InputStreamReader
		// 한 문자들을 모아서 한 라인 단위로 처리할 보조 스트림: BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		name = br.readLine();
		System.out.println(name);
		*/
		
		// [3]
		InputStream is = System.in;
		System.out.print("> 한 문자 입력 : ");
		
		/*
		int b = is.read(); // 1바이트
		System.out.printf("%d-%c\n", b, b);
		
		//	> 한 문자 입력 : 가
		//	234-ê

		//	> 한 문자 입력 : 각
		//	234-ê
		*/
		
		// [문제] 이름 입력 : 홍길동enter
		// 이름 입력 받을 방법 고민해보기
		
		byte[] b = new byte[3];
//		int n = is.read(b);
//		
//		for (byte c : b) {
//			System.out.println(c);
//		}
////		> 한 문자 입력 : 홍
////		-19
////		-103
////		-115
//		
//		char one = new String(b).charAt(0);
//		System.out.println(one); // 홍
		InputStreamReader reader = new InputStreamReader(is);
		int n = -1;
		while ((n = reader.read())!=-1) {
			System.out.printf();
		} // while
		
		
	} // main
	
} // class
