package days12;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 김예지
 * @date 2025. 2. 18.
 * @subject
 * @content
 */
public class Assignment {

	public static void main(String[] args) {
		// [문제] 3반 30명 학생 이/국/영/수 입력받아서 출력

		String[][] names = new String[3][30];
		int[][] kors = new int[3][30];
		int[][] engs = new int[3][30];
		int[][] mats = new int[3][30];
		int[][] tots = new int[3][30];
		double[][] avgs = new double[3][30];
		int[][] ranks = new int[3][30];

		int n, m;
		n = m = 0;

		do {
			names[n][m] = getName();
			kors[n][m] = getScore();
			engs[n][m] = getScore();
			mats[n][m] = getScore();
			tots[n][m] = kors[n][m] + engs[n][m] + mats[n][m];
			avgs[n][m] = (double) tots[n][m] / 3;
			ranks[n][m] = 1;
			m++; // 학생 번호 증가
			if (n < 2 && m > 29) {
				n++;
				m = 0;
			}
		} while (n <= 2 && m <= 29);
		
		System.out.printf("입력받은 학생 수 : %d명\n", (n+1)*m);
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				for (int i2 = 0; i2 < names.length; i2++){
					for (int j2 = 0; j2 < names[i2].length; j2++) {
						if (tots[i][j] < tots[i2][j2]) ranks[i][j]++;
					} // for j2
				} // for i2
			} // for j
		} // for i

		for (int i = 0; i < names.length; i++) {
			System.out.printf("[%d반 성적표]\n", i+1);
			System.out.println("[번호] [이름] [국어][영어][수학] [총점] [평균] [전교등수]");
			for (int j = 0; j < names[i].length; j++) {
				System.out.printf("[%2d번] %s %3d점 %3d점 %3d점 %3d점 %4.2f  %2d등\n",
						j + 1, names[i][j], kors[i][j], engs[i][j], mats[i][j],
						tots[i][j], avgs[i][j], ranks[i][j]);
			} // for j
			System.out.println();
		} // for i
		
	} // main

	private static int getScore() {
		return (int) (Math.random() * 101);
	}

	private static String getName() {
		
		char[] letter1 = {'가','나','다','마','바','사','아','자','하'};
		int[] letter2 = {0, 28, 112, 224, 364}; // 모음(ㅏㅐㅓㅗㅜ)
		int[] letter3 = {1,4,16,17,21}; // 자음받침(ㄱㄴㅁㅂㅇ)
		
		char[] nameArr = new char[3];
		Random rnd = new Random();
		
		for (int i = 0; i < nameArr.length; i++) {
			// nameArr[i] = (char) (rnd.nextInt('힣' - '가' + 1) + '가');
			char l1 = letter1[rnd.nextInt(letter1.length)]; // 시작하는 자음
			int l2 = letter2[rnd.nextInt(letter2.length)]; // 모음
			int l3 = letter3[rnd.nextInt(letter3.length)]; // 자음 받침
			nameArr[i] = (char) (l1 + l2
								+ ((l1=='아')? letter3[rnd.nextInt(letter3.length-1)]
								: ((l2==28||l2==224||l2==364)?0:l3)));
		}

		// char[] -> String 변환
		String name = new String(nameArr);
		return name;
	}

} // class
