package days14;

/**
 * @author 김예지
 * @date 2025. 2. 20.
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// 지역변수 선언 형식
		// 자료형 변수명[=초기값];
		// final 자료형 상수명=초기값;
		
		// public String name = "홍길동";
		// Illegal modifier for parameter name; only final is permitted
		// 지역변수 앞에는 접근 지정자를 붙일 수 없다.
		
		// 객체 선언 및 생성
		Tv t1 = new Tv();
		t1.power();
		t1.channelUp();
		System.out.println(t1.channel);
		t1.power();
		System.out.println("end");
		
	} // main
	
} // class

//  [클래스 선언 시 앞에 붙는 접근지정자 설명]

// public class Tv {
//	The public type Tv must be defined in its own file
// ㄴ 자바 파일을 생성할 때, 자바 파일 안에는 public이 선언된 클래스(class 클래스명)가 반드시 1개만 있을 수 있다.
// class Tv{}는 오류 안나고 따로 알아서 class 파일이 두 개 생성됨.

class Tv {
	
	// [필드 선언 형식]
	// [접] [기] 자료형 필드명[=초기값];
	public String color;
		   boolean power = false;
	public int channel = 11;
	// 필드 앞에는 접근지정자를 붙일 수 있다.
	
	// 메서드
	public void power() {
		 power = !power;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	
}
