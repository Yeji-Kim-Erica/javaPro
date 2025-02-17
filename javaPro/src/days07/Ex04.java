package days07;

/**
 * @author yejikim
 * @date 2025. 2. 11. - 오후 12:04:16
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// [for문] 구구단 출력
		for (int i = 2; i <= 9; i++) {
			System.out.printf("[ %d단 ] ", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d = %2d ", i, j, i*j);
			} // for j
			System.out.println();
		} // for i
		
	} // main
	
}
