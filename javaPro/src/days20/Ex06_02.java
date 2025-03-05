package days20;

import java.util.Date;

/**
 * @author 김예지
 * @date 2025. 2. 28.
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 달력 그리기
		int year = 2025;
		int month = 3;
		
		// 1) 2025.3.1 무슨 요일?
		// 2) 2025.3 마지막 날짜?
		
		/* [1]
		Date d = new Date();
		System.out.println(d.getDay()); // 일(0) ~ 토(6)
		// getXXX();
		// setXXX();
		d.setYear(year-1900);
		d.setMonth(month-1);
		d.setDate(1);
		*/
		
		// [2]
		Date d = new Date(year-1900, month-1, 1);
		
		// [3] year, month, 마지막 날짜?
		int date = d.getDate();
		d.setMonth(d.getMonth()+1);
		d.setDate(date-1);
		
		System.out.print(d.toLocaleString());
		System.out.println(" " + "일월화수목금토".charAt(d.getDay()));
		
	} // main
	
} // class
