package days21;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author 김예지
 * @date 2025. 3. 4.
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {
		// now(), of()
		// with(), withXXX()
		// plus(), plusXXX()
		// minus(), minusXXX()
		
		// 이번 달의 마지막 날짜가 며칠?
		/* [1]
		LocalDate d = LocalDate.now();
		d = d.withDayOfMonth(1);
		d = d.plusMonths(1);
		d = d.minusDays(1);
		int date = d.getDayOfMonth();
		System.out.println(date); // 31
		*/
		
		LocalTime t = LocalTime.now();
		System.out.println(t); // 12:43:22.367134100
		// 초 밑으로는 절삭하려고 할 때: 절삭 메소드 변수명.truncatedTo(절삭할 필드)
		t = t.truncatedTo(ChronoUnit.SECONDS);
		System.out.println(t); // 12:46:08
		
		t = t.plus(2, ChronoUnit.HOURS);
		System.out.println(t); // 14:48:29
		
		
	} // main
	
} // class
