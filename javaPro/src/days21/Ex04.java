package days21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * @author 김예지
 * @date 2025. 3. 4.
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// 1. LocalDate 클래스
		// 생성자 X: new 연산자로 생성하지 않는다.
		
		LocalDate d = LocalDate.now();
		System.out.println(d); // 2025-03-04
		// 년
		// int year = d.getYear(); // [1]
		int year = d.get(ChronoField.YEAR); // [2]
		System.out.println(year);
		
		// 월
		// int month = d.getMonthValue();
		// Month month = d.getMonth();
		// E마크: Enum. 열거형
		int month = d.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(month);
		
		// 일
		// int date = d.getDayOfMonth();
		int date = d.get(ChronoField.DAY_OF_MONTH);
		System.out.println(date);
		
		// 요일
		// int dayOfWeek = d.get(ChronoField.DAY_OF_WEEK); // 2
		DayOfWeek dayOfWeek = d.getDayOfWeek(); // TUESDAY
		System.out.println(dayOfWeek);
		System.out.println(dayOfWeek.getValue()); // 2
		
		// 윤년체크 메소드
		System.out.println(d.isLeapYear()); // false
		
		
	} // main
	
} // class
