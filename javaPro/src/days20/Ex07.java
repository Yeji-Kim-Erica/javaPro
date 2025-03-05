package days20;

import java.util.Calendar;

/**
 * @author 김예지
 * @date 2025. 2. 28.
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// jdk 1.1 Calendar 클래스
		// Calendar: 추상 클래스임. new 연산자로 객체를 생성할 수 없음
		// Calendar 객체 가져오는 법?
		Calendar c = Calendar.getInstance();
		
		// System.out.println(c);
		System.out.println(c.get(1)); // year
		System.out.println(c.get(Calendar.YEAR)); // year
		System.out.println(c.get(Calendar.MONTH)+1); // month
		System.out.println(c.get(Calendar.DATE)); // date
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); // date
		System.out.println(c.get(Calendar.DAY_OF_YEAR)); // 1월 1일부터 59일째
		
		// 시간, 분, 초, 밀리초
		System.out.println(c.get(Calendar.HOUR)); // 2
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); // 2
		System.out.println(c.get(Calendar.MINUTE)); // 31
		System.out.println(c.get(Calendar.SECOND)); // 58
		System.out.println(c.get(Calendar.MILLISECOND)); // 146
		// 요일
		System.out.println(c.get(Calendar.DAY_OF_WEEK)); // 6 (일요일이 1)
		
	} // main
	
	public static String getCalendar(Calendar c) {
		return String.format("%d.%02d.%02d", 
							c.get(Calendar.YEAR),
							c.get(Calendar.MONTH),
							c.get(Calendar.DAY_OF_WEEK));
	}
	
} // class
