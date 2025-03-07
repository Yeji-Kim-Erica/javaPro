package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kenik
 * @date 2025. 3. 6. - 오후 12:24:51
 * @subject 
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int [] b = {4,5,6,7,8};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++)  al.add(a[i]); 
		 
//		ArrayList<Integer> bl = new ArrayList<Integer>();
//		for (int i = 0; i < b.length; i++)  bl.add(b[i]);
		
		List<Integer> list = Arrays.stream(b)  // intStream
				               .boxed()        // Stream<Integer>
				               .collect(Collectors.toList()); // List<Integer>
		ArrayList<Integer> bl = new ArrayList<>(list);
		
		System.out.println( al );
		System.out.println( bl );
		
		
		// (문제1) a U b   합집합 : 1 2 3 4 5 6 7 8
		// [2]
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.addAll(al);
		hs.addAll(bl);		
		System.out.println( hs );
		// (문제2) a - b  차집합
		// (문제3) a ∩ b  교집합
		
		
		/* [1]
		// int [] c = new int[a.length + b.length];
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i ; 
		for ( i = 0; i < a.length; i++) {
			//c[i] = a[i];
			al.add(a[i]);
		} // for i
		// System.out.println( i ); // 5
		for (int j = 0; j < b.length; j++) {
			//  b[j];
			//if( Arrays.binarySearch(a, b[j]) < 0 )  c[i++] = b[j];
			if( Arrays.binarySearch(a, b[j]) < 0 )  al.add( b[j] );
		} // for i
		 
		// System.out.println( Arrays.toString( c ) );
		System.out.println( al );
		*/

	} // main

} // class








  