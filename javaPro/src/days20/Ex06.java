package days20;

import java.util.Date;

/**
 * @author 김예지
 * @date 2025. 2. 28.
 * @subject
 * @content
 			날짜(date)와 시간(time)을 다루는 클래스 <<
 			형식화 클래스
 			
 			JCF: Java Collection Framework
 			제네릭과 어노테이션
 			자바의 IO
 			람다식과 스트림
 			(스레드와 네트워크)
 			팀프로젝트
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		 	1. jdk 1.0 : java.util.Date 클래스 (sql Date 아니고 util Date!)
		 	2. jdk 1.1 : java.util.Calendar 클래스
		 	3. jdk 1.8 : java.time 패키지 안에 여러 하위 패키지
		 					ㄴ 다양한 날짜/시간 클래스 추가
		 */
		
		Date d = new Date();
		
//		System.out.println(d); // Fri Feb 28 12:39:45 KST 2025
//		System.out.println(d.toGMTString()); // 28 Feb 2025 03:39:45 GMT
//		System.out.println(d.toLocaleString()); // 2025. 2. 28. 오후 12:39:45
		
		System.out.println(d.getYear() + 1900);
		System.out.println(d.getMonth() + 1);
		System.out.println(d.getDate() + 1);
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		System.out.println(d.getTime() + "ms"); // long형 1970년 0시 0분 0초부터 계산된 ms 값
		System.out.println("일월화수목금토".charAt(d.getDay())); // 일(0), 월(1), 화(2), ... 토(6)
		
	} // main
	
} // class









