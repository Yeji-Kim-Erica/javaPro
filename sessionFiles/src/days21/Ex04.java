package days21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * @author kenik
 * @date 2025. 3. 4. - 오전 11:33:23
 * @subject 
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// 1. LocalDate 클래스
		// LocalDate d = new  생성자가 보이지 않는다. 
		LocalDate d = LocalDate.now();
		System.out.println( d ); // 2025-03-04
		// 년
		// int year =  d.getYear();
		int year = d.get( ChronoField.YEAR );
		System.out.println( year );
		// 월
		// int month = d.getMonthValue();
		// Month month = d.getMonth();
		int month = d.get( ChronoField.MONTH_OF_YEAR );
		System.out.println( month );
		
		// 일 
		//int date = d.getDayOfMonth();
		// int day = d.getDayOfYear();
		int date = d.get(ChronoField.DAY_OF_MONTH);
		System.out.println( date );
		
		// 요일  1(월) 2(화) ~ 7(토)
		// DayOfWeek dow = d.getDayOfWeek();		// TUESDAY	
		// System.out.println( dow.getValue() );    // 2
		
		int dow = d.get(ChronoField.DAY_OF_WEEK);
		System.out.println( dow );             
		
		// 윤년체크 메소드 
		System.out.println( d.isLeapYear() );

	} // main

} // class







  