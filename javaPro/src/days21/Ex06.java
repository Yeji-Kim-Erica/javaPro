package days21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

/**
 * @author 김예지
 * @date 2025. 3. 4.
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// [TemporalAdjusters 클래스]
		// = Temporal + Adjusters
		// 	 시간 상의      조정자
		
		// 날짜와 시간 수정: plus(), plusXXX(), minus(), minusXXX()
		// TemporalAdjusters 클래스: 자주 사용되는 날짜/시간을 수정(조정)하는 기능이 구현된 클래스
		
		LocalDate d = LocalDate.now();
		System.out.println(d); // 2025-03-04
		
		// 이번 달의 첫번째 월요일
		d = d.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println(d); // 2025-03-03
		
		// 이번 달의 마지막 토요일
		d = d.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY));
		System.out.println(d); // 2025-03-29
		
		d = LocalDate.now(); // 초기화
		// [예제] 다음 주 수요일
		int dayOfWeek = d.getDayOfWeek().getValue();
		if (dayOfWeek < DayOfWeek.WEDNESDAY.getValue()) {
			d = d.plusWeeks(1);
		}
		d = d.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println(d); // 2025-03-12
		
		d = LocalDate.now(); // 초기화 .getValue();
		// [예제] 이번 달의 3번째 목요일은 며칠인가요?
		/*
		d = d.with(TemporalAdjusters.firstDayOfMonth());
		int firstDayOfMonth = d.getDayOfWeek().getValue();
		if (firstDayOfMonth < DayOfWeek.THURSDAY.getValue()) {
			d = d.plusWeeks(1);
		}
		d = d.plusWeeks(2).with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println(d);
		*/
		d = d.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.THURSDAY));
		System.out.println(d); // 2025-03-20
		
	} // main
	
} // class
