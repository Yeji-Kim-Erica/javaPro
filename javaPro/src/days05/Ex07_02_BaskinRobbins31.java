package days05;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 7. - 오후 4:39:35
 * @subject
 * @content
 */
public class Ex07_02_BaskinRobbins31 {

	public static void main(String[] args) {
		
		System.out.println("배스킨라빈스31 게임시작");
		int start = (int)(Math.random()*2);
		Scanner scanner = new Scanner(System.in);
		int player = 0, computer = 0, game = 0;
		String result = null;
		
		if (start == 0) {
			
			while (game < 31) {
				System.out.print("플레이어는 숫자 개수를 입력하세요 (1~3): ");
				player = scanner.nextInt();
				System.out.print("플레이어:");
				for (int i = 1; i <= player ; i++) {
					game += 1;
					if (game > 31) break;
					System.out.printf(" %d", game);
				} System.out.println();
				
				result = "컴퓨터";
				if (game >= 31) break;
				
				
				computer = (int)(Math.random()*3)+1;
				System.out.print("컴퓨터:");
				for (int i = 1; i <= computer ; i++) {
					game += 1;
					if (game > 31) break;
					System.out.printf(" %d", game);
				} System.out.println();
				
				result = "플레이어";
				if (game >= 31) break;
				
			} // while
			
			System.out.printf("31도달, %s의 승리", result);
			
		} else {
			
			while (game < 31) {
				computer = (int)(Math.random()*3)+1;
				System.out.print("컴퓨터:");
				for (int i = 1; i <= computer ; i++) {
					game += 1;
					if (game > 31) break;
					System.out.printf(" %d", game);
				} System.out.println();
				
				result = "플레이어";
				if (game >= 31) break;
				
				System.out.print("플레이어는 숫자 개수를 입력하세요 (1~3): ");
				player = scanner.nextInt();
				System.out.print("플레이어:");
				for (int i = 1; i <= player ; i++) {
					game += 1;
					if (game > 31) break;
					System.out.printf(" %d", game);
				} System.out.println();
				
				result = "컴퓨터";
				if (game >= 31) break;
			} // while
			
			System.out.printf("31도달, %s의 승리", result);
			scanner.close();

		}
		
	} // main
	
}
