package days18;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject Chapter 11 예외처리 (p.466)
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		 [예외처리(Exception Handling)]
		 1. 오류(error): 프로그램 실행 중에 오작동하거나 비정상적으로 종료되는 원인
		 2. 오류가 발생하는 시점에 따라 오류의 종류가 나뉨
		 - 빌드 오류 = 컴파일 오류 + 실행 오류
		 	1) 컴파일 오류 (= 컴파일 에러)
		 		: 밑줄이 빨갛게 그이는 것
		 		- 문법에 맞추어 수정하면 해결
		 		(예) int a (세미콜론 안붙임)
		 	2) 실행 오류 == 런타임 오류 (Runtime Error)
		 		(예) java.lang.NullPointerException
		 		int[] m = null;
		 		m = new int[10]; // 이 한줄을 개발자가 추가함으로써 해결
		 		m[0] = 100;
		 		System.out.println(m[0]);
		 			1) 에러(Error): 복구할 수 없는 심각한 오류
		 				(예: 메모리 부족, Stack 오버플로우 등 시스템적인 문제. 코딩으로 고칠 수 없는 문제)
		 				Error 부모클래스
		 					ㄴ Error 자식클래스....
		 			2) 예외(Exception): 에러보다 비교적 덜 심각하고 수습가능한 실행 오류
		 				Exception 부모클래스
		 					ㄴ 자식클래스 (예: java.lang.NullPointerException)
		 			3) 논리적 오류(가장 어려운 오류)
		 				int i = Integer.MAX_VALUE;
						int j = i + 100;
						System.out.println(j); // -2147483549
						
						시스템적으로나 문법적으로는 오류가 없으나,
						결과값이 원하는 대로 얻어지지 않음.
		 */
		
		/*
		 java.lang.NullPointerException 예외가 발생했다.
		 JVM(Java Virtual Machine): 자바를 실행하기 위한 실행 엔진
		 JVM 안에 "예외처리기"가 존재.
		 예외처리기: 발생한 예외를 예외객체(예: NullPointerException)로 생성해서 개발자에게 예외를 처리하도록 알려줌
		 
		 [예외처리]
		 예외처리란?
		 : 프로그램 실행 시 발생할 수 있는 예기치 못한 예외의 발생에 대비한 코드를 작성하는 것
		 
		 							Object
		 					   		   ↑
		 				   		   Throwable
		 					   		   ↑
		 		Exception										Error
		 		    ↑					
		 	[RuntimeException]		 IOException...
		 	  ㄴ NullPointerException
		 	  ㄴ ArithmeticException
		 		 	등등...
		 
		 [예외처리 방법]
		 	1) try~catch문 사용
		 	2) throws문 사용
		 */
		
		
	} // main
	
} // class
