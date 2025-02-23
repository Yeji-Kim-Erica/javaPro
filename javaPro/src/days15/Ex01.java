package days15;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import days14.Student;

/**
 * @author 김예지
 * @date 2025. 2. 21.
 * @subject
 * @content
 */

public class Ex01 {

	public static void main(String[] args) throws IOException {
		final int CLASS_COUNT = 3;
		final int STUDENT_COUNT = 30;
		
		Student[][] students = new Student[CLASS_COUNT][STUDENT_COUNT];
		
		int[] cnts = new int[3];
		char con = 'y';
		int ban;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("> 정보를 입력할 학생의 반을 입력하세요 : ");
			ban = scanner.nextInt();
			
			Student s = new Student();
			students[ban-1][cnts[ban-1]] = s;
			s.no = cnts[ban-1]+1;
			s.name = getName();
			s.kor = getScore();
			s.eng = getScore();
			s.mat = getScore();
			s.tot = s.kor + s.eng + s.mat;
			s.avg = (double) s.tot / 3;
			s.rank = 1;
			s.wrank = 1;
			
			cnts[ban-1]++;
			
			System.out.printf("%d반 %d번 학생 정보 입력 완료\n", ban, s.no);
			System.out.print("계속 입력하시려면 'y'를 입력하세요 : ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');
		
		// 반/전교 등수처리
		for (int i = 0; i < CLASS_COUNT; i++) {
			for (int j = 0; j < cnts[i]; j++) {
				for (int i2 = 0; i2 < CLASS_COUNT; i2++){
					for (int j2 = 0; j2 < cnts[i2]; j2++) {
						if (students[i][j].tot < students[i2][j2].tot) {
							students[i][j].wrank++;
							if (i==i2) students[i][j].rank++;
						}
					} // for j2
				} // for i2
			} // for j
		} // for i
		
		// 학생정보 출력
		int totalCnt = IntStream.of(cnts).sum();
		System.out.printf("[전체 학생 수 : %d명]\n", totalCnt);
		for (int i = 0; i < students.length; i++) {
			System.out.printf("[%d반] 학생수 : %d명\n", i+1, cnts[i]);
			for (int j = 0; j < cnts[i]; j++) {
				System.out.print(students[i][j].getInfo());
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