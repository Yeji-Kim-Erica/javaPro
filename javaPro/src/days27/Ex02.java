package days27;

/**
 * @author 김예지
 * @date 2025. 3. 12.
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		/* 1. 함수형 인터페이스 (Functional Interface)
		 	ㄴ 자바에서 모든 메서드는 클래스 내에 선언됨
		 	ㄴ 람다식 == 메서드 -> 람다식도 어떤 클래스에 선언이 되어 있어야 함
		 								ㄴ 익명 클래스 객체 안에 람다식이 메서드로 선언되는 것임. (익명 클래스, 익명 메서드. 이름이 없다.)
		 	ㄴ 원래는 객체명.메서드명() 으로 메서드가 호출됨.
		 	ㄴ 람다식에는 이름이 없음. 람다식을 호출하려면? 어딘가에는 변수로 식을 받아둬야 함.
		 											타입 변수 = 람다식
		 											ㄴ 여기서 타입은 뭘로 받아야 할까?
		 											참조타입: 배열, 클래스, 인터페이스
		 	ㄴ 람다식을 받을 변수의 타입은 클래스 또는 인터페이스여야만 함
		 		예)
		 		interface MyFunction {
		 			// public abstract
		 			int max(int a, int b);
		 		}
		 		
		 		// 익명클래스
		 		new MyFunction() {
		 				ㄴ 익명 객체(클래스)
		 			@Override
		 			int max(int a, int b) {
		 				return a > b ? a : b
		 			}
		 		}
		 			ㄴ 이 클래스 객체를 받는다면 타입은 MyFunction이 됨
		 			MyFunction f = new MyFunction() { ...
		 		
		 		위의 내용을 람다식으로
		 		(a, b) -> a > b ? a : b
		 			ㄴ 이 람다식을 받는다면?
		 			MyFunction f = (a, b) -> a > b ? a : b
		 				ㄴ 이렇게 f 변수에 받아두면
		 			int c = f.max(1, 2); => 익명객체명.메서드() 로 호출 가능
		 		
		 		=> 자바는 하나의 메서드만 선언된 인터페이스들을 정의해서
		 		   람다식을 다룰 수 있도록 규칙을 만들었음.
		 		   람다식을 다루는 1개의 메서드만을 가진 인터페이스를
		 		   "함수형 인터페이스"라고 부름.
		 		   ※ static, default 메서드는 개수에 상관없이 정의 가능함
		 		   
		 		   ㄴ 예)
		 		   	@FunctionalInterface 어노테이션을 붙임
		 		   	interface MyFunction {
		 		   		int max(int a, int b);	=> 1개의 메서드 == 1개의 람다식
		 		   	}
		 		   	
		 		   ㄴ 예) Ex02_02.java
		 		   
		 		   ㄴ 함수형 인터페이스 타입을 매개변수 타입으로 줄 때와 리턴 타입으로 줄 때의 차이
		 		   		ㄴ 예) Ex02_03.java
		 		   		
		 		   ㄴ 람다식의 타입과 형 변환
		 		   	1) 람다식을 함수형 인터페이스에 참조할 수 있다.
		 		   	MyFunction f = () -> System.out.println("f.run()..");
		 		   	2) 람다식의 타입이 함수형 인터페이스의 자료형과 일치하는 것은 아니다.
		 		   		: 람다식의 타입은 익명타입이다. 따라서 타입 자체가 같다고는 볼 수 없다.
		 		   	3) 람다식의 타입은 함수형 인터페이스의 타입으로만 형변환 가능하다
		 		   		ㄴ Object obj = (Object)(()->System.out.println("f.run()..")) => 불가능
		 		   		ㄴ 예) Ex02_04.java
		 		   
		 		   ㄴ 외부 변수를 참조하는 람다식
		 		   	1) 람다식 == 익명객체 (익명클래스의 인스턴스)
		 		   	2) 외부에 선언된 변수에 접근하는 규칙을 알아보자
		 		   		class Outer {
		 		   			// 내부(Inner) 클래스 - 4가지
		 		   			// 람다식은 익명 객체이므로 내부 클래스라고 생각하면 됨
		 		   			class Inner {
		 		   				
		 		   			}
		 		   		}
		 		   	예) Ex02_05.java
		 */
		
		
	} // main
	
} // class
