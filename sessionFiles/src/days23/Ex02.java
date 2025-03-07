package days23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

/**
 * @author kenik
 * @date 2025. 3. 6. - 오전 10:45:15
 * @subject  빙고게임 
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {

		int [][] bingo = new int[5][5];

		// 1.  중복 허용 X , 순서 유지 O 컬렉션 클래스 HashSet, LinkedHashSet
		//     1~25 정수를 채워넣기..
		// HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			al.add(i);
		} // for i
		System.out.println( al );

		// 2. HashSet -> bingo 옮기는 작업
		Random rnd = new Random();
		int i = 0;   // 1차원 -> 2차원 변환
		while ( !al.isEmpty() ) {
			int index = rnd.nextInt(al.size()); // 0<=   < al.size()
			int n = al.remove(index);
			bingo[i/5][i%5] = n;
			i++;
		} // while 
		

		// 출력.
		for (i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				System.out.printf("[%02d]", bingo[i][j]);
			}
			System.out.println();
		}
	} // main

} // class

/*
// 학생 B
public static void main(String[] args) {

	int[][] bingo = new int[5][5];

	// 순서 유지 O, 중복 허용 X
	LinkedHashSet<Integer> num = new LinkedHashSet<>();
	
	while (num.size()<25) {
		Random rnd = new Random();
		int n = rnd.nextInt(25)+1;
		num.add(n);
	} //  while

	// 2. HashSet -> bingo 옮기는 작업
	// num.get() X
	// 1. 반복자 
	// 2. Set -> List   get()
	Object[] numArr = num.toArray();
	for (int i = 0; i < numArr.length; i++) {
		bingo[i/5][i%5] = (int) numArr[i] ;
	} // for i

	// 출력
	for (int i = 0; i < bingo.length; i++) {
		for (int j = 0; j < bingo[i].length; j++) {
			System.out.printf("[%02d]", bingo[i][j]);
		} // for j
		System.out.println();
	} // for i


} // main
*/

/*
	// 학생 A 
	public static void main(String[] args) {
		int[][] bingo = new int[5][5];

		// LIFO 구조
//		Stack<Integer> stack = new Stack<>();

		// 1차원 배열 1~25 
		int[] numbers = new Random().ints(1,26).distinct().limit(25).toArray();

//		for(int k : numbers) {
//			stack.push(k);
//		}

		// 1차원 -> 2차원 변환
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
//				bingo[i][j] = stack.pop();
				bingo[i][j] = numbers[5*i+j];
			}
		}

		// 출력
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%[2d]", bingo[i][j]);
			}
			System.out.println();
		}
	}
 */

 







