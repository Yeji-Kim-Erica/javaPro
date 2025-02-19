package days13;

import java.util.Scanner;

/**
 * @author 김예지
 * @date 2025. 2. 19.
 * @subject
 * @content 입력형식: "> 게임 횟수 입력 ? "
 * 			출력형식:
 * 			[1 게임]      [42][36][21][38][6][26]
 * 			[2 게임]      [11][7][19][2][25][15]
 * 			[3 게임]      [36][33][44][42][18][10]
 */
public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		int round = scanner.nextInt();
		
		int[][] lotto = new int[round][6];
		
		fillLotto(lotto);
		dispLotto(lotto);
		
	} // main
	
	private static void fillLotto(int[][] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			int index = 0, n;
			lotto[i][index++] = getRandomInteger(1, 45); 
			while ( index <= 5 ) {
				n =  getRandomInteger(1, 45); 				 
				if( !isDuplicateLotto(lotto[i], n, index) ) 
					lotto[i][index++] = n;
			} // while
		} // for i
	}
	
	private static boolean isDuplicateLotto(int[][] lotto, int n, int index, int row) {
		boolean flag = false;
		for (int i = 0; i < index; i++) {
			if( lotto[row][i] == n ) {
				System.out.println("*");
				flag = true;
				break;
			}
		} // for i
		return flag;
	}

	private static boolean isDuplicateLotto(int[] lotto, int n, int index) {
		boolean flag = false;
		for (int i = 0; i < index; i++) {
			if( lotto[i] == n ) {
				System.out.println("*");
				flag = true;
				break;
			}
		} // for i
		return flag;
	}


	public static int getRandomInteger(int min, int max) {		
		return (int)( Math.random()*(max-min+1))+min;
	}

	private static void dispLotto(int[][] lotto) {
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d 게임]\t", i+1);
			for (int j = 0; j < lotto[i].length; j++) {
				System.out.printf("[%d]", lotto[i][j]);
			} // for j
			System.out.println();
		} // for i
	}
	
} // class
