package days24;

import java.util.ArrayList;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		
		// 다운 캐스팅 일일히 안하고 컴파일할 때 해결
		Box<Integer> box1 = new Box<>();
		box1.setItem(100);
		int item1 = box1.getItem(); // 다운캐스팅이 불필요
		System.out.println(item1); // 100
		
		Box<String> box2 = new Box<>();
		box2.setItem("문자열");
		String item2 = box2.getItem();
		System.out.println(item2); // 문자열
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		// list.add("1"); -> 불가능
		
		/* Object로 저장되면 일일이 다운캐스팅해야 함
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("문자열");
		list.add(3.14);
		list.add('A');
		list.add(true);
		
		int a = (int) list.get(0);
		String b = (String) list.get(1);
		double c = (double) list.get(2);
		char d = (char) list.get(3);
		*/
		
		/* Object
		Box box = new Box();
		box.setItem(100);
		int item = (int) box.getItem(); // 다운캐스팅
		System.out.println(item); // 100
		
		Box box3 = new Box();
		box3.setItem("문자열");
		String item3 = (String) box3.getItem(); // 다운캐스팅
		System.out.println(item3); // 100
		*/
		
		/*
		Box box = new Box();
		box.setItem(100);
		int item = box.getItem();
		System.out.println(item); // 100
		
		Box2 box2 = new Box2();
		box2.setItem(3.14);
		double item2 = box2.getItem();
		System.out.println(item2); // 3.14
		
		Box3 box3 = new Box3();
		box3.setItem("문자열");
		String item3 = box3.getItem();
		System.out.println(item3); // 문자열
		*/
		
	} // main
	
} // class

// 제네릭 클래스로 선언
// 클래스명<T>
// 	ㄴ T: 타입변수 또는 타입 매개변수
// T로 사용 가능한 것: Key, Value, Element 등등

// Box: 원시 타입
// Box<T>: 제네릭 클래스, T의 Box, T Box 라고 읽으면 됨.

class Box<T> { // T == Type == 자료형
	
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}

/*
class Box {
	
	private Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}
*/

/*
class Box {
	
	private int item;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
}

class Box2 {
		
	private double item;
	
	public double getItem() {
		return item;
	}
	
	public void setItem(double item) {
		this.item = item;
	}
	
}

class Box3 {
	
	private String item;
	
	public String getItem() {
		return item;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	
}
*/