package days16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author kenik
 * @date 2025. 2. 24. - 오전 10:21:28
 * @subject 
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		String n = "String";
		// 1. n 문자열을 오름차순으로 문자를 정렬
		/* 
		char [] nArr =  n.toCharArray();
		Arrays.sort(nArr);
		n = String.valueOf(nArr);
		System.out.println( n );  // "Sginrt"
		 */

		// 2. n 문자열을 내림차순으로 문자를 정렬
		// [4] 암기
		// Type[]
		String [] nArr = n.split("");
		//System.out.println( Arrays.toString(nArr) );
		Arrays.sort(nArr, Collections.reverseOrder());
		//System.out.println( Arrays.toString(nArr) );
		n = String.join("", nArr);
		//System.out.println( n );
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
		// [2]
		/*
		char [] nArr = n.toCharArray();
		for (int i = 0; i < nArr.length; i++) {
			for (int j = 0; j < nArr.length; j++) {
				if((char)nArr[i] < (char)nArr[j]) {
					char temp ; 
					temp = nArr[i];
					nArr[i] = nArr[j];
					nArr[j] = temp; 
				} // if
			} // for j
		} // for i

		System.out.println(Arrays.toString(nArr));
		*/
		/* [1]
		char [] nArr =  n.toCharArray();
		Arrays.sort(nArr);
		System.out.println( Arrays.toString(nArr));
		char [] mArr = new char[nArr.length];
		// 0 -> nArr.length-1
		// 1 -> nArr.length-2
		// nArr.length-1 -> 0
		for (int i = 0; i < nArr.length; i++) {
			mArr[nArr.length-1-i] =  nArr[i];
		} // for i
		System.out.println( Arrays.toString(mArr));
		 */
	} // main

} // class









