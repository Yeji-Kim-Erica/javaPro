package days09;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 13. - 오후 12:34:01
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
	/* [주민등록번호]
	 * 1. Resident Registration Number, RRN
	 * 2. ㄱㄴㄷㄹㅁㅂ - ㅅㅇㅈㅊㅋㅌㅍ
	 * 	1) ㄱㄴㄷㄹㅁㅂ : 생년월일
	 * 	2) ㅅ : 18세기, 19세기, 20세기... + 성별
	 *  3) ㅇㅈㅊㅋ :  출생등록지 고유번호(ㅇㅈ), 읍·면·동주민센터 고유번호 (ㅊㅋ)
	 *  4) ㅌ : 그날 주민센터에서 출생신고를 한 순서
	 *  5) ㅍ : 주민등록번호에 오류가 없는지 확인하는 검증번호
	 *  	ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
	 * 		즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ
	*/
		// 주민등록번호 입력 받기 (예시: 830412-2700001)
		Scanner scanner = new Scanner(System.in);
		String rrn = getRrn(scanner);
		System.out.println(rrn);
		
		// (ㄱㄴㄷㄹㅁㅂ - [ㅅ]ㅇㅈㅊㅋㅌㅍ)
		
		// 1. 성별 : 남자/여자 (남자: true, 여자: false)
		boolean gender = getGender(rrn);
		System.out.println(gender ? "남자" : "여자");
		
		// 2. 세기(Century) : 1800/1900/2000
		int century = getCentury(rrn);
		System.out.println(century);
		
		// 3. 국적 : 내국인/외국인 (내국인: true, 외국인: false)
		boolean nationality = getNationality(rrn);
		System.out.println(nationality ? "Korean" : "Foreigner");
		
	} // main

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
