package days22;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject C -> L -> ArrayList 컬렉션 클래스
 * 					  Vector 컬렉션 클래스
 * @content 
 			ArrayList와 Vector 차이점 == StringBuilder와 StringBuffer 차이점
 			- ArrayList: 싱글스레드
 			- Vector: 멀티스레드에서도 안전. 동기화 처리 O
 			
 			String 불변 -> StringBuilder 또는 StringBuffer 사용해서 해결
 			StringBuilder와 StringBuffer 차이점
 			- StringBuilder: 싱글스레드
 			- StringBuffer: 멀티스레드에서도 안전. 동기화 처리 O
 */
public class Ex05 {

	public static void main(String[] args) {
		//
		Vector v = new Vector();
		System.out.println(v.capacity()); // 용량: 10
		System.out.println(v.size()); // 요소 갯수(크기): 0
		
		v.addElement("최승호");
		v.add("최인석");
		v.addElement("김민선");
		
		System.out.println(v.size()); // 요소 갯수(크기): 3
		
		v.trimToSize();
		System.out.println(v.capacity()); // 용량: 3
		
		v.add("홍길동");
		System.out.println(v.size()); // 요소 갯수(크기): 4
		System.out.println(v.capacity()); // 용량: 6
		
		v.ensureCapacity(10);
		System.out.println(v.capacity());  // 요소 갯수(크기): 12
		
		// 첫번째 요소 얻어오기
		System.out.println(v.get(0));
		System.out.println(v.elementAt(0));
		
		// 열거자
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			String name = (String) en.nextElement();
			System.out.println(name);
		} // while
		
		// 열거자와 반복자의 차이점
		// 반복자: 반복적으로 요소를 처리하는 중에 요소가 수정/삭제/추가되면 반복자는 예외를 발생시킴
		
		// 첫번째 요소
		v.firstElement(); // == v.get(0); v.elementAt(0);
		
		// 마지막 요소
		v.lastElement();
		v.get(v.size()-1);
		
		v.trimToSize();
		v.setElementAt(en, 0);
		
		
	} // main
	
} // class
