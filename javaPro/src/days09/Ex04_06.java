package days09;

/**
 * @author yejikim
 * @date 2025. 2. 13. - 오후 5:17:01
 * @subject
 * @content
 */
public class Ex04_06 {

	public static void main(String[] args) {

		String rrn = "830412-2700001";
		rrn = rrn.replace("-", "");
		int sum = 0;
		for (int i = 0; i <= 11; i++) {
			sum = (rrn.charAt(i) - '0') * (2 + i % 8);
		}
		int result = (11 - (sum % 11)) % 10;
		if ((rrn.charAt(12) - '0') == result)
			System.out.println("유효");

	} // main

}
