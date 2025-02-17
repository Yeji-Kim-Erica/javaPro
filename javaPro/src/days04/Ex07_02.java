package days04;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 6. - 오후 3:11:05
 * @subject switch문
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {

		// [문제] switch문 사용
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
		char grade = '수';

		if (kor >= 0 && kor <= 100) {
			if (kor == 0) {
				grade = '가';
			} else {
				switch (kor / 10) {
				case 10:
				case 9:
					grade = '수';
					break;
				case 8:
					grade = '우';
					break;
				case 7:
					grade = '미';
					break;
				case 6:
					grade = '양';
					break;
				default:
					grade = '가';
					break;
				} // switch
			}
			System.out.println(grade);
		} else {
			System.out.println("[알림] 국어 점수 0~100 !!!");
		}


	}
}
