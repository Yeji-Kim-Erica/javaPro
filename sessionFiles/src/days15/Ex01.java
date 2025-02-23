package days15;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import days14.Student;

/**
 * @author kenik
 * @date 2025. 2. 21. - 오전 7:05:16
 * @subject   days13.Ex01.java 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;

		final int CLASS_COUNT = 3;
		final int STUDENT_COUNT = 30;

		// 클래스 배열을 2차원배열로 선언 
		Student [][] students = new Student[CLASS_COUNT][STUDENT_COUNT];		
		int [] cnts = new int[CLASS_COUNT];

		char con = 'y';
		Scanner scanner = new Scanner(System.in);
		int ban ; 

		/*
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students[i].length; j++) {
				students[i][j] = new Student();
			} // for j
		} // for i
		 */

		do { 
			// 1. 반 입력 ? 
			System.out.print("> 1. 반 입력 ? ");
			ban = scanner.nextInt();  // 2

			// 한 학생의 정보를 입력
			System.out.printf("> 2. %d반 [%d번] 학생 이름,국어,영어,수학 입력 ? "
					, ban, cnts[ban-1]+1);
			name = getName();  
			kor = getScore();  
			eng = getScore();  
			mat = getScore();  

			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;
			wrank = 1;

			// 각 배열에 요소로 추가. ( 각 배열의 index ==> cnt 처리 )
			int banIndex = ban-1;
			students[banIndex][cnts[banIndex]] = new Student();		
			students[banIndex][cnts[banIndex]].no = cnts[banIndex]+1; // 학생번호
			students[banIndex][cnts[banIndex]].name = name;
			students[banIndex][cnts[banIndex]].kor = kor;
			students[banIndex][cnts[banIndex]].eng = eng;
			students[banIndex][cnts[banIndex]].mat = mat;
			students[banIndex][cnts[banIndex]].tot = tot;
			students[banIndex][cnts[banIndex]].avg = avg;
			students[banIndex][cnts[banIndex]].rank = rank;
			students[banIndex][cnts[banIndex]].wrank = wrank;

			// 입력받은 학생수 1증가
			cnts[ban-1]++;
			// 입력 계속 여부 체크
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available()); // 13, 10
		} while ( Character.toUpperCase(con) == 'Y' );

		// 반등수/전교등수 처리 
		for (int i = 0; i < CLASS_COUNT; i++) {
			for (int j = 0; j < cnts[i]; j++) {
				
				for (int i2 = 0; i2 < cnts.length; i2++) {
					for (int j2 = 0; j2 < cnts[i2]; j2++) {					
						 
						if(students[i][j].tot < students[i2][j2].tot) {
							students[i][j].wrank++;
							if (i == i2) {
								students[i][j].rank++;
							} // if
						} // 
						
					} // for j
				} // for i

			} // for j
		} // for i



		// 학생정보출력.
		// int totalCnt = cnts[0]+cnts[1]+cnts[2] ;
		int totalCnt = IntStream.of(cnts).sum();
		System.out.printf("[전체 학생 수 : %d명]\n", totalCnt);
		for (int i = 0; i < cnts.length; i++) {
			System.out.printf("[%d]반의 학생수 : %d명\n", i+1, cnts[i]);
			// 그 반 학생 정보 출력...
			for (int j = 0; j < cnts[i]; j++) {
				System.out.print( "\t"+ students[i][j].getInfo()  );
			} // for j
		} // for i
		System.out.println(" end ");


	} // main

	public static String getName() {

		char [] nameArr = new char[3];
		Random rnd = new Random();
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1)+'가');
		}

		// char[] -> String 변환
		String name = new String(nameArr);
		return name;
	}

	public static int getScore() {
		return  (int)( Math.random()*101 ) ;
	}

} // class









