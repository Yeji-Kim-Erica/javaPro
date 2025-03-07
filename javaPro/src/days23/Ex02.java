package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Stack;

/**
 * @author 김예지
 * @date 2025. 3. 6.
 * @subject 빙고게임
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 1. 1~25 중복되지 않는 임의의 숫자
		// 중복허용 X, 순서 유지 O? X?

		int[][] bingo = new int[5][5];
		ArrayList<Integer> al = new ArrayList<Integer>(25);
		for (int i = 1; i <= 25; i++) {
			al.add(i);
		} // for i
		
		Random random = new Random();
		for (int i = 0; i < 25; i++) {
			int n = random.nextInt(al.size());
			bingo[i/5][i%5] = al.remove(n);
		} // for i
		
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				System.out.printf("[%02d]", bingo[i][j]);
			} // for j
			System.out.println();
		} // for i

		/* [1]
		Stack<Integer> stack = new Stack<>();

		int[] numbers = new Random().ints(1, 26).distinct().limit(25).toArray();

		for (int k : numbers) {
			stack.push(k);
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				 bingo[i][j] = stack.pop();
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%[2d]", bingo[i][j]);
			}
			System.out.println();
		}
		*/
		
		/* [2]
		Random random = new Random();
		LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>(25);
		while (numbers.size() <= 24) {
			int n = random.nextInt(25)+1;
			numbers.add(n);
		}
		
		Integer[] numArr = numbers.toArray(Integer[]::new); // 또는 Set -> List
		for (int i = 0; i < numbers.size(); i++) {
			bingo[i/5][i%5] = numArr[i];
		} // for i
		*/

	} // main

} // class
