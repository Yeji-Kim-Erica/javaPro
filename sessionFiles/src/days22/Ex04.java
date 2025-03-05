package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kenik
 * @date 2025. 3. 5. - 오전 11:16:47
 * @subject  String [] -> ArrayList 변환 
 * @content  ArrayList -> String[] 변환
 */
public class Ex04 {

	public static void main(String[] args) {
		// 1. String [] -> ArrayList 변환 
		String [] names = {"박예진", "양희동", "박정현", "김대원", "주정호", "이찬희"};
		// [1]
		/*
		ArrayList list = new ArrayList();
		for (int i = 0; i < names.length; i++) {
		     list.add( names[i] );
		} // for i
		System.out.println(list);
		*/
		// [2]       T...args 가변인자 
		// String [] -> List<String>
		List list =  Arrays.asList(names);
		// List -> ArrayList 변환
		ArrayList list2 =  new ArrayList(list);  // 매개변수 다형성.
		System.out.println( list2 );
		
		// [ArrayList -> String[] 변환.]
		// [1]
		/*
		String [] sArr = new String[list2.size()];
		for (int i = 0; i < list2.size(); i++) {
			 sArr[i] = (String) list2.get(i);
		} // for i
		System.out.println( Arrays.toString(sArr) );
		*/
		// [2]
		/*
		Object [] oArr = list2.toArray();
		for (Object obj : oArr) {
			String name = (String) obj;
			System.out.println( name );
		}
		*/
		// [3] Object[] -> String[] 변환
		// java.lang.ClassCastException: 
		// class [Ljava.lang.Object; cannot be cast to class [Ljava.lang.String; ([Ljava.lang.Object; and [Ljava.lang.String; are in module java.base of loader 'bootstrap')
		// String [] sArr = (String[]) list2.toArray();
		
		// [암기]
		// String [] sArr =  (String[]) list2.toArray( new String[list2.size()]  );
		String [] sArr =  (String[]) list2.toArray( String[]::new  );
		System.out.println( Arrays.toString(sArr) );
		
		

	} // main

} // class









  