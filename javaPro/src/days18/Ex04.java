package days18;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject 내부클래스 - 4. 익명클래스
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// 4. Annonymous Class (익명클래스)
		// 클래스의 이름이 없음 (일회용으로 사용하겠다는 의미)
		/*
		 	- 익명클래스: 클래스 선언과 객체 생성을 동시에 함
		 	ㄴ 익명 클래스 선언 형식
		 	[1]	new 부모클래스명(){
		 		부모의 메서드를 오버라이딩하는 것 외에는 멤버를 가질 수 없음.
		 		 따라서 필드 선언 불가능
		 			   메서드 선언도 불가능
		 		
		 		}
		 		
		 	[2] new 구현할 인터페이스명() {
		 		인터페이스에 있는 추상 메서드만 오버라이딩
		 		}
		 */
		//			객체 생성
		Person p = new Person();
		// 객체명.메소드명();
		p.hashCode();
		
	} // main
	
} // Ex04 class

// 클래스 선언부
class Person{ // 일반적인 클래스
	//
	//
}
