package days18;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject 예외처리 2번째 방법: throws문 설명 throw[s]
 * @content 예외를 강제로 발생시키는 문: throw문 설명 throw
 */
public class Ex08 {

	public static void main(String[] args) { // main 메소드에서 throws문 사용: 예외처리를 안하겠다는 뜻
		
		// System.in.read(); 이해해보자
		
		// 국어점수를 입력받아서 수우미양가 출력
		int kor = 0;
		try {
			kor = getScore();
			System.out.println("kor = " + kor);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	} // main

	private static int getScore() throws IOException, ArrayIndexOutOfBoundsException { // 여러개 throws 가능
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		
		System.out.print("> 점수 입력 ? ");
		String input = scanner.next();
		
		// 0~100 유효성 검사
		String regex = "^(\\d|[1-9]\\d|100)$";
		
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
		} else {
			// 강제로 예외를 발생시킬 때: throw문 사용
			// throw new IOException("> 점수 범위 0~100"); 빨간줄 O (checked 예외)
			// throw new ArithmeticException ("> 점수 범위 0~100"); 빨간줄 X (unchecked 예외)
			throw new IOException("> 점수 범위 0~100"); // 예외를 강제로 발생시킴
		}
		
		return score;
	}
	
} // class
