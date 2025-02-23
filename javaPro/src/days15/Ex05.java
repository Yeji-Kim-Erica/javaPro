package days15;

import java.util.Scanner;

/**
 * @author 김예지
 * @date 2025. 2. 21.
 * @subject private로 필드를 선언한 후 필드에 접근하는 방법: getter, setter
 * @content
 * 			Person 클래스를 새로 선언..
 			
 			getter, setter을 사용하는 이유
 			
 
 */
public class Ex05 {

	public static void main(String[] args) {
		
		Person p1 = new Person(true);
		
		// The field Person.name is not visible
		
		// 해결방법 1: private -> package (같은 패키지 내부에서 참조가 가능하게 하기)
		p1.name = "홍길동";
		
		// 해결방법 2: getter, setter
		p1.setAge(20);
		System.out.println(p1.getAge());
		
		// getter, setter을 사용하는 이유
		// 나이를 키보드로부터 입력받아서 값을 얻어오는 상황
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 나이 입력 ? ");
		int age = scanner.nextInt(); // 0<= <=120
		
		/*
		if(age >= 0 && age <= 120) {
			p1.age = age;
		} else {
			System.out.println("error");
		}
		*/
		// 유효한 값만을 받아올 수 있음
		p1.setAge(age);
		
		// 해결방법 3: getter, setter 중 하나만 하고 생성자로 초기화하기
		p1.setGender(false); // set만 있으면 성별 쓰기 가능, 읽기는 불가능
		
		
	} // main
	
}
