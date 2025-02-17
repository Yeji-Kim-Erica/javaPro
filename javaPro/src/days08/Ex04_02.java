package days08;

/**
 * @author yejikim
 * @date 2025. 2. 12. - 오후 12:09:23
 * @subject
 * @content 메서드의 위치: class 안, main 밖
 */
public class Ex04_02 {
	
	public static void main(String[] args) {
		
		System.out.println("---------"); // 50줄 코딩이라고 가정
		System.out.println("부서명 : 사원명"); 
		drawLine(10); // 메서드 호출부
		System.out.println("영업부 : 이태규"); 
		System.out.println("총무부 : 신희민"); 
		System.out.println("생산부 : 박현주"); 
		System.out.println("기획부 : 김예지"); 
		System.out.println("기획부 : 하동호"); 
		drawLine();
		
	} // main
	
	// 선을 긋는 메서드 만들기
	public static void drawLine() { // 메서드 선언부
		System.out.println("---------"); // 50줄 코딩이라고 가정
	}
	
	// 메서드 오버로딩(Overload) : 동일한 메서드 명으로 중복 선언. 중복 함수.
	// 중복함수의 조건 : 매개변수 타입이 달라야 함. 또는 매개변수의 개수가 달라야 함.
	// 리턴 자료형은 중복함수를 결정짓는 조건이 아님. 리턴 자료형만 다르면 오류가 발생.
	
	public static void drawLine(int length) { // 메서드 이름은 같지만 매개변수가 다르므로 메서드 오버로딩이 가능함
		System.out.println("=".repeat(length));
	}
	
	public static void drawLine(int length, String style) {
		System.out.println(style.repeat(length));
	}
	
	// 메서드가 있는 클래스에서 함수를 가져오는 방법
	// com.util.Graphic2D.java
	
	// 패키지명 + 클래스명 = 풀(full)네임

}
