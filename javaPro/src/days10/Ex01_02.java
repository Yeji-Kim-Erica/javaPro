package days10;

/**
 * @author yejikim
 * @date 2025. 2. 14. - 오전 10:32:50
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		
		// 16진수로 변환해서 출력
		// 16진수: 0 1 2 3 4 5 6 7 8 9 A B C D E F
		int n = 31;	
		int share, rest; // 몫, 나머지 변수
		String hex = "";
		while (n != 0) {
			share = n / 16;
			rest = n % 16;
			if (rest < 10) hex = rest + hex;
			else hex = (char)('A'+rest%10) + hex;
			n = share;
		} // while
		
		System.out.println(String.format("%s%s", "0".repeat(8 - hex.length()), hex));
		
	} // main
	
}
