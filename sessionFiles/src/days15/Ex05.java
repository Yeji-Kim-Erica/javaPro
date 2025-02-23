package days15;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 21. - 오후 2:01:00
 * @subject  [private로 필드를 선언한 후 필드에 접근하는 방법]
 * @content    ㄴ getter, setter
 * 
 *             Person 클래스를 새로 선언..
 *             private int age ;
 *             X p1.age = 200;
 *             
 *             getter
 *             setter
 *             O p1.setAge(20);
 */
public class Ex05 {

	public static void main(String[] args) {
		
		Person p1 = new Person( true );
		// The field Person.name [is not visible]
		// 해결 : private -> package : 같은 패키지 내부에서만 참조 가능
		p1.name = "홍길동"; 
		// p1.age = 20; X
		p1.setAge(20);
		System.out.println( p1.getAge() ); // 20
		
		// 나이를 키보드로 부터 얻어와서 입력...
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 나이 입력 ? ");
		int age = scanner.nextInt();  // 0<=   <=120
		
		/*
		if ( age >= 0 && age <= 120) {
			// 
			p1.age = age;
		} else {
			// 에러 메시지 발생..
		} // if
		*/
		p1.setAge(age);
		
		// p1.setGender(false); // 성별 쓰기 가능, 읽기 X
		
		System.out.println( p1.isGender() );
		
		System.out.println(" end ");
		

	} // main

} // class




