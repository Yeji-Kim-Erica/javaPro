package days04;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 6. - 오후 12:42:54
 * @subject
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;
        System.out.println(sum_angle % 360);
		
	}
	
}
