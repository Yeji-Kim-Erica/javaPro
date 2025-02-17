package com.util;

/**
 * @author yejikim
 * @date 2025. 2. 12. - 오후 4:39:04
 * @subject
 * @content
 */
public class MyCalendar {

	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

}
