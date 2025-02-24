package days16;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		String n = "String";
		// n 문자열을 오름차순으로 문자를 정렬하기를 원한다면
		/*
		char[] nArr = n.toCharArray();
		Arrays.sort(nArr);
		n = String.valueOf(nArr);
		System.out.println(n); // "Sginrt"
		*/
		
		// n 문자열을 내림차순으로 문자 정렬
		/*
		char[] nArr = n.toCharArray();
		Arrays.sort(nArr);
		String n_desc = "";
		for (int i = nArr.length - 1; i >= 0; i--) {
			n_desc += nArr[i];
		} // for i
		System.out.println(n_desc);
		*/
		
		// [3]
		/*
		char [] nArr = n.toCharArray();
	      Arrays.sort(nArr);
	      for (int i = 0; i < nArr.length / 2; i++) {
	            char temp = nArr[i];
	            nArr[i] = nArr[nArr.length - 1 - i];
	            nArr[nArr.length - 1 - i] = temp;
	        }
	    */
		
	    // [4] 암기
	    String[] nArr = n.split("");
	    Arrays.sort(nArr, Collections.reverseOrder()); // Arrays.sort(T[] a, Comparator<? super T> c)
	    n = String.join("", nArr);
	    System.out.println(n);
		
	} // main
	
}
