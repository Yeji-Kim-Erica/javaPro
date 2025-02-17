package days06;

import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오후 2:46:47
 * @subject
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		
		// [문제] 한 라인에 10개의 ASCII 문자를 출력
		// 윈도우 개행 : Carriage Return(CR) + Line Feed(LF)
		//					'\r' 13				'\n'10
		// 리눅스 개행 : LF
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0, lineNumber = 1; i < 256; i++) {
			if(i%10==0) System.out.printf("%d: ", lineNumber);
			System.out.printf("[%c]", (char)i);
			if(i%10==9) {
				System.out.println();
				if(lineNumber++ % 5 == 0) {
					System.out.println("계속하려면 엔터 치세요...");
					scanner.nextLine();
				} // if
				
			} // if
		} // for i
		
	} // main
	
}
