package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yejikim
 * @date 2025. 2. 5. - 오전 11:46:43
 * @subject
 * @content
 */
public class Ex05 {
	public static void main(String[] args) throws IOException {
		
		// [시험 문제] 키보드로부터 이름을 입력받아서 출력하는 작업
		
		// 자바는 키보드를 표준 입력장치라고 부름
		
		/*
		 * [키보드]	->	[System.in] (리턴값: byte Stream)	-> InputStramReader 클래스 -> BufferedReader (임시 기억공간 클래스)
		 * '이창'입력 ->	문자를 바이트값으로 인식 				-> 바이트 데이터를 문자로 변환  -> 문자 입력을 효율적으로 처리
		 * 
		 * InputStreamReader 단독 사용 시 한 글자씩 읽기만 가능하지만, BufferedReader를 사용하면 한 줄 단위로 입력받을 수 있음
		 * 
		 * String name = br.readLine();
		 */
		
		String name = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// readLine : 해당 라인의 string을 읽어오는 것. 출력값이 String임.
		
		System.out.print("> 이름을 입력해주세요. ");
		
		// name = br.readLine();
		// Unhandled exception type IOException : 
		name = br.readLine(); // readLine은 사용자가 Enter를 입력할 때까지 입력을 받는 메서드
		
		System.out.printf("이름: %s\n", name);
		
		
	}
}
