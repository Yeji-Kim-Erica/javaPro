package days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author 김예지
 * @date 2025. 3. 4.
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 날짜 - 날짜 = Period 클래스
		// 시간 - 시간 = Duration 클래스
		
		// [문제] 개강일로부터 오늘까지 날짜 간격
		LocalDate open = LocalDate.of(2025, 2, 3);
		LocalDate today = LocalDate.now();
		
		// Period.between() 메소드를 통해서 날짜간의 간격(차)를 Period 객체로 얻어올 수 있다.
		Period period = Period.between(open, today); // open은 포함 O, today는 포함 X!
		// open <= 날짜 간격 < today
		System.out.println(period.getYears()); // 0
		System.out.println(period.getMonths()); // 1
		System.out.println(period.getDays()); // 1
		System.out.println("-".repeat(50));
		
		System.out.println(period.get(ChronoUnit.YEARS)); // 0
		System.out.println(period.get(ChronoUnit.MONTHS)); // 1
		System.out.println(period.get(ChronoUnit.DAYS)); // 1
		System.out.println("-".repeat(50));
		
		// Duration 클래스: 시간 간격
		// [문제] 오늘 수업 시작 후 시간이 얼마나 지났는지 확인하기
		LocalTime s = LocalTime.of(9, 0, 0);
		LocalTime n = LocalTime.now();
		
		Duration d = Duration.between(s, n);
		System.out.println(d.getSeconds() / 60); // 349분
		System.out.println(d.getSeconds() / (60 * 60) + "시간 " + d.getSeconds() % (60 * 60) / 60 + "분");
		System.out.println(d.getSeconds()); // 20887
		System.out.println(d.getNano()); // 213090300
		
		System.out.println(d.toHours() + "시간 " + d.toMinutes() % 60 + "분 " + d.toSeconds()%60 + "초"); // 6시간 9분 19초
		
		// between()과 until() 차이점
		// 	ㄴ static	ㄴ 객체 생성
		// 기능은 둘이 같음
		
	} // main
	
} // class
