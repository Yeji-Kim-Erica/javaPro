package days21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author 김예지
 * @date 2025. 3. 4.
 * @subject 형식화 클래스 4가지
 * @content		ㄴ java.time.format 패키지 안에도 날짜를 다루는 형식화 클래스가 있다
 						ㄴ DataTimeFormatter 형식화 클래스: 날짜와 시간을 형식화
 						ㄴ 날짜 객체를 원하는 형식으로 변환
 */
public class Ex08 {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt); // 2025-03-04T15:12:54.677443300
		
		System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE)); // 2025-03-04
		System.out.println(dt.format(DateTimeFormatter.BASIC_ISO_DATE)); // 20250304
		
		// 출력형식: 2025/03/04 화요일 15:16:45.123
		/* [1]
		String pattern = "yyyy/MM/dd 화요일 HH:mm:ss.SSS";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		String s = dtf.format(dt);
		System.out.println(s); // 2025/03/04 화요일 15:20:19.699
		*/
		
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String s = dtf.format(dt);
		System.out.println(s);
		// FULL: 2025년 3월 4일 화요일
		// LONG: 2025년 3월 4일
		// MEDIUM: 2025. 3. 4
		// SHORT: 25. 3. 4
		
		
		
	} // main
	
} // class
