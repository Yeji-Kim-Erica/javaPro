package days15;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import days14.Student;

/**
 * @author 김예지
 * @date 2025. 2. 21.
 * @subject 3학년 10반 30명 학생
 * @content 연습문제 풀어보기
 */

public class Ex01_02 {

	public static void main(String[] args) throws IOException {
		final int GRADE_COUNT = 3;
		final int CLASS_COUNT = 10;
		final int STUDENT_COUNT = 30;
		
		Student[][][] students = new Student[GRADE_COUNT][CLASS_COUNT][STUDENT_COUNT];
		
		
		int[][] cnts = new int[GRADE_COUNT][CLASS_COUNT];
		char con = 'y';
		int grade;
		int ban;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("> 정보를 입력할 학생의 학년과 반을 입력하세요 : ");
			grade = scanner.nextInt();
			ban = scanner.nextInt();
			
			int gradeIndex = grade-1;
			int banIndex = ban-1;
			
			Student s = new Student();
			students[gradeIndex][banIndex][cnts[gradeIndex][banIndex]] = s;
			s.no = cnts[gradeIndex][banIndex]+1;
			s.name = getName();
			s.kor = getScore();
			s.eng = getScore();
			s.mat = getScore();
			s.tot = s.kor + s.eng + s.mat;
			s.avg = (double) s.tot / 3;
			s.rank = 1;
			s.grank = 1;
			s.wrank = 1;
			
			cnts[gradeIndex][banIndex]++;
			
			System.out.printf("%d학년 %d반 %d번 학생 정보 입력 완료\n", grade, ban, s.no);
			System.out.print("계속 입력하시려면 'y'를 입력하세요 : ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');
		
		// 전교/학년/반 등수처리
		for (int i = 0; i < GRADE_COUNT; i++) { // 학년
			for (int j = 0; j < CLASS_COUNT; j++) { // 반
				for (int k = 0; k < cnts[i][j]; k++) { // 번호
					for (int i2 = 0; i2 < GRADE_COUNT; i2++){ // 학년
						for (int j2 = 0; j2 < CLASS_COUNT; j2++) { // 반
							for (int k2 = 0; k2 < cnts[i2][j2]; k2++) { // 번호
								if (students[i][j][k].tot < students[i2][j2][k2].tot) {
									students[i][j][k].wrank++; // 전교 등수
									if (i==i2) {
										students[i][j][k].grank++; // 학년 등수
										if (j==j2) students[i][j][k].rank++; // 반 등수
									}
								}
							} // for k2
						} // for j2
					} // for i2
				} // for k
			} // for j
		} // for i
		
		// 학생정보 출력
		int totalCnt = 0;
		for (int i = 0; i < cnts.length; i++) {
			for (int j = 0; j < cnts[i].length; j++) {
				totalCnt += cnts[i][j];
			} // for j
		} // for i
				
		System.out.printf("\n[전체 학생 수 : %d명]\n", totalCnt);
		
		for (int i = 0; i < GRADE_COUNT; i++) {
			System.out.printf("\n[%d학년] 학생수 : %d명\n", i+1, IntStream.of(cnts[i]).sum());
			for (int j = 0; j < CLASS_COUNT; j++) {
				System.out.printf("[%d반] 학생수 : %d명\n", j+1, cnts[i][j]);
				System.out.println("[번호]\t[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균] [반등수][학년등수][전교등수]");
				for (int k = 0; k < cnts[i][j]; k++) {
					System.out.print(students[i][j][k].getInfo());
				} // for k
				System.out.println();
			} // for j
			System.out.println();
		} // for i
		
	} // main

	private static int getScore() {
		return (int)(Math.random()*101);
	}

	private static String getName() {
		char[] letter1 = {'가','나','다','마','바','사','아','자','하'};
		int[] letter2 = {0, 28, 112, 224, 364}; // 모음(ㅏㅐㅓㅗㅜ)
		int[] letter3 = {1,4,16,17,21}; // 자음받침(ㄱㄴㅁㅂㅇ)
		
		char[] nameArr = new char[3];
		Random rnd = new Random();
		
		for (int i = 0; i < nameArr.length; i++) {
			char l1 = letter1[rnd.nextInt(letter1.length)]; // 시작하는 자음
			int l2 = letter2[rnd.nextInt(letter2.length)]; // 모음
			int l3 = letter3[rnd.nextInt(letter3.length)]; // 자음 받침
			nameArr[i] = (char) (l1 + l2
								+ ((l1=='아')? letter3[rnd.nextInt(letter3.length-1)]
								: ((l2==28||l2==224||l2==364)?0:l3)));
		}

		String name = new String(nameArr);
		return name;
	}
	
}