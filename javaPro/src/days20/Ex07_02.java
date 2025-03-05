package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author 김예지
 * @date 2025. 2. 28.
 * @subject Calendar로 날짜 확인 ,, 좀 어렵다
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		// 달력 그리기
		int year = 2025;
		int month = 3;
				
		// 1) 2025.3.1 무슨 요일?
		Calendar c = Calendar.getInstance(); // 현재 시간, 날짜
		
		c.set(year, month - 1, 1); // [2]
		
		c = new GregorianCalendar(year, month-1, 1); // [3]
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(Ex07.getCalendar(c));
		System.out.println("0일월화수목금토".charAt(dayOfWeek));
		
		// 2) 2025.3 마지막 날짜?
		
		/* [1]
		// c.set(Calendar.MONTH, c.get(Calendar.MONTH+1));
		c.add(Calendar.MONTH, 1);
		c.add(Calendar.DATE, -1);
		*/
		
		// [2]
		c.getActualMaximum(Calendar.DATE);
		
	} // main
	
	public static int getDayOfWeek(Calendar c) {
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek; // 일(1) ~ 토(7)
	}
	
	public static int getLastDay(Calendar c) {
		return c.getActualMaximum(Calendar.DATE);
	}
	
} // class
