package days27;

import java.util.Scanner;

/**
 * @author 김예지
 * @date 2025. 3. 12.
 * @subject
 * @content
 */
public class Ex01_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String teamA, teamB, type;
		System.out.print("첫번째 선수 이름 입력 : ");
		teamA = sc.nextLine().trim();
		System.out.print("두번째 선수 입력 : ");
		teamB = sc.nextLine();
		System.out.print("타입 입력(1) : ");
		type = sc.nextLine().trim();
		
		System.out.println("1: " + teamA);
		System.out.println("2: " + teamB);
		System.out.println(Integer.parseInt(type));
		
	} // main
	
} // class
