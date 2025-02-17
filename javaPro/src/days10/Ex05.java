package days10;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 14. - 오후 5:07:13
 * @subject
 * @content [예제] 한 반의 30명 학생의 성적 관리 ( 이름, 국어, 영어, 수학, 총점, 평균, 등수 ) 1. 입력 정보: 이름,
 *          국어, 영어, 수학 2. 총점, 평균, 등수 계산 처리 3. 모든 학생 정보 출력......
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {
		String name;
		int kor, eng, mat, tot, rank;
		double avg;

		final int STUDENT_COUNT = 30;

		String[] names = new String[STUDENT_COUNT];
		int[] kors = new int[STUDENT_COUNT];
		int[] engs = new int[STUDENT_COUNT];
		int[] mats = new int[STUDENT_COUNT];
		int[] tots = new int[STUDENT_COUNT];
		int[] ranks = new int[STUDENT_COUNT];
		double[] avgs = new double[STUDENT_COUNT];

		int cnt = 0; // 입력받은 학생 수
		char con = 'y';

		Scanner scanner = new Scanner(System.in);

		do {
			// 한 학생의 정보를 입력
			System.out.printf("[%d번] 학생 이름, 국어, 영어, 수학 입력 ? ", cnt + 1);
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();

			tot = kor + eng + mat;
			avg = (double) tot / 3;
			rank = 1;

			// 각 배열에 요소 추가 (각 배열의 index ==> cnt 처리)
			names[cnt] = name;
			kors[cnt] = kor;
			engs[cnt] = eng;
			mats[cnt] = mat;
			tots[cnt] = tot;
			avgs[cnt] = avg;
			ranks[cnt] = rank;

			cnt++; // 입력받은 학생 수 1 증가

			// 입력을 계속할 것인지 여부 체크
			System.out.print("> 학생 입력 계속 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');

		// 등수처리
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if (tots[i] < tots[j]) ranks[i]++;
			} // for j
		} // for i

		// 학생정보 출력
		System.out.printf("> 입력받은 학생 수 : %d명\n", cnt);
		for (int i = 0; i < cnt; i++) {
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
								i + 1,
								names[i],
								kors[i], engs[i], mats[i], tots[i], avgs[i],
								ranks[i]);
		} // for i

	} // main

	public static String getName() {
		// '가' ~ '힣'
		// 44032 ~ 55203

		// 5 ~ 13
		// 0 ~ 8 -5
		// 5 <= (int)(Math.random()*9)+5 <= 13

		// char one = (char)(rnd.nextInt('힣'-'가'+1)+'가');

		char[] nameArr = new char[3];
		Random rnd = new Random();
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char) (rnd.nextInt('힣' - '가' + 1) + '가');
		}

		// char[] -> String 변환
		String name = new String(nameArr);
		return name;
	}

	public static int getScore() {
		return (int) (Math.random() * 101);
	}

} // class
