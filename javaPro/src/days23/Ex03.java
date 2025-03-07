package days23;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 김예지
 * @date 2025. 3. 6.
 * @subject Student 클래스 -> HashSet 컬렉션 클래스에 저장
 * @content hashCode() 오버라이딩 - 학번이 같으면 같다고 처리하도록 오버라이딩
 								 학생 비교 -> equals() 오버라이딩 - 학번
 */
public class Ex03 {

	public static void main(String[] args) {
		
		HashSet<Student> hs = new HashSet<>();
		hs.add(new Student("2020001", "홍길동", 25));
		hs.add(new Student("2020002", "서영학", 25));
		hs.add(new Student("2020003", "최승우", 25));
		hs.add(new Student("2020001", "권태정", 25));
		
		Iterator<Student> ir = hs.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s);
		}
		
	} // main
	
} // class

class Student {
	String no; // 학번 - 학생을 구별할 수 있는 고유한 필드
	String name;
	int age;
	
	public Student() {
		super();
	}

	public Student(String no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Student [no=%s, name=%s, age=%d]", this.no, this.name, this.age);
	}

	@Override
	public int hashCode() {
		return this.no.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student && obj != null) {
			Student s = (Student) obj;
			return this.no.equals(s.no);
		}
		return super.equals(obj);
	}
	
}