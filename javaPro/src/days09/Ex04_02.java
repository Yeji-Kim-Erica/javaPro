package days09;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 13. - 오후 12:34:01
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {

		// 830412-2700001
		Scanner scanner = new Scanner(System.in);
		String rrn = getRrn(scanner);
		System.out.println(rrn);
		
		// 생년월일 (출력형식: "1983년 4월 12일")
		String birthday = getBirthday(rrn);
		System.out.println(birthday);
		
		
	} // main

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
		case '5': case '6': return false;
		default: return true;
		} // switch
	}

	private static int getCentury(String rrn) {
		char century = rrn.charAt(7);
		
		switch (century) {
		case '0': case '9': return 1800;
		case '1': case '2': case '5': case '6': return 1900;
		default: return 2000;
		} // switch
	}

	private static boolean getGender(String rrn) {
		// 남자: true, 여자: false
		
		/* [1번째 방법] char	rrn.charAt(0);
		int gender = rrn.charAt(7) - '0';
		switch (gender%2) {
		case 1:
			return true;
		default:
			return false;
		} // switch
		*/
		
		// [2] String rrn.substring(0, 0)
		String strGender = rrn.substring(7, 8);
		int gender = Integer.parseInt(strGender);
		return gender%2==1 ? true : false;
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
