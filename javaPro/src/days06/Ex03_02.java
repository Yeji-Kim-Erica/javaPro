package days06;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오전 11:29:38
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		int sum = 0, i = 0;
//		while (++i <= 10) {
//			if (i % 2 == 0) continue;
//			System.out.printf("%d+", i);
//			sum += i;
//		} // while
		
		while(++i<=10) {
			if(i%2==0) continue;
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("\b=%d\n", sum);
		
	} // main
	
}
