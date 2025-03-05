package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author kenik
 * @date 2025. 3. 4. - 오후 2:01:07
 * @subject 
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// LocalDate
		// LocalTime
		
		// 날짜  + 시간 
//		LocalDateTime dt = LocalDateTime.now();
//		System.out.println( dt );  // 2025-03-04T14:02:08.385273300
		
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.of(d, t);
		System.out.println( dt ); // 2025-03-04T14:03:26.470561300
		
//		d = dt.toLocalDate();
//		System.out.println( d );
		
//		t =  dt.toLocalTime();
//		System.out.println( t );
		
		dt =  d.atTime(t);
		System.out.println( dt );
		
		dt = dt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(dt);  // 2025-03-04T00:00

	} // main

} // class






  