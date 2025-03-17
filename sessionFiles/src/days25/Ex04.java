package days25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author kenik
 * @date 2025. 3. 10. - 오전 11:17:47
 * @subject   팀장/팀명
 * @content
 */
public class Ex04 {

	public static void main(String[] args) throws IOException {
		// 키보드로 부터 한 문자 입력..
		// System.in.read();
		// 표준입력장치(키보드) -> 입력 바이트스트림
		// [1]
		/*
		InputStream is =  System.in;		
		System.out.print("> 한 문자 입력 : ");
		int b = is.read(); // 1바이트
		System.out.printf("%1$d-%1$c\n", b);
		*/
		// [2]
		/*
		String name ;
		// Scanner 사용
		// InputSteam System.in : 바이트 스트림
		// InputStream[Reader] 클래스 : 문자 스트림
		// Buffered[Reader]   클래스  : 문자 스트림
		
		// 키보드 -> System.in 표준 바이트스트림 - [][][] ->한문자  InputStreamReader 보조스트림
		//                                         [][][][][][][][][]
		//                                                 한 라인 단위 로 처리할 보조스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("> 이름을 입력 : ");
		name = br.readLine();
		System.out.println( name );
		*/

		// [3]
		InputStream is =  System.in;		
		System.out.print("> 한 문자 입력 : ");
//		int b = is.read(); // 1바이트
//		System.out.printf("%1$d-%1$c\n", b);
//		> 한 문자 입력 : 가
//		234-ê
//		> 한 문자 입력 : 각
//		234-ê
		
		// 스캐너, br 사용하지 않고
		// [문제] > 이름 입력 : 홍길동enter
		byte [] b = new byte[3];
		int n = is.read(b);
		
		for (byte c : b) {
			System.out.println(c);
		}
		
		char one = new String(b).charAt(0);
		System.out.println(one );
		
	} // main

} // class







  