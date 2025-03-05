package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 김예지
 * @date 2025. 2. 28.
 * @subject 2. SimpleDateFormat클래스
 * @content		ㄴ Date, Calendar 객체를 원하는 날짜 형식으로 출력할 때 사용하는 형식화 클래스
 */
public class Ex11 {

	public static void main(String[] args) {
		
		// Date, Calendar -> 원하는 출력형식
		
		/* [1] 형식화를 사용한 것
		Date d = new Date();
		
//		System.out.println(d.toLocaleString()); // 2025. 2. 28. 오후 4:48:10
//		System.out.println(d.toGMTString()); // 28 Feb 2025 07:48:10 GMT
		
		// 원하는 출력 형식: 2025/02/28 04:48:00 금요일
		String pattern = "yyyy/MM/dd hh:mm:ss E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(d));
		*/
		
//		// [2] Calendar -> Date 변환 후 형식화 클래스 사용
//		Calendar c = Calendar.getInstance();
//		String pattern = "yyyy/MM/dd hh:mm:ss E요일"; // 2025/02/28 05:09:51 금요일
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		System.out.println(sdf.format(c.getTime()));
		
//		// [3] 문제 : SimpleDateFormat으로
		Calendar c = Calendar.getInstance();
		String pattern = "yyyy년 M월 d일 a h:mm:ss E요일"; // 2025년 2월 28일 오후 5:09:24 금요일
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(c.getTime()));
		
	} // main
	
} // class
