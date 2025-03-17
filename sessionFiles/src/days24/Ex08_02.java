package days24;

import java.util.ArrayList;

/**
 * @author kenik
 * @date 2025. 3. 7. - 오후 2:24:00
 * @subject 
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		
	
		/*
		Box box = new Box();
		box.setItem(100);
		int item = box.getItem();
		System.out.println( item );
		
		Box3 box3 = new Box3();
		box3.setItem("문자열");
		String item3 = box3.getItem();
		System.out.println( item3 );
		*/
		
		/*  Object item;
		Box box = new Box();
		box.setItem(100);
		int item = (int) box.getItem();          // 다운캐스팅
		System.out.println( item );
		
		Box box3 = new Box();
		box3.setItem("문자열");
		String item3 = (String) box3.getItem();  // 다운캐스팅
		System.out.println( item3 );
		*/
		
		Box<Integer> box1 = new Box<>();
		box1.setItem(100);
		int item = box1.getItem();  // 다운캐스팅 필요없다.
		System.out.println( item );
		
		Box<String> box2 = new Box<>();
		box2.setItem("문자열");
		String item2 = box2.getItem();// 다운캐스팅 필요없다.
		System.out.println(item2);
		
		// 
		/*
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("문자열");
		list.add(3.14);
		list.add('A');
		list.add(true);
		
		int a = (int)list.get(0);
		String b = (String)list.get(1);
		String c = (String)list.get(2);
		char d = (char)list.get(3);
		*/
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		// list.add("1");
		

	} // main

} // class

// 제네릭 클래스 선언
//  ㄴ 클래스 명 뒤에 <T>을 붙이면 된다. 
//  ㄴ   T  를 타입변수 또는 타입 매개변수
//      Type == 자료형
//      Key
//      Valvue
//      Element
//      등등
//  ㄴ Box     원시 타입
//  ㄴ Box<T>  제네릭 클래스,  T의 Box, T Box 라고 읽으면 된다.  
class Box<T>{
	
	private T item;  

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}

/*
class Box{
	
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
class Box{
	
	private int item;  // char  short float   Person 등등

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
	
}

class Box2{
	
	private double item;
	
	public double getItem() {
		return item;
	}
	
	public void setItem(double item) {
		this.item = item;
	}
	
}

class Box3{
	
	private String item;
	
	public String getItem() {
		return item;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	
}
*/



  