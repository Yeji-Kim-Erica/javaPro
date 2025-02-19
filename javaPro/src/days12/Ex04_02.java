package days12;

import java.util.Arrays;

/**
 * @author 김예지
 * @date 2025. 2. 18.
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		/*
		 * [병합 정렬(merge sort)]
		 * 1) 이미 정렬되어있는 두 개의 배열을 합쳐서 하나의 배열로 만드는 정렬 방식
		 */
		
		int[] m = {1,3,6,10,14};
		int[] n = {2,4,7};
		
		// int[] mn = new int[m.length+n.length];
		int[] mn = mergeSort(m, n);
		
		System.out.println(Arrays.toString(mn));
		
	} // main

	// 내가 쓴 코딩
//	private static int[] mergeSort(int[] m, int[] n) {
//		int[] mn = new int[m.length+n.length];
//		int mKey, nKey, index;
//		mKey = nKey = index = 0;
//		
//		while (index < mn.length) {
//			if (nKey==n.length || m[mKey] < n[nKey]) {
//				mn[index++] = m[mKey++];
//			} else if (mKey==m.length || m[mKey] > n[nKey]) {
//				mn[index++] = n[nKey++];
//			} else {
//				mn[index++] = m[mKey++];
//				mn[index++] = n[nKey++];
//			} // 모자란 부분 있음. 더 추가해보기
//		}
//		return mn;
//	}
	
	private static int[] mergeSort(int[] m, int[] n) {
	      int [] mn = new int[m.length + n.length];
	      int i, j, k;
	      i = j = k = 0;

	      while ( i < m.length && j < n.length ) {
	         mn[k++] = m[i] > n[j]? n[j++] : m[i++];         
	      } // while
	      
	      if (i == m.length) { // 남은 배열 n
	         System.arraycopy(n, j, mn, k, n.length-j);
	      } else {  // 남은 배열 m
	         System.arraycopy(m, i, mn, k, m.length-i);
	      } // if
	      
	      System.out.println( Arrays.toString(mn));
	      return mn;
	   }
	
	
	
}
