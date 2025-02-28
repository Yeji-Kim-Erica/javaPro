package days19;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject
 * @content
 */
public class Assignment {

	public static void main(String[] args) throws IOException {

//		// s 문자열 속 한글을 제외한 모든 문자는 제거
//		String s = "public static void 메인(String[] args) {";
//		System.out.println(s.replaceAll("[^ㄱ-힣]", ""));
		
		// [과제] 비밀번호 정규표현식
		// 알파벳 대문자 1개, 소문자 1개, 숫자 1개, 특수문자 1개 이상 포함
		// 문자열 길이 8~15사이
		
		String password = ""; // 비밀번호 입력 샘플: 1aA@2bB!
		String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*_])[A-Za-z\\d!@#$%^&*_]{8,15}";
		int count = 1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("대문자, 소문자, 숫자, 특수문자를 포함한 8~15자리 비밀번호를 입력해주세요.\n"
							+ "(사용가능한 특수문자: !@#$%^&*_)\n"
							+ "> 비밀번호 입력 : ");
			password = scanner.nextLine(); // 비밀번호 입력
			
			if (password.matches(regex)) { // 유효성 검사
				System.out.println("비밀번호 입력 성공");
				return;
			}
			
			System.out.printf("\n비밀번호 형식이 올바르지 않습니다. (현재 시도횟수: %d회)\n", count++);
			if (count < 4) System.out.println("[경고] 3회 이상 입력 시도 시 프로그램이 강제 종료됩니다.\n");
			else System.out.println("비밀번호 입력 시도가 3회 이상입니다. 프로그램이 종료됩니다.");
			
		} while (count<=3);
		scanner.close();

	} // main

} // Assignment class
