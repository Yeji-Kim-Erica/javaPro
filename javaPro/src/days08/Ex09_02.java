package days08;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 12. - 오후 4:27:48
 * @subject
 * @content
 */
public class Ex09_02 {

	public static void main(String[] args) {

		// [문제] 1년 ~ 2025년까지 총 몇번의 윤년이 존재하는가?
//		int minYear = 1, maxYear = 2025;
//		countLeapYear(minYear, maxYear);
		// [1]
//		int count = 0;
//		for (int i = minYear; i <= maxYear; i++) {
//			if (isLeapYear(i)) {
//				count++;
//			}
//		} // for i
		
		// [2]
		int leapYearCount = 0;
		leapYearCount = 2025/4 - 2024/100 + 2025/400;
		System.out.println(leapYearCount);
		
	} // main

//	private static void countLeapYear(int minYear, int maxYear) {
//		int count = 0;
//		for (int i = minYear; i <= maxYear; i++) {
//			if (isLeapYear(i)) {
//				count++;
//			}
//		} // for i
//		System.out.printf("1년 ~ 2025년까지 윤년 횟수: %d번", count);
//		
//	}
//
//	private static boolean isLeapYear(int year) {
//		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
//	}

} // class
