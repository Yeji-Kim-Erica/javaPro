package days05;

import java.util.Random;
import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 8. - 오후 11:00:48
 * @subject
 * @content
 */
public class Ex07_02_BR31_answer {

	public static void main(String[] args) {
		
	      System.out.println("베스킨라빈스 31 게임시작");

	      Random rnd = new Random();
	      Scanner scanner = new Scanner(System.in);

	      String winner = null;  // 승자 저장
	      int numberCount = 1;   // 연달아 부를 수  1~3
	      int displayNumber = 1;      

	      // 선플레이어 랜덤하게 정하기  true 나오면 플레이어, false 나오면 컴퓨터
	      boolean 선공 = rnd.nextBoolean();

	      if (!선공) {   // 만약  컴퓨터가 선공이라면 
	         System.out.print("컴퓨터 : ");
	         numberCount  = rnd.nextInt(3)+1;
	         for (int i = 1; i <= numberCount  ; i++,  displayNumber++) {
	            System.out.printf("%3d", displayNumber); 
	         }
	         System.out.println();
	      } 

	      GAMVEOVER:
	         while( displayNumber <= 31) {
	            // 선 : 플레이어
	            System.out.print("플레이어는 숫자 개수를 입력하세요 (1~3) : ");
	            numberCount = scanner.nextInt();
	            System.out.print("플레이어 : ");
	            for (int i = 1; i <= numberCount  ; i++,  displayNumber++) {
	               System.out.printf("%3d", displayNumber);
	               if( displayNumber == 31 ) {
	                  winner  = "컴퓨터";
	                  break GAMVEOVER;
	               }
	            }
	            System.out.println();
	            // 후 : 컴퓨터
	            System.out.print("컴퓨터 : ");
	            numberCount  = rnd.nextInt(3)+1;
	            for (int i = 1; i <= numberCount  ; i++,  displayNumber++) {
	               System.out.printf("%3d", displayNumber);
	               if( displayNumber == 31 ) {
	                  winner  = "플레이어";
	                  break GAMVEOVER;
	               } 
	            }
	            System.out.println();
	         } // while

	      System.out.printf("\n31 도달, %s의 승리\n", winner);
		
	} // main
	
}
