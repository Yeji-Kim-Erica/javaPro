package days20;

import java.util.Date;

/**
 * @author 김예지
 * @date 2025. 2. 28.
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
		
		// 수료일 - 개강일
		System.out.println(endDate.getTime() - startDate.getTime() + "ms");
		
		// long형 값으로 Date를 만들 수 있다
		Date d = new Date(1738540800000L);
		System.out.println(d.toLocaleString());
		
		
	} // main
	
} // class
