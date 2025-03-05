package days22;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import days14.Student;

/**
 * @author 김예지
 * @date 2025. 3. 5.
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		// 한 반에 30명 학생의 성적 관리 ( 이름, 국어, 영어, 수학, 총점 , 평균, 등수 )
		// 배열은 크기가 자동으로 늘어나지 않아서 공간이 다차면 과정이 복잡해진다
		
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
		
		final int STUDENT_COUNT = 30;
		
		ArrayList list = new ArrayList(STUDENT_COUNT);
		
		int cnt = 0; // 입력받은 학생 수
		char con = 'y';

		Scanner scanner = new Scanner(System.in);
		
		do {
			// 한 학생의 정보를 입력
			System.out.printf("[%d번] 학생 이름,국어,영어,수학 입력 ? ", cnt+1);
			name = getName(); // scanner.next();
			kor = getScore(); // scanner.nextInt();
			eng = getScore(); // scanner.nextInt();
			mat = getScore(); // scanner.nextInt();
			
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;
			// 각 배열에 요소로 추가. ( 각 배열의 index ==> cnt 처리 )
			Student s = new Student();
			s.no = cnt+1;
			s.name = name;
			s.kor = kor;
			s.eng = eng;
			s.mat = mat;
			s.tot = tot;
			s.avg = avg;
			s.rank = 1;
			
			list.add(s); // list.size()
			
			// 입력받은 학생수 1증가
			cnt++;
			// 입력 계속 여부 체크
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available()); // 13, 10
		} while ( Character.toUpperCase(con) == 'Y' );
		
		cnt = list.size();
		// 등수처리
		procRank(list);
		// 학생정보출력
		dispStudent(list);
		
	} // main

	private static void dispStudent(ArrayList list) {
		System.out.printf("> 입력받은 학생수 : %d명\n", list.size());
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s);
		}
		
	}

	private static void procRank(ArrayList list) {
	      for (int i = 0; i < list.size(); i++) {
	         Student s = (Student) list.get(i);
	         s.rank = 1;
	         for (int j = 0; j < list.size(); j++) {
	            Student t = (Student) list.get(j);
	            if (s.tot < t.tot) {
	               s.rank++;
	            } // if
	         } // for j
	      } // for i
	   }

	private static String getName() {
		char [] nameArr = new char[3];
		Random rnd = new Random();
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1)+'가');
		}
		
		// char[] -> String 변환
		String name = new String(nameArr);
		return name;
	}
	
	private static int getScore() {
		return  (int)( Math.random()*101 ) ;
	}
	
	
} // class
