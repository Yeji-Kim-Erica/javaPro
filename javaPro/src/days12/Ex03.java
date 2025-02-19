package days12;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 김예지
 * @date 2025. 2. 18.
 * @subject 배열 섞기 (카드 섞기, 화투 섞기... 등등에 사용)
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		 * boolean 자료형의 기본값: false char 자료형의 기본값: '\u0000' 널문자 참조타입(String)의 기본값: null
		 * byte, short, int 자료형의 기본값: 0 long 자료형의 기본값: 0L float 자료형의 기본값: 0.0F double
		 * 자료형의 기본값: 0.0 또는 0.0D
		 */

		int[] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i] = i + 1;
		} // for i
		System.out.println(Arrays.toString(m));
		// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

		shuffle(m);
		System.out.println(Arrays.toString(m));

	} // main

//	private static void shuffle(int[] m) { // 내가 쓴 코딩 (미완성)
//		int[] temp = new int[m.length];
//		int index = (int)(Math.random()*m.length);
//		int[] usedIndex = new int[m.length];
//		Arrays.fill(usedIndex, -1);
//		for (int i = 0; i < temp.length; i++) {
//			for (int j = 0; j < usedIndex.length; j++) {
//				if ()
//			} // for j
//			temp[i] = m[index];
//			usedIndex[i] = index;
//		} // for i
//		m = temp;
//	}

//	private static void shuffle(int[] m) { // [1]
//	      int idx1, idx2;
//	      Random rnd = new Random();
//	      for (int i = 0, temp; i < 10; i++) {
//	         idx1 = rnd.nextInt(m.length);
//	         idx2 = rnd.nextInt(m.length);
//	         if(idx1 == idx2) i--;
//	         else {
//	            System.out.printf("%d - %d \n", idx1, idx2);
//	            temp = m[idx1];
//	            m[idx1] = m[idx2];
//	            m[idx2] = temp;
//	         }
//	      } // for i
//	   }

//	public static void shuffle(int[] m) { // [2]
//		for(int i=0; i<10; i++) {
//		   int[] randomPos = new Random().ints(0,10).limit(2).distinct().toArray();
//		   int tmp = m[randomPos[i]];
//		   m[randomPos[i]] = m[randomPos[i+1]];
//		   m[randomPos[i+1]] = tmp;
//		}
	
		private static void shuffle(int[] m) { // [3]
		      int idx1 = 0, idx2;
		      Random rnd = new Random();
		      for (int i = 0, temp; i < 10; i++) { 
		         idx2 = rnd.nextInt(m.length-1)+1; // 1~9         
		         System.out.printf("%d - %d \n", idx1, idx2);
		         temp = m[idx1];
		         m[idx1] = m[idx2];
		         m[idx2] = temp;
		      } // for i
		   }
	
}
