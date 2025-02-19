package days11;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 김예지
 *
 */
public class Ex02 {

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

		String[] names = new String[1];
		int[] kors = new int[1];
		int[] engs = new int[1];
		int[] mats = new int[1];
		int[] tots = new int[1];
		double[] avgs = new double[1];
		int[] ranks = new int[1];

		int index = 0;
		char con = '\u0000';
		
		do {
			
			if (index == names.length) {
				names = strAdd(names);
				kors = intAdd(kors);
				engs = intAdd(engs);
				mats = intAdd(mats);
				tots = intAdd(tots);
				avgs = doubleAdd(avgs);
				ranks = intAdd(ranks);
			}
			
			System.out.printf("[%d번] 학생 정보를 입력합니다...\n", index + 1);
			
			names[index] = getName();
			kors[index] = getScore();
			engs[index] = getScore();
			mats[index] = getScore();
			tots[index] = kors[index] + engs[index] + mats[index];
			avgs[index] = (double) tots[index] / 3;
			
			System.out.print("계속하시려면 'y'를 입력하세요. : ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
			index++;
		} while (Character.toUpperCase(con)=='Y');
		
		Arrays.fill(ranks, 1);
		for (int i = 0; i < index; i++) {
			for (int j = 0; j < index; j++) {
				if (tots[i] < tots[j]) ranks[i]++;
			} // for j
		} // for i
		
		System.out.printf("학생 %d명의 정보를 입력받았습니다.\n\n", index);
		System.out.println(" [번호] [이름] [국어][영어][수학] [총점] [평균] [등수]");
		for (int i = 0; i < index; i++) {
			System.out.printf("[%2d번 ] %s %3d점 %3d점 %3d점 %3d점 %3.2f  %2d등\n",
					i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
		} // for i

	} // main

	private static double[] doubleAdd(double[] avgs) {
		double[] temp = Arrays.copyOf(avgs, avgs.length + 3);
		return temp;
	}

	private static int[] intAdd(int[] scores) {
		int[] temp = Arrays.copyOf(scores, scores.length + 3);
		return temp;
	}

	private static String[] strAdd(String[] names) {
		String[] temp = Arrays.copyOf(names, names.length + 3);		
		return temp;
	}

	private static int getScore() {
		return (int)(Math.random()*101);
	}

	private static String getName() {
		
		char[] letter1 = {'가','나','다','마','바','사','아','자','하'};
		int[] letter2 = {0, 28, 112, 168, 224, 364, 560}; // 모음(ㅏㅐㅓㅕㅗㅜㅣ)
		int[] letter3 = {0,1,4,8,16,17,21}; // 자음받침(ㄱㄴㄹㅁㅂㅇ)
		
		char[] nameArr = new char[3];
		Random rnd = new Random();
		
		for (int i = 0; i < nameArr.length; i++) {
			// nameArr[i] = (char) (rnd.nextInt('힣' - '가' + 1) + '가');
			char l1 = letter1[rnd.nextInt(letter1.length)]; // 시작하는 자음
			int l2 = letter2[rnd.nextInt(letter2.length)]; // 모음
			int l3 = letter3[rnd.nextInt(letter3.length)]; // 자음 받침
			nameArr[i] = (char) (l1 + l2
								+ ((l2==28||l2==224||l2==364)?0:l3));
		}

		// char[] -> String 변환
		String name = new String(nameArr);
		return name;
	}

} // class
