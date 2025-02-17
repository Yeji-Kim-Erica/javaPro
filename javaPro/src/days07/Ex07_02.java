package days07;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 11. - 오후 4:42:10
 * @subject 입력값에 대한 유효성 검사
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) throws IOException {

		// 사용자의 가위 바위 보 입력값에 대한 유효성 검사...

		int user, count = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			// [알림] 1~3 정수를 다시 입력!!!
			if (count == 3) {
				System.out.printf("[알림] 입력 시도 횟수가 %d회 이상입니다. 프로그램을 종료합니다.", count);
				return;
				}
			
			if (count != 0) {
				System.out.println("[알림] 1~3 정수를 다시 입력!!!\n");
			}
			
			System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
			user = scanner.nextInt();
			
			count++;

			// } while ( user != 1 && user != 2 && user != 3 );
		} while (!(user == 1 || user == 2 || user == 3));

		System.out.printf("> user=%d\n", user);

	} // main

}
