package days26;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author 김예지
 * @date 2025. 3. 11.
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// [1] Parent 부모클래스를 직렬화가 가능한 클래스로 선언
		// 이 경우, Parent의 자식 클래스인 Child는 자동적으로 직렬화가 가능한 클래스가 된다.
		
		// [2] Parent는 직렬화 X, Child는 직렬화 O
		
		// [3] 2번 상황에서 부모의 필드도 직렬화 가능하게 하려면?
		// 개발자가 직접 직렬화 대상에 추가하면 됨
		
		String name = ".\\src\\days26\\Child.txt";	
		
		try (FileOutputStream fos = new FileOutputStream(name);
			 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			Child c = new Child();
			c.name = "홍길동";
			c.age = 20;
			
			oos.writeObject(c);
			
			System.out.println("u1, u2 객체를 직렬화해서 파일로 저장함");
		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
		
	} // main
	
} // class

// [2]
class Parent {
	String name;
}

class Child extends Parent implements Serializable {
	
	private static final long serialVersionUID = 235343091117069400L;
	
	int age;
	
	// [3] 직접 추가
	
	// 직접 추가: 쓰기 작업
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);
		out.defaultWriteObject();
	}
	
	// 직접 추가: 읽기 작업
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		in.defaultReadObject();
	}
	
}
 
/* [1]
class Parent implements Serializable {
	String name;
}

class Child extends Parent {
	int age;
}
*/