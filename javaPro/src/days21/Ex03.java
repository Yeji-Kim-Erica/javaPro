package days21;

import java.util.Calendar;

/**
 * @author 김예지
 * @date 2025. 3. 4.
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 [jdk1.8부터 추가된 java.time 패키지 및 하위 패키지 살펴보기]
		 					ㄴ 날짜, 시간 클래스
		 					
		 	1. 5개의 time 패키지 + 하위 패키지
		 	
		 	2. java.time 패키지의 핵심 클래스
		 		ㄴ 특징: 날짜 클래스, 시간 클래스 분리
		 		1) 날짜: LocalDate 클래스
		 		2) 시간: LocalTime클래스
		 		3) 날짜 + 시간: LocalDateTime 클래스
		 		4) 날짜 + 시간 + 시간대: ZonedDateTime 클래스
		 	=> 모두 Temporal, TemporalAccessor, TemporalAdjuster 인터페이스를 구현한 클래스이다.
		 	
		 	3. 날짜와 날짜 사이의 간격: Period 클래스
		 	   시간과 시간 사이의 간격: Duration 클래스
		 	=> TemporalAmount 인터페이스를 구현한 클래스이다.
		 	
		 	4. 날짜, 시간 객체 생성: new 연산자를 사용 X
		 		ㄴ now(), of() 메소드로 생성
		 	
		 	5. 날짜, 시간의 특정 필드(ex: 년도, 월, 일, 시간, 분, 초, 요일 등등)를 얻어올 때
		 		ㄴ get(int field): 객체 생성 대신
		 		ㄴ get필드명(): 객체 생성 대신
		 		ㄴ plus(), minus() 메소드
		 		ㄴ with(): 수정 메소드 
		 		
		 	6. TemporalUnit 인터페이스
		 		ㄴ 날짜, 시간의 단위를 정의해놓은 인터페이스
		 		ㄴ 이 인터페이스를 구현한 클래스: ChronoUnit 클래스
		 	
		 	7. TemporalField 인터페이스
		 		ㄴ 필드
		 		ㄴ 필드를 정의해놓은 인터페이스
		 		ㄴ 이 인터페이스를 구현한 클래스: ChronoField 클래스
		 	
		 	
		 */
		
		/*
		Calendar c = Calendar.getInstance();
		년도 = c.get(1);
		년도 = c.get(Calendar.YEAR);
		*/
		
	} // main
	
} // class
