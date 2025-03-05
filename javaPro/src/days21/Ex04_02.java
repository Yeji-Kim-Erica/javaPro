package days21;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * @author 김예지
 * @date 2025. 3. 4.
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// 2. java.time LocalTime 클래스
		LocalTime t = LocalTime.now();
		System.out.println(t); // 12:09:56.139280100
		
		// 시
		// int hour = t.get(ChronoField.HOUR_OF_DAY);
		int hour = t.getHour();
		System.out.println(hour); // 12
		
		// 분
		// int minute = t.get(ChronoField.MINUTE_OF_HOUR);
		int minute = t.getMinute();
		System.out.println(minute); // 9
		
		// 초
		// int second = t.getSecond();
		int second = t.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println(second); // 56
		
		// 밀리초
		int milliSec = t.get(ChronoField.MILLI_OF_SECOND);
		System.out.println(milliSec); // 139
		
		// 나노초
		// int nanoSec = t.get(ChronoField.NANO_OF_SECOND);
		int nanoSec = t.getNano();
		System.out.println(nanoSec); // 139280100
		
	} // main
	
} // class
