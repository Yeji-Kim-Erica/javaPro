package days20;

import java.util.Calendar;
import java.util.Date;

/**
 * @author kenik
 * @date 2025. 2. 28. - 오후 4:13:13
 * @subject 
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// 1. Calendar -> Date 변환
		Calendar c = Calendar.getInstance();
		// [2] ***
		Date d = c.getTime();
		// [1] Date d = new Date(0, 0, 0, 0, 0, 0)
		 
		// 2. Date -> Calendar 변환
		c.setTime(d); 

	} // main

} // class









  