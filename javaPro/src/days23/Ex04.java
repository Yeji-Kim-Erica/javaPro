package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author 김예지
 * @date 2025. 3. 6.
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {4,5,6,7,8};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) al.add(a[i]);
		
		ArrayList<Integer> bl = new ArrayList<Integer>();
		for (int i = 0; i < b.length; i++) bl.add(b[i]);
		
		// [문제2] a - b 차집합 : 1 2 3 6 7 8
		ArrayList<Integer> c = new ArrayList<Integer>();
		c.addAll(al);
		c.retainAll(bl);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.addAll(al);
		hs.addAll(bl);
		hs.removeAll(c);
		System.out.println(hs);
		
		// [문제3] a ∩ b 교집합 : 4 5
		ArrayList<Integer> cl = new ArrayList<Integer>();
		cl.addAll(al);
		cl.retainAll(bl);
		System.out.println(cl);
		
		
		
		// [문제1] a ∪ b 합집합 : 1 2 3 4 5 6 7 8
		/* [3]
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) al.add(a[i]);
		
		ArrayList<Integer> bl = new ArrayList<Integer>();
		for (int i = 0; i < b.length; i++) bl.add(b[i]);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.addAll(al);
		hs.addAll(bl);
		System.out.println(hs);
		*/
		
		/* [2]
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
		*/
		
		/* [1]
		int [] c = new int[a.length + b.length];
		int i = 0;
		for (i = 0; i < a.length; i++) {
			c[i] = a[i];
		} // for i
		
		for (int j = 0; j < b.length; i++) {
			if (Arrays.binarySearch(a, b[i]) < 0) c[i++] = b[j];
		} // for j
		System.out.println(Arrays.toString(c));
		*/
		
	} // main
	
} // class
