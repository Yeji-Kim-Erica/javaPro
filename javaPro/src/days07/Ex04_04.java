package days07;

/**
 * @author yejikim
 * @date 2025. 2. 11. - 오후 2:07:23
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {
		
		for (int k = 1; k <=2 ; k++) {
			for (int i = 1; i <= 9; i++) {
				for (int d = 3 * k - 1; d <= 3 * k - 1 + 2 && d < 10; d++) {
					System.out.printf("%d*%d=%02d ", d, i, d * i);
				} // for d
				System.out.println();
			} // for i
			System.out.println();
		}
		// 선생님 필기 참고
		
	} // main
	
}
