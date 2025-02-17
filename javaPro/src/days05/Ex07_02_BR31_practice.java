package days05;

import java.util.Random;
import java.util.Scanner;

public class Ex07_02_BR31_practice {

	public static void main(String[] args) {
		
		System.out.println("배스킨라빈스 31 게임을 시작합니다!");
		
		Random random = new Random();
		
		String winner = null;
		int numberCount = 1;
		int displayNumber = 1;
		Scanner scanner = new Scanner(System.in);
		
		boolean start = random.nextBoolean();
		// start 값이 true면 컴퓨터 선공, false면 플레이어 선공
		
		if (start) { // 컴퓨터의 선공
			System.out.print("컴퓨터 :");
			numberCount = random.nextInt(3)+1;
			for (int i = 1; i <= numberCount; i++, displayNumber++) {
				System.out.printf(" %d", displayNumber);
			} // for i
			System.out.println();
		} // if
		
		GAMEOVER:
			while (displayNumber <= 31) {
				
				System.out.print("플레이어는 숫자 개수를 입력하세요 (1~3): ");
					
				if(!scanner.hasNextInt()) { // 입력값이 정수인지 확인
					System.out.println("1~3 사이의 정수를 입력하세요.");
					scanner.nextLine(); // input에 남아있는 enter 공백 없애기
					continue;
				} else numberCount = scanner.nextInt();
				scanner.nextLine(); // input에 남아있는 enter 공백 없애기
				
				if (numberCount < 1 || numberCount > 3) { // 입력값이 1~3 사이 정수인지 확인
					System.out.println("1~3 사이의 정수를 입력하세요.");
					continue;
				}
				
				System.out.print("플레이어 :"); // 플레이어의 차례
				for (int i = 1; i <= numberCount; i++, displayNumber++) {
					System.out.printf(" %d", displayNumber);
					if (displayNumber == 31) {  // 플레이어 턴에서 31이 출력됨: 컴퓨터의 승리
						winner = "컴퓨터";
						break GAMEOVER;
					}
				} // for i
				System.out.println();
				
				System.out.print("컴퓨터 :"); // 컴퓨터의 차례
				numberCount = random.nextInt(3)+1;
				for (int i = 1; i <= numberCount; i++, displayNumber++) {
					System.out.printf(" %d", displayNumber);
					if (displayNumber == 31) {
						winner = "플레이어";
						break GAMEOVER;
					}
				} // for i
				System.out.println();
			} // while
		System.out.printf("\n31도달, %s의 승리", winner);
		scanner.close();
	} // main
	
}
