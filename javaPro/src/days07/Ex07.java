package days07;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 11. - 오후 3:43:10
 * @subject do~while문
 * @content 1) 게임을 계속할지 여부 ? y 2) 3 게임을 먼저 이기면 게임 종료
 */
public class Ex07 {

	public static void main(String[] args) {

		int com, user, comScore, userScore, trial, count = 0;
		String input;
		String[] rpsArr = { "", "가위", "바위", "보" };
		char con = 'y';
		comScore = userScore = 0;
		trial = 3;

		Scanner scanner = new Scanner(System.in);

		System.out.println("가위바위보 게임을 시작합니다!");

		do {

			do {

				if (count > trial) {
					System.out.printf("[알림] 입력 시도 횟수 %d회 초과. 프로그램을 종료합니다.", trial);
					return;
				} // if

				if (count != 0) {
					System.out.printf(
							"[알림] 1~3 사이의 숫자를 입력하세요.\n" + "[경고] 입력 시도 횟수 %d회 초과 시 프로그램이 종료됩니다. (현재입력시도:%d회)\n", trial,
							count);
				} // if

				System.out.print("가위(1) / 바위(2) / 보(3) 중 하나를 입력하세요 : ");
				input = scanner.next();

				count++;

			} while (!input.matches("[1-3]"));

			user = Integer.parseInt(input);
			com = (int) (Math.random() * 3) + 1;

			System.out.printf("컴퓨터: %s, 사용자: %s\n", rpsArr[com], rpsArr[user]);

			switch (com - user) {
			case 0:
				System.out.print("무승부! ");
				break;

			case 1:
			case -2:
				System.out.print("컴퓨터의 승리! ");
				comScore++;
				break;

			case -1:
			case 2:
				System.out.print("플레이어의 승리! ");
				userScore++;
				break;
			} // switch

			System.out.printf("(%d :%d)\n", comScore, userScore);

			if (comScore == 3 || userScore == 3) {
				System.out.printf("최종승리자: %s", comScore == 3 ? "컴퓨터" : "플레이어");
			} // if

			count = 0;

			System.out.print("게임을 계속하려면 y를 입력하세요 : ");
			con = scanner.next().charAt(0);

		} while (con == 'y' || con == 'Y');

		System.out.println("end");

	} // main

}
