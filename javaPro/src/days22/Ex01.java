package days22;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
//		LocalDateTime open = LocalDateTime.of(2025, 1, 15, 9, 0, 0);
//		LocalDateTime close = LocalDateTime.of(2025, 3, 5, 9, 0, 0);
//		LocalDateTime now = LocalDateTime.now();
//		
//		System.out.println((!now.isAfter(open) && !now.isBefore(close))?"설문 가능":"설문 불가능");
//		System.out.println((now.compareTo(open)>=0 && now.compareTo(close)<=0)?"설문 가능":"설문 불가능");
		
		ArrayList<Person> people = new ArrayList<Person>();
		// Person 객체 생성
		Person p1 = new Person("변백현", 30);
		Person p2 = new Person("김예지", 26);
		Person p3 = new Person("하상아", 51);
		// Person 객체를 요소로 추가
		people.add(p1);
		people.add(p2);
		people.add(p3);
		// 이름으로 오름차순 정렬
		// people.sort((Person o1, Person o2) -> o1.name.compareTo(o2.name));
		people.sort(null); // 함수식 만들기
		
		for (Person person : people) {
			System.out.println(person.name);
		}
		
		System.out.println(people);
		
	} // main
	
} // class

class Person implements Comparable<Person> {
	String name;
	int age;

	public Person() { }

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("[이름: %s, 나이: %d]", this.name, this.age);
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}
	
	
}