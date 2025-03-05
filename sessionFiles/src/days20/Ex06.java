package days20;

import java.util.Date;

/**
 * @author kenik
 * @date 2025. 2. 28. - 오후 12:29:20
 * @subject 
 * @content
 *            날짜(date)와 시간(time) 다루는 클래스
 *            형식화 클래스
 *            
 *            JCF  자바 컬렉션 프레임워크
 *            제네릭과 어노테이션
 *            자바의 IO
 *            람다식과 스트림
 *            ( 스레드와 네트워크 [3일]) ?
 *            팀프로젝트
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		 * 1. jdk 1.0 - [java.util].Date 클래스
		 * 2. jdk 1.1 - java.util.Calendar 클래스
		 * 3. jdk 1.8 - java.time 패키지 안에 여러 하위 패키지
		 *                ㄴ 다양한 날짜/시간 클래스 추가
		 * */ 
		
		Date d = new Date();
		// Fri Feb 28 12:37:52 GMT+09:00 2025
		// System.out.println( d );
		// 28 Feb 2025 03:39:15 GMT  그리니치 표준시(평균시)
		// System.out.println( d.toGMTString() ); 
		// System.out.println( d.toLocaleString() );
		System.out.println( d.getYear() + 1900 );  // 125 + 1900
		System.out.println( d.getMonth() + 1 );
		System.out.println( d.getDate() );
		System.out.println( d.getHours() );
		System.out.println( d.getMinutes() );
		System.out.println( d.getSeconds() );
		System.out.println( d.getTime() +"ms" ); // long 1970.1.1. 00:00:00  ms
		// 일(0)월(1) 화(2)~ 토(6)
		System.out.println( "일월화수목금토".charAt( d.getDay() ));

		
	} // main

} // class






  