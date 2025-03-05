package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author 김예지
 * @date 2025. 3. 4.
 * @subject
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
		// 개강일 25.02.03 객체 생성
		
		// Date d = new Date(2025-1900, 2-1, 3);
		
		// Calendar d = new GregorianCalendar(2025, 2, 3);
		
		/* LocalDate [1]
		LocalDate d = LocalDate.now(); // LocalDate 객체는 불변
		// 년, 월, 일 수정: with(). withXXX()
		// 년
		d.withYear(2024);
		System.out.println(d); // 2025-03-04 -> 적용 X
		d = d.withYear(2024); // 변수로 받기
		System.out.println(d); // 2024-03-04 -> 적용 O
		d = d.with(ChronoField.YEAR, 2025);
		System.out.println(d); // 2025-03-04 -> 적용 O
		// 월
		d = d.with(ChronoField.MONTH_OF_YEAR, 2); // 2025-02-04
		// 일
		d = d.withDayOfMonth(3); // 2025-02-03
		System.out.println(d);
		*/
		
		/* LocalDate [2]
		LocalDate d = LocalDate.of(2025, 2, 3);
		System.out.println(d); // 2025-02-03
		*/
		
		// A 생일 1990.2.5
		// B 생일 1992.3.4
		// C 생일 2000.4.5
		// 생일 지났는지 여부 출력 코딩
		// 결과
		// 오늘이 생일이다.
		// 생일이 지났다.
		// 생일이 지나지 않았다.
		
		LocalDate a = LocalDate.of(1990, 1, 10);
		LocalDate b = LocalDate.of(1992, 3, 5);
		LocalDate c = LocalDate.of(2000, 4, 5);
		
		System.out.println(birthDay(a));
		System.out.println(birthDay(b));
		System.out.println(birthDay(c));
		
	} // main

	private static String birthDay(LocalDate bday) {
		String result = null;
		LocalDate today = LocalDate.now();
		bday = bday.withYear(today.getYear());
		
		if (today.compareTo(bday) == 0) return result = "오늘이 생일이다.";
		else if (today.compareTo(bday) > 0) return result = "생일이 지났다.";
		else return result = "생일이 지나지 않았다.";
		
//		if (bday.isEqual(today)) return result = "오늘이 생일이다.";
//		else if (bday.isAfter(today)) return result = "생일이 지났다.";
//		else return result = "생일이 지나지 않았다.";
	}
	
} // class
