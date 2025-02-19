package days13;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author 김예지
 * @date 2025. 2. 19.
 * @subject 3반 30명 학생의 성적처리
 * @content 3차원 배열을 사용해서 코딩 수정하기
 */
public class Ex01_02 {

public static void main(String[] args) throws IOException {
		
		/*
		 * 한 반에 10명인 학생의 성적 관리 ( 이름, 국어, 영어, 수학, 총점, 평균, 등수 )
		 * 1. 이름, 국,영,수 입력
		 * 2. 총,평,등 계산 처리
		 * 3. 모든 학생 정보를 출력..
		 * 조건) 등수 처리하는 메서드를 만드세요.
		 * 조건) 학생 이름,국,영,수 입력은 자동으로 처리하는 메서드를 만드세요.
		 * 조건) 배열의 크기보다 학생 입력을 많이 할 경우 자동으로 배열의 크기를 3증가 시키는 코딩을 추가하세요.
		 */
		
		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;

		final int CLASS = 3;
		final int STUDENT_COUNT = 30;

		String[][] names = new String[CLASS][STUDENT_COUNT];
		double[][] avgs = new double[CLASS][STUDENT_COUNT];
		/* 아래 내용을 3차원 배열로 바꾸기
		int[][] kors = new int[CLASS][STUDENT_COUNT];
		int[][] engs = new int[CLASS][STUDENT_COUNT];
		int[][] mats = new int[CLASS][STUDENT_COUNT];
		int[][] tots = new int[CLASS][STUDENT_COUNT];
		int[][] ranks = new int[CLASS][STUDENT_COUNT]; // 반 등수
		int[][] wranks = new int[CLASS][STUDENT_COUNT]; // 전교등수
		*/
		int[][][]infos = new int[CLASS][STUDENT_COUNT][6];
		// [0국어][1영어][2수학][3총점][4반등수][5전교등수]

		int[] cnts = new int[3]; // 입력받은 학생 수
		char con = 'y';

		Scanner scanner = new Scanner(System.in);

		int ban;
		do {
			// "가변 배열" 배운 후 배열 늘리는 작업 해볼 예정
			
			// 1. 반 입력 ?
			System.out.print("> 1. 반 입력 ? ");
			ban = scanner.nextInt(); // 1 2 3
			
			// 한 학생의 정보를 입력
			System.out.printf("2. %d반 [%d번] 학생 이름, 국어, 영어, 수학 입력 ? ", ban, cnts[ban-1] + 1);
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();

			tot = kor + eng + mat;
			avg = (double) tot / 3;
			wrank = rank = 1;

			// 각 배열에 요소 추가 (각 배열의 index ==> cnt 처리)
			names[ban-1][cnts[ban-1]] = name;

			infos[ban-1][cnts[ban-1]][0] = kor;
			infos[ban-1][cnts[ban-1]][1] = eng;
			infos[ban-1][cnts[ban-1]][2] = mat;
			infos[ban-1][cnts[ban-1]][3] = tot;
			avgs[ban-1][cnts[ban-1]] = avg;
			infos[ban-1][cnts[ban-1]][4] = rank;
			infos[ban-1][cnts[ban-1]][5] = wrank;

			cnts[ban-1]++; // 입력받은 학생 수 1 증가

			// 입력을 계속할 것인지 여부 체크
			System.out.print("> 학생 입력 계속 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');

//		// 반 등수처리
//		for (int i = 0; i < cnts.length; i++) {
//			for (int j = 0; j < cnts[i]; j++) {
//				for (int k = 0; k < cnts[i]; k++) {
//					if (tots[i][j] < tots[i][k]) ranks[i][j]++;
//				} // for k
//			} // for j
//		} // for i
//		
//		// 전교 등수처리
//		for (int i = 0; i < cnts.length; i++) {
//			for (int j = 0; j < cnts[i]; j++) {
//				for (int i2 = 0; i2 < cnts.length; i2++){
//					for (int j2 = 0; j2 < cnts[i2]; j2++) {
//						if (tots[i][j] < tots[i2][j2]) wranks[i][j]++;
//					} // for j2
//				} // for i2
//			} // for j
//		} // for i
		
		/*
		// 반 등수와 전교 등수 처리 한번에 하기
		for (int i = 0; i < cnts.length; i++) {
			for (int j = 0; j < cnts[i]; j++) {
				for (int i2 = 0; i2 < cnts.length; i2++){
					for (int j2 = 0; j2 < cnts[i2]; j2++) {
						if (tots[i][j] < tots[i2][j2]) {
							wranks[i][j]++;
							if (i == i2) ranks[i][j]++;
						}
					} // for j2
				} // for i2
			} // for j
		} // for i
		*/
		
		// 반 등수와 전교 등수 처리 (3차원배열)
		for (int i = 0; i < cnts.length; i++) {
			for (int j = 0; j < cnts[i]; j++) {
				for (int i2 = 0; i2 < cnts.length; i2++){
					for (int j2 = 0; j2 < cnts[i2]; j2++) {
						if (infos[i][j][3] < infos[i2][j2][3]) {
							infos[i][j][5]++;
							if (i == i2) infos[i][j][4]++;
						}
					} // for j2
				} // for i2
			} // for j
		} // for i

		/*
		// 학생정보 출력
//		int totalCnt = 0;
//		for (int i = 0; i < cnts.length; i++) {
//			totalCnt += cnts[i];
//		} // for i
		int totalCnt = IntStream.of(cnts).sum();
		System.out.printf("[전체 학생 수 : %d명]\n", totalCnt);
		for (int i = 0; i < cnts.length; i++) {
			System.out.println();
			System.out.printf("[%d]반의 학생수 : %d명\n", i+1, cnts[i]);
			// 그 반의 학생 정보 출력
			for (int j = 0; j < cnts[i]; j++) {
				System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n",
						j+1, names[i][j], kors[i][j], engs[i][j], mats[i][j],
						tots[i][j], avgs[i][j], ranks[i][j], wranks[i][j]);
			} // for j
		} // for i
		*/
		
		// 학생정보 출력 (3차원배열)
		int totalCnt = IntStream.of(cnts).sum();
		System.out.printf("\n[전체 학생 수 : %d명]\n", totalCnt);
		for (int i = 0; i < cnts.length; i++) {
			System.out.println();
			System.out.printf("[%d]반의 학생수 : %d명\n", i+1, cnts[i]);
			// 그 반의 학생 정보 출력
			for (int j = 0; j < cnts[i]; j++) {
				System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n",
						j+1, names[i][j], infos[i][j][0], infos[i][j][1], infos[i][j][2],
						infos[i][j][3], avgs[i][j], infos[i][j][4], infos[i][j][5]);
			} // for j
		} // for i
		
	} // main

	public static String getName() {
		
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

	public static int getScore() {
		return (int) (Math.random() * 101);
	}
	
} // class
