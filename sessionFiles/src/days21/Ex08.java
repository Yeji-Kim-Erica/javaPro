package days21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author kenik
 * @date 2025. 3. 4. - 오후 3:06:49
 * @subject   형식화 클래스 - 4가지.
 * @content   j.t.format 패키지
 *                 ㄴ DataTimeFormatter 형식화 클래스 
 *                     날짜와 시간을 형식~
 *                 ㄴ 날짜 -> 원하는 형식으로 변환     
 */
public class Ex08 {

	public static void main(String[] args) {
		
		LocalDateTime dt =  LocalDateTime.now();
		// 2025-03-04T15:12:42.415656500
		System.out.println( dt );
		// 2025-03-04
		System.out.println( dt.format(DateTimeFormatter.ISO_LOCAL_DATE) );
		// 20250304
		System.out.println( dt.format(DateTimeFormatter.BASIC_ISO_DATE) );

		// 2025/03/04 화요일 15:16:45.123
		// [1]
//		String pattern = "yyyy/MM/dd E요일 HH:mm:ss.SSS";
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
//		String s = dtf.format(dt);
//		System.out.println( s );
		
		// FULL   : 2025년 3월 4일 화요일
		// LONG   : 2025년 3월 4일
		// MEDIUM : 2025. 3. 4.
		// SHORT  : 25. 3. 4.
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		String s = dtf.format(dt);
		System.out.println( s );

	} // main

} // class





  