package days20;

import java.util.Date;

/**
 * @author kenik
 * @date 2025. 2. 28. - 오후 2:13:31
 * @subject 
 * @content
 */
public class Ex06_03 {

	public static void main(String[] args) {
		
		Date startDate = new Date(2025-1900, 2-1, 3, 9, 0, 0);
		System.out.println(startDate.toLocaleString());
		System.out.println(startDate.getTime());
		
		Date endDate = new Date(2025-1900, 8-1, 8, 18, 0, 0);
		System.out.println(endDate.toLocaleString());
		System.out.println(endDate.getTime());
		
		// 수료일-개강일 =  16102800000 ms
		System.out.println(  endDate.getTime() - startDate.getTime() );

		// long -> Date 
		long time = 1754643600000L;
		Date d = new Date(time);
		System.out.println(d.toLocaleString());
		
	} // main

} // class
  






