package days16;

import java.util.Arrays;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {

		// [복습퀴즈 10번]
		
		String n = "keNik";
		String m = "kKnie";

		char[] nArr = n.toUpperCase().toCharArray();
		Arrays.sort(nArr);
		char[] mArr = m.toUpperCase().toCharArray();
		Arrays.sort(mArr);
		
		System.out.println();
		
		/*
		String[] nn = n.toUpperCase().split("");
		Arrays.sort(nn);

		String[] mm = m.toUpperCase().split("");
		Arrays.sort(mm);

		boolean ifEquals = Arrays.toString(nn).equals(Arrays.toString(mm));
		System.out.println(ifEquals);
		 */
	} // main

	public static String reverseStr(String str) {

		char[] array = str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				char temp;
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		return String.valueOf(array);
	}

}
// class
