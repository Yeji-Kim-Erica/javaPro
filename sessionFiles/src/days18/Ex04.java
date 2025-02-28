package days18;

/**
 * @author kenik
 * @date 2025. 2. 26. - 오전 11:18:49
 * @subject 
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// 4. Anonymous Class (익명 클래스 )
		//    ㄴ 클래스의 이름이 없다. ( 일회용 )
		/*
		 *    ㄴ 클래스 선언 + 객체 생성 
		 *    ㄴ 익명 클래스 선언 형식
		 *    
		 *      new 부모클래스명(){
		 *        // 필드  선언  X
		 *        // 메서드 선언 X
		 *        
		 *        부모의 메서드를 오버라이딩
		 *      }
		 *      
		 *      또는 
		 *      new 구현할인터페이스명(){      
		 *        인터페이스에 있는 추상메서드만 오버라이딩
		 *      }
		 * 
		 * */
		
		//         객체 생성
		Person p = new Person();
		// 객체명.멤버 사용.
		p.hashCode();
	} // main

} // class

// 클래스 선언부 
class Person{
	//
	//
}







 
  