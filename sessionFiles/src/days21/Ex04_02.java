package days21;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * @author kenik
 * @date 2025. 3. 4. - 오전 11:51:49
 * @subject 
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// 12:02 수업시작~
		// 2. j.t.LocalTime 클래스
		LocalTime t = LocalTime.now();
		System.out.println( t );  // 12:03:29.545754600
		// 시
		// int hour = t.get( ChronoField.HOUR_OF_DAY );
		int hour = t.getHour();
		System.out.println( hour );
		
		// 분
		//int minute = t.get(ChronoField.MINUTE_OF_HOUR);
		int minute = t.getMinute();
		System.out.println( minute );
		
		// 초
		// int second = t.get(ChronoField.SECOND_OF_MINUTE);
		int second = t.getSecond();
		System.out.println( second );
		// 밀리초
		int mili = t.get( ChronoField.MILLI_OF_SECOND );
		System.out.println( mili);
		// 나노초
		//int nano = t.get(ChronoField.NANO_OF_SECOND);
		int nano = t.getNano();
		System.out.println( nano );
  
	} // main

} // class






  