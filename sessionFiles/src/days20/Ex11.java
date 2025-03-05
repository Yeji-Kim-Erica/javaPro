package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author kenik
 * @date 2025. 2. 28. - 오후 4:41:33
 * @subject  2. SimpleDateFormat 클래스
 * @content      ㄴ Date, Calendar 객체를 원하는 날짜 형식으로 출력할 때 
 *                  사용하는 형식화 클래스 이다. 
 *                  
 *                  Date, Calendar -> 출력형식의 문자열 변환
 */
public class Ex11 {

	public static void main(String[] args) {

		/* [1] Date 클래스를 형식화 클래스 사용 예제
		Date d = new Date();

		// 2025. 2. 28. 오후 4:48:00
//		System.out.println( d.toLocaleString() );
//		System.out.println( d.toGMTString() );

		// 출력형식)  2025/02/28 04:48:00 금요일
		String pattern = "yyyy/MM/dd hh:mm:ss E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println( sdf.format(d) );
		 */

		// 5:03 수업 .. 시작
		// [2] Calednar -> Date 변환 시킨 후 형식화 클래스를 사용하면 된다. 
		/*
		Calendar c = Calendar.getInstance();
		// 출력형식)  2025/02/28 04:48:00 금요일
		String pattern = "yyyy/MM/dd hh:mm:ss E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println( sdf.format( c.getTime() ) );
		*/

		// [3] 문제 : SimpleDateFormat 아래와 같은 형식으로 출력하는 코딩...
		//   2025년 2월 28일 오후 5:04:25 금요일
		Calendar c = Calendar.getInstance();
		String pattern = "yyyy년 M월 d일 a h:mm:ss E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println( sdf.format( c.getTime() ) );

	} // main

} // class
