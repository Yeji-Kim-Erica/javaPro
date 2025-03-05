package days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author kenik
 * @date 2025. 3. 4. - 오후 2:37:28
 * @subject 
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		
//		날짜 - 날짜 = Period 클래스
//		시간 - 시간 = Duration 클래스
		
		// [문제] 개강일로부터 오늘까지 날짜 간격..
		LocalDate o = LocalDate.of(2025, 2, 3);
		LocalDate t = LocalDate.now();
		
		// Period.between() 메소드를 통해서 날짜간의 간격(차)를 
		// Period 객체로 얻어올 수 있다. 
		//                         o <=포함           <t 포함 X
		Period p =  Period.between(o, t);
		System.out.println( p.getYears() );  // 0
		System.out.println( p.getMonths() ); // 1
		System.out.println( p.getDays() );   // 1
		System.out.println("-".repeat(60));
		
		System.out.println( p.get(ChronoUnit.YEARS) );
		System.out.println( p.get(ChronoUnit.MONTHS) );
		System.out.println( p.get(ChronoUnit.DAYS) );
		System.out.println("-".repeat(60));
		
		// 시간 시간의 간격 : Duration 클래스 
		// [문제] 오늘 수업 시작 시간이 얼마나 지났는지 확인..
		LocalTime s = LocalTime.of(9, 0, 0);
		LocalTime n = LocalTime.now();
		
		Duration d = Duration.between(s, n);		
		// X System.out.println( d.get(ChronoUnit.HOURS) );		
//		시 System.out.println( d.getSeconds() / (60 * 60) ); // 5 시간
//		분 System.out.println( d.getSeconds() % 60 ); // 47분 
		// 초
		System.out.println( d.toHours() );  // 6 시
		//System.out.println( d.toMinutes() );// 363 분
		int minutes = (int) (d.toMinutes() % 60); // 4분
		System.out.println(minutes );// 363 분
		int second = (int) (d.getSeconds()%60);
		System.out.println( second);	
		
		
		
//		System.out.println( d.getSeconds() ); // 20987
//		System.out.println( d.getNano() );
		

		// 3:02 수업 시작~ 
		// between()과 until() 차이점
		//   ㄴ static    ㄴ 객체 생성
//		Period.between(t, t);
//		Duration.between(s, n);
		

	} // main

} // class









  