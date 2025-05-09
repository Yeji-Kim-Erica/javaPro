package days09;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 13. - 오후 12:34:01
 * @subject
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {

		// 830412-2700001
		Scanner scanner = new Scanner(System.in);
		String rrn = getRrn(scanner);
		System.out.println(rrn);

		// 주민등록번호를 가지고 [한국(세는)나이], [만나이] 계산하기
//		int age = getCountingAge(rrn); // 한국나이 = 올해년도 - 생일년도 + 1
		int age = getAmericanAge(rrn); // 만나이
		System.out.println(age);

	} // main

	private static int getAmericanAge(String rrn) {

		int americanAge = getCountingAge(rrn) - 1;
		int birthDate = Integer.parseInt(rrn.substring(2, 6));
		
		LocalDate d = LocalDate.now();
		int currentDate = d.getMonthValue()*100 + d.getDayOfMonth();
		return birthDate <= currentDate ? americanAge : americanAge - 1;
		
		/*
		int age = getCountingAge(rrn) - 1;
		int bMonth = Integer.parseInt(rrn.substring(2, 4));
		int bDay = Integer.parseInt(rrn.substring(4, 6));

		LocalDate d = LocalDate.now();
		int currentMonth = d.getMonthValue();
		int currentDay = d.getDayOfMonth();

		if (bMonth < currentMonth)
			return age;
		else if (bMonth == currentMonth)
			return (bDay <= currentDay) ? age : age - 1;
		else
			return age - 1;
		*/
		}

	private static int getCountingAge(String rrn) {
		// 자바에서 날짜/시간을 다루는 기능들이 구현된 클래스 : Date, Calendar
		// LocalDate, LocalTime, LocalDateTime
		/*
		 * [1번째 방법] Date d = new Date(); System.out.println(d.getYear() + 1900);
		 */
		/*
		 * [2번째 방법] Calendar c = Calendar.getInstance();
		 * System.out.println(c.get(Calendar.YEAR));
		 */

		LocalDate d = LocalDate.now();
		int currentYear = d.getYear(); // 올해년도
		// int birthYear = Integer.parseInt(getBirthday(rrn).substring(0, 4));
		int birthYear = getYear(rrn);

		return currentYear - birthYear + 1;
	}

	private static int getYear(String rrn) {
		int year = getCentury(rrn) + Integer.parseInt(rrn.substring(0, 2));
		return year;
	}

	private static String getBirthday(String rrn) {
		int year = getCentury(rrn) + Integer.parseInt(rrn.substring(0, 2));
		int month = Integer.parseInt(rrn.substring(2, 4));
		int day = Integer.parseInt(rrn.substring(4, 6));

		return String.format("%d년 %d월 %d일", year, month, day);
	}

	private static boolean getNationality(String rrn) {
		// (내국인: true, 외국인: false)

		char nationality = rrn.charAt(7);
		switch (nationality) {
		case '5':
		case '6':
			return false;
		default:
			return true;
		} // switch
	}

	private static int getCentury(String rrn) {
		char century = rrn.charAt(7);

		switch (century) {
		case '0':
		case '9':
			return 1800;
		case '1':
		case '2':
		case '5':
		case '6':
			return 1900;
		default:
			return 2000;
		} // switch
	}

	private static boolean getGender(String rrn) {
		// 남자: true, 여자: false

		/*
		 * [1번째 방법] char rrn.charAt(0); int gender = rrn.charAt(7) - '0'; switch
		 * (gender%2) { case 1: return true; default: return false; } // switch
		 */

		// [2] String rrn.substring(0, 0)
		String strGender = rrn.substring(7, 8);
		int gender = Integer.parseInt(strGender);
		return gender % 2 == 1 ? true : false;
	}

	private static String getRrn(Scanner scanner) {
		String regex = "[0-9]{6}-[0-9]{7}";
		String rrn;
		do {
			System.out.print("> 주민등록번호 14자리 입력(예: 000000-0000000) ? ");
			rrn = scanner.next();

		} while (!rrn.matches(regex));

		return rrn;
	}

} // class
