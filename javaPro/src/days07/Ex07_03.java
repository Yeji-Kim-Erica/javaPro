package days07;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 11. - 오후 4:42:10
 * @subject 입력값에 대한 유효성 검사
 * @content 유효성 검사 (숫자에 국한되지 않은 검사)
 */
public class Ex07_03 {

	public static void main(String[] args) throws IOException {

		// String 클래스의 matches 메서드
		// 입력한 문자열.matches(regex) -> boolean 값이 나옴
		// [] -> 정규표현식 문법에서 [] 안의 형식에 하나라도 해당하는 묻는 문법
		
		// 사용자의 가위 바위 보 입력값에 대한 유효성 검사...

		int user;
		String input;
		Scanner scanner = new Scanner(System.in);

		System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
		input = scanner.next();
		String regex = "[1-3]"; // 예: "[a-zA-Z0-9]"
		
		if (input.matches(regex)) {
			user = Integer.parseInt(input);
			System.out.printf("> user=%d\n", user);
		} else {
			System.out.println("입력 다시");
		}
		
	} // main

}
