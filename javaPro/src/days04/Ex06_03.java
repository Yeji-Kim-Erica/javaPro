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
public class Ex06_03 {

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

//		System.out.print("국어점수를 입력하세요. : ");
//		
//		int kor;
//		
//		Scanner sc = new Scanner(System.in);
//		kor = sc.nextInt();
//		String result = null;
//		
//		if (kor >= 90 && kor <= 100) {
//			result = "수";
//		} else {
//			if (kor >= 80) {
//				result = "우";
//			} else {
//				if (kor >= 70) {
//					result = "미";
//				} else {
//					if (kor >= 60) {
//						result = "양";
//					} else {
//						if (kor >= 0) {
//							result = "가";
//						} else {
//							
//						}
//					}
//				}
//			}
//		}
//		
//		System.out.println(result);
//		
//		sc.close();

		int kor;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 국어 점수 입력 ? "); // 0<= <=100
		
		// input 값이 일치하지 않는 경우
		// InputMismatchException
		// 이를 예방하기 위해 hasNextInt() 사용
		
		if (!scanner.hasNextInt()) {
			System.out.println("[알림] 국어 점수 0~100 !!!");
			return;
		} else {
			kor = scanner.nextInt();
		}// if

		if (0 <= kor && kor <= 100) {
			// 수/우/미/양/가
			if (90 <= kor && kor <= 100) {
				System.out.println("수");
			} // if
			if (80 <= kor && kor <= 89) {
				System.out.println("우");
			} // if
			if (70 <= kor && kor <= 79) {
				System.out.println("미");
			} // if
			if (60 <= kor && kor <= 69) {
				System.out.println("양");
			} // if
			if (0 <= kor && kor <= 59) {
				System.out.println("가");
			} // if
		} else {
			System.out.println("[알림] 국어 점수 0~100 !!!");
		} // if

		scanner.close();
		System.out.println(" end ");

	} // main

}
