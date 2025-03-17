package days26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 3. 11. - 오전 7:00:35
 * @subject  CutOperation 문제 풀이.
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// 입력 예제 #1
//		6             // 막대기 수 입력 변수   n
//		5 4 4 2 2 8   //        길이 입력  변수 int [] / ArrayList
//
//		출력 예제 #1
//		6    5 4 4 2 2 8    [2]
//		4    3 2 2 6        [2]
//		2    1 4            [1]
//		1    3      
		
		// [1] 최인석
		/*
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 6
		sc.nextLine();        // 13, 10    

		String input = sc.nextLine(); // "5 4 4 2 2 8"

		String[] list = input.split(" ");

		int[] intList = Arrays.stream(list)                // String[] -> Stream<String>
				              .mapToInt(Integer::parseInt) // IntStream
				              .toArray();                  // int [] 

		ArrayList<Integer> arr = new ArrayList<>();
		for(int a: intList) {
			arr.add(a);
		}

		while(arr.size()>0) {
			System.out.println(arr.size());
			int min = Collections.min(arr);
			arr.removeIf((k) -> min==k);
		}
		*/
		
		// [2]
		// 6
		// 5 4 4 2 2 8
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] bars = new int[n];
		for (int i = 0; i < bars.length; i++) {
			bars[i] = scanner.nextInt();
		}
		
		Arrays.sort(bars);
		// 0 1 2 3 4 5   배열의 인덱스값
		// 2 2 4 4 5 8   정렬된 배열요소
		//           ↑
		System.out.println( Arrays.toString(bars) );		
		int cnt = n;
		
		System.out.println(cnt); // 6
		int value = bars[0]; // min
		for (int i = 1; i < bars.length; i++) {
			if(value != bars[i]) {
				System.out.println( n - i );
				value = bars[i];
			}
		}
		

	} // main

} // class
