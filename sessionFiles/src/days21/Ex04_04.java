package days21;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author kenik
 * @date 2025. 3. 4. - 오후 12:38:47
 * @subject 
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {
		// now(), of()
		// with(), withXXX()
		// *** plus(), plusXXX()
		// *** minus(), minusXXX()
		
		// 이번 달의 마지막 날짜가 몇 일 ? 
		/*
		LocalDate d = LocalDate.now();
		d = d.withDayOfMonth(1); 
		System.out.println( d );
		d = d.plusMonths(1);
		System.out.println( d );
		d = d.minusDays(1);
		System.out.println( d );
		int date = d.getDayOfMonth();
		System.out.println( date );
		*/
		
		LocalTime t = LocalTime.now();
		System.out.println( t );  // 12:43:02.258972600
		// 초 밑으로는 절삭
		// t = t.truncatedTo(ChronoUnit.SECONDS);
		t = t.truncatedTo(ChronoUnit.HOURS);
		System.out.println( t );
		
		t = t.plus(2, ChronoUnit.HOURS);
		System.out.println( t );

	} // main

} // class
  