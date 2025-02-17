package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yejikim
 * @date 2025. 2. 5. - 오후 2:01:41
 * @subject
 * @content
 */
public class Ex05_02 {
	public static void main(String[] args) throws IOException {
		// [문제]
		// 국어점수를 키보드로부터 입력받아서
		// 변수에 저장하고
		// "국어=90" 이라고 출력하는 코딩을 하자.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		byte kor;
		System.out.print("국어 점수를 입력하세요. : ");
		
		kor = Byte.parseByte(br.readLine()); // kor 변수에 저장하려면 입력받은 String을 byte로 형변환해야 함.
		
		// Byte.parseByte(String);
		// Integer.parseInt(String);
		// Double.parseDouble(String);
		// Short.parseShort(String);
		// 숫자형은 다 parse를 이용해 String에서 해당 자료형으로 변환 가능
		
		System.out.printf("국어=%d", kor);
	}
}
