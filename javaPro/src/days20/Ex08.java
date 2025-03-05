package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.util.Graphic2D;

/**
 * @author 김예지
 * @date 2025. 2. 28.
 * @subject 달력 그리기
 * @content Date 또는 Calendar 클래스를 사용하기
 * 			days12.Ex06.java
 */
public class Ex08 {

	public static void main(String[] args) {
		// 달력 만들기

		Scanner scanner = new Scanner(System.in);
		int year, month;

		System.out.printf("> year, month input ? ");
		year = scanner.nextInt();
		month = scanner.nextInt();

		printCalendar(year, month);
		
		
	} // main

	private static void printCalendar(int year, int month) {
		Calendar startDate = getStartDate(year, month);
		
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
		Graphic2D.drawLine(60, "-");
		String week = "일월화수목금토";
		for(int i = 0; i < week.length(); i++) {
			System.out.printf("\t%c", week.charAt(i));
		}
		System.out.println();
		Graphic2D.drawLine(60, "-");
		
		// startDate ~ 
		for (int i = 0; i < 42; i++) {
			int date = startDate.get(Calendar.DATE);
			System.out.printf((startDate.compareTo(Calendar.getInstance())==0) ? "\t[%2d]" : "\t%2d", date);
			if (i%7 == 6) System.out.println();
			startDate.add(Calendar.DATE, 1);
		} // for i
		
		System.out.println();
		Graphic2D.drawLine(60, "-");
		
	}

	private static Calendar getStartDate(int year, int month) {
		Calendar c = new GregorianCalendar(year, month, 1);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		c.add(Calendar.DATE, -dayOfWeek+1);
		return c;
	}
	
} // class
