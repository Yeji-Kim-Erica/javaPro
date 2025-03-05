package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author kenik
 * @date 2025. 2. 28. - 오후 2:37:18
 * @subject  Calendar  날짜 확인...어렵네요.. 
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		// 달력그리기 - Calendar 클래스 
		int year = 2025;
		int month = 3;

		// 1) 2025.3.1 무슨 요일 ? 
		Calendar c = Calendar.getInstance();
		/* [1]
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month -1 );
		c.set(Calendar.DATE, 1 );
		*/
		// [2]
		/*
		c.set(year, month -1 , 1);
		*/
		// [3]
		c = new GregorianCalendar(year, month-1, 1);
		
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println( Ex07.getCalendar(c) );
		System.out.println( "0일월화수목금토".charAt(dayOfWeek) );
		
		// 3:01 수업시작
		// 2) 2025.3   마지막 날짜?
		/* [1]
		//  ㄱ. 2025.3.1 + 1달
		// c.set(Calendar.MONTH, c.get(Calendar.MONTH) + 1);
		c.add(Calendar.MONTH, 1);
		//  ㄴ. 1 빼자
		// c.set(Calendar.DATE, c.get(Calendar.DATE) - 1);
		c.add(Calendar.DATE, -1);
		//  ㄷ. 일
		*/
		// [2]                   31
		System.out.println( c.getActualMaximum(Calendar.DATE) );
		
		
		System.out.println( Ex07.getCalendar(c) );
		

	} // main
	
	public static int getDayOfWeek(Calendar c) {
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;  // 일(1) 월(2) ... 토(7)
	}
	public static int getLastDay(Calendar c) {
		return c.getActualMaximum(Calendar.DATE);
	}

}
