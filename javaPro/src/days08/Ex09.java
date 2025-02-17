package days08;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 12. - 오후 3:49:23
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {

		// [문제] 년도를 입력받아서 윤년/평년 출력
		// 윤년? 오차를 보정하기 위해 일/주/월이 추가된 해
		// 지구이 태양을 공전하는 데 걸리는 시간: 365.2422일
		// 그레고리력 상으로 계산 : 365.2425일
		// > 치윤법
		// 400년 안에 97일을 배분 (0.2425일 * 400 = 97)
		// 1. 4 배수년도마다 1일 추가 -> 100일 추가 (3일 초과)
		// 2. 100 배수년도마다 1일 빼기 -> (1일 초과)
		// 3. 400 배수년도마다 1일 추가 -> 초과 일수 보정 완료 (0일 초과)

		/*
		 * [치윤법]
		 * ① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고,
		 * 		year % 4 == 0
		 * ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며,
		 * 		year % 100 != 0
		 * ③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다
		 * 		year % 400 == 0
		 */
		
		int year;
		Scanner scanner = new Scanner(System.in);
		year = getYear(scanner);
		
		if (isLeapYear(year)) {
			System.out.println("윤년(leap year)");
		} else {
			System.out.println("평년(common year)");
		}

	} // main

	private static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	private static int getYear(Scanner scanner) {
		// 년도 유효성 검사 리턴 (년도는 1년부터 시작)
		String regex = "\\d*";
		String strYear;
		
		do {
			System.out.print("> 년도 입력 ? ");
			strYear = scanner.next();
		} while (!strYear.matches(regex));
		
		return 0;
	}

}
