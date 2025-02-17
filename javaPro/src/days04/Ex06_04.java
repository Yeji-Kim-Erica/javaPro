package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 6. - 오후 3:34:14
 * @subject
 * @content
 */
public class Ex06_04 {

	public static void main(String[] args) {

		// [문제] if문, if ~ else문 사용
		// 국어 점수를 입력받아서
		// 수/우/미/양/가
		// 출력
		// 수 : 90 이상 ~ 100 이하
		// 우 : 80이상 ~ 90미만 (89이하)
		// 미 : 70이상 ~ 80미만 (79이하)
		// 양 : 60이상 ~ 70미만 (69이하)
		// 가 : 0이상 ~ 60미만 (59이하)

		int kor;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 국어 점수 입력 ? ");
		
		if (!scanner.hasNextInt()) {
			System.out.println("[알림] 국어 점수 0~100 !!!");
			return;
		}
			kor = scanner.nextInt();
		
		String grade = null;

		if (0 <= kor && kor <= 100) {
			if (90 <= kor && kor <= 100) {
				grade = "수";
			} else if (kor >= 80) {
				grade = "우";
			} else if (kor >= 70) {
				grade = "미";
			} else if (kor >= 60) {
				grade =  "양";
			} else {
				grade = "가";
			} // if
			
			System.out.println(grade);
			
		} else {
			System.out.println("[알림] 국어 점수 0~100 !!!");
		} // if

		scanner.close();
		System.out.println(" end ");

	} // main

}
