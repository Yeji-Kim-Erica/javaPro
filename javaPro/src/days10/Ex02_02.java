package days10;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 14. - 오전 11:18:24
 * @subject
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		int money = 125760;
		int unit = 50000;
		int num = 0;
		boolean sw = false;
		
		Scanner scanner = new Scanner(System.in);
		
		while (unit >= 1) {
			num = money/unit;
			System.out.printf("%d원권 : %d매\n", unit, num);
			money -= unit*num;
			unit /= (sw?2:5);
			sw = !sw;
		} // while
		
	} // main

}
