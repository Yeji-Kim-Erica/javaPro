package days22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author kenik
 * @date 2025. 3. 5. - 오전 7:16:37
 * @subject 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		ArrayList  list = new ArrayList();
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		list.add(p1);		
		list.add(new Person("서영학", 24));
		list.add(new Person("정창기", 30));
		
		System.out.println( list );
		
		/* [3] 이름 역순으로 정렬 */
		/* [1] 나이 순으로 정렬 */
		//        익명클래스
		list.sort( new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {				
				return o1.name.compareTo( o2.name );
				// return o1.age -  o2.age;
			}
		} );
		
		
		// [2] Person 기본 정렬 기능 : 오름차순 정렬
		// list.sort(null);
		
		System.out.println( list );
		
		
		
		
		/*
		// [5]
//	    1) 설문 시작일 25.1.15  09:00:00
//	    2) 설문 종료일 25.3.05  09:00:00
		LocalDateTime s = LocalDateTime.of(2025,  1, 15, 9, 0, 0);
		LocalDateTime e = LocalDateTime.of(2025,  3, 5, 9, 0, 0);
		LocalDateTime n = LocalDateTime.now();
		
		n.compareTo(s);
		n.compareTo(e);
		
		if (!n.isBefore(s) && !n.isAfter(e)) {
			System.out.println("설문 가능");
		}else {
			System.out.println("설문 불가능");
		}
		
		System.out.println( n.isBefore(s) );
		System.out.println( n.isEqual(s) );
		System.out.println( n.isAfter(s) );  // true
		

		System.out.println( n.isBefore(e) );
		System.out.println( n.isEqual(e) );
		System.out.println( n.isAfter(e) ); // true
		*/
		
		/*
		// [4]
		ArrayList list = new ArrayList();
		list.add("변상호");
		list.add("김예지");
		list.add("이정인");
		
		System.out.println( list );
		// 열거자
		// [반복자]
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println( name );
		} // while
		// 
		int index = list.indexOf("김예지");
		list.set(index, "홍길동");		
		list.remove("홍길동");
		*/
		
		/*
		// [2]
		String s = "2023.02.28 (화)";
		String pattern = "yyyy.MM.dd (E)";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDate d = LocalDate.parse(s, dtf);
		System.out.println(d );
		*/	
		
		/*
		// [1]
		// 출력형식 :  2025/03/05 수요일  10:06:55.840
		LocalDateTime d = LocalDateTime.now();
		String pattern = "yyyy/MM/dd E요일  hh:mm:ss.SSS";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		System.out.println( dtf.format(d) ); 
		*/
		

	} // main

} // class


class Person implements Comparable<Person>{
	// 필드
	String name;
	int age;
	
	// 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() { 
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	// 기본 정렬 구현
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}
	
	
}



   