package days05;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 7. - 오후 3:06:48
 * @subject
 * @content
 */
public class Ex07_02_RockPaperScissors {

	public static void main(String[] args) {
		
		
		System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt(); // user 값
		int com = (int)(Math.random()*2)+1; // computer 값
		
		System.out.printf("> com=%d, user=%d\n", com, user);
		switch (user - com) {
		case 0:
			System.out.println("무승부");
			break;
		case 1:
		case -2:
			System.out.println("사용자 승리");

		default:
			System.out.println("컴퓨터 승리");
			break;
		} // switch

		scanner.close();
		
	} // main
	
}
