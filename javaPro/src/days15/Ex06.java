package days15;

/**
 * @author 김예지
 * @date 2025. 2. 21.
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		 [ this 키워드 ] p.225, p.245
		 1. 정의: 클래스 자기 자신의 주소값을 갖는 참조변수
		 
		 MyPoint p1 = new MyPoint(10, 20);
		 MyPoint p2 = new MyPoint(10, 20);
		 								
		 <Heap>						  <call Stack(main)>
		 인스턴스								  객체
		 [10][20][0x100]					[0x100]
		   x  y	  this					       p1
		 0x100
		 
		 인스턴스								  객체
		 [10][20][0x200]					[0x200]
		   x  y	  this					       p2
		 0x200
		 
		 2. this의 3가지 용도
		 	1) 멤버를 가리킬 때
		 	2) 생성자에서 또 다른 생성자를 호출할 때
		 	3) 단독으로(홀로) 사용될 때: 매개변수, 리턴값
		 
		 */
		
		/*
		Person p1 = new Person("홍길동", 20, true);
		// 객체명.멤버(필드, 메소드)
		// p1.name;
		// p1.getAge();
		System.out.println(p1.name);
		*/
		
		Person p2 = new Person(); // 디폴트 생성자 호출
		System.out.println(p2.name);
		
	} // main
	
} // class
