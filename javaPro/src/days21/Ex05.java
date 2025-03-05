package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author 김예지
 * @date 2025. 3. 4.
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// LocalDate
		// LocalTime
		
		// LocalDateTime: 날짜 + 시간
//		LocalDateTime dt = LocalDateTime.now();
//		System.out.println(dt); // 2025-03-04T14:02:29.472069200
		
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.of(d, t);
		System.out.println(dt); // 2025-03-04T14:03:41.906616500
		
		d = dt.toLocalDate();
		System.out.println(d); // 2025-03-04
		
		dt = d.atTime(t);
		System.out.println(dt); // 2025-03-04T14:05:39.333200500
		
		dt = dt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(dt); // 2025-03-04T00:00
		
	} // main
	
} // class
