package days18;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 26. - 오후 2:48:35
 * @subject   예외처리 2번째 방법         : throw[s]문 설명
 * @content   예외를 강제로 발생시키는 문 : throw문 설명
 */
public class Ex08 {

	public static void main(String[] args) {
		
		// System.in.read(); 이해
		
		// 국어점수를 입력받아서 수~가 출력.
		int kor = 0;
		try {
			kor = getScore();
			System.out.println("kor = " + kor);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("end");
	} // main

	private static int getScore() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		
		System.out.print("> 점수 입력 ? ");
		String input = scanner.next(); // "90"
		
		// 0 ~ 100 유효성 검사
		String regex = "^(\\d|[1-9]\\d|100)$";
		
		if( input.matches(regex) ) {
			score = Integer.parseInt(input);
		}else {
			// 강제 예외 발생 시키겠다. :   throw문 사용
			throw new IOException("> 점수 범위 0~100 ~~");
			//throw new ArithmeticException("> 점수 범위 0~100 ~~");
		}
		
		return score;
	}

} // class








  