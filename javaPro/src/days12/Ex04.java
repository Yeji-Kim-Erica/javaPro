package days12;

import java.util.Arrays;

/**
 * @author 김예지
 * @date 2025. 2. 18.
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		/*
		 * [ 정렬(Sort) ]
		 * - 특정 기준에 맞게 데이터를 열거하는 알고리즘
		 * - 오름차순 정렬 (Ascending Sort, ASC): 작은값 -> 큰 값
		 * 	 내림차순 정렬 (Descending Sort, DESC): 큰 값 -> 작은 값
		 * - 버블 정렬, 선택 정렬, 삽입 정렬, 쉘 정렬, 병합 정렬 등등
		 */
		
		int[] m = {3,5,2,4,1};
		
		// ASC기준
		// 1. 버블 정렬 (bubble sort) : (a,b)에서 a > b 라면 a, b 자리바꿈이 일어남.
		// 2. 선택 정렬 (selection sort) : 주어진 리스트 중에 최소값을 찾아 맨 앞의 값과 바꿈.
		// 3. 삽입정렬 (insertion sort)
		//		: 두번째 위치부터 시작해, 왼쪽의 값들과 비교해서 삽입될 위치를 지정한 후,
		//		 뒤로 값을 밀고 삽입될 위치에 값을 삽입해서 정렬. (가장 작은 값을 찾을 필요 X)
		
		System.out.println("배열 m 원본 : " + Arrays.toString(m));
		// bubbleSort(m); // 버블
		// selectionSort(m); // 선택
		// selectionSort2(m); // 선택
		insertionSort(m); // 삽입
		System.out.println("정렬(ASC) : " + Arrays.toString(m));
		
		
		
	} // main

	private static void insertionSort(int[] m) {
		int key; // 삽입할 값
	      for (int i = 1, j; i < m.length; i++) {
	         System.out.printf("%d - ", i);
	         key = m[i];
	         for (j = i-1; j >= 0 ; j--) {
	            if(m[j] <= key) break;
	            m[j+1] = m[j];
	         } // for j
	         m[++j] = key;
	         System.out.println(Arrays.toString(m));
	      } // for i
	      
	      // while문으로 만들어보기
	      //...
	      
	}

	private static void selectionSort2(int[] m) {
		for (int i = 0, minIndex = i; i < m.length; i++) {
			for (int j = i+1; j < m.length; j++) {
				if (m[minIndex] > m[j]) minIndex = j;
			} // for j
			if (i != minIndex) {
				int temp = m[i];
				m[i] = m[minIndex];
				m[minIndex] = temp;
			} // if
		} // for i
	}

	private static void selectionSort(int[] m) { // 맨앞의 값과 최소값의 자리바꿈
		for (int i = 0; i < m.length; i++) {
			for (int j = i+1; j < m.length; j++) {
				if (m[i] > m[j]) {
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				} // if
			} // for j
		} // for i
	}

	private static void bubbleSort(int[] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length-i-1; j++) {
				if (m[j] > m[j+1]) {
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				} // if
			} // for j
		} // for i
	}
	
}
