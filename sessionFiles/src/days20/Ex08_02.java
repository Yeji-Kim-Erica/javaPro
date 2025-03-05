package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author kenik
 * @date 2025. 2. 28. - 오후 3:45:22
 * @subject 
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		// Calendar today = new GregorianCalendar(2025, 2-1, 28, 0 , 0, 0);		 
		// 2025.02.28
		today = new GregorianCalendar(today.get(1), today.get(2), today.get(5));
		
		System.out.println( Ex07.getCalendar(today) );
		Calendar startDate = new GregorianCalendar(2025, 2-1, 28);
		System.out.println( Ex07.getCalendar(startDate) );
		
		 
		System.out.println( today.after(startDate) );
		System.out.println( today.before(startDate) );
		System.out.println( today.equals(startDate) );
		
		System.out.println( today.compareTo(startDate) );
	 

	} // main

} // class




  