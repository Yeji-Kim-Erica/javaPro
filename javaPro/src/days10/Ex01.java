package days10;

import java.util.Random;
import java.util.Scanner;

/**
 * @author yejikim
 * @date 2025. 2. 14. - 오전 8:56:17
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {

		// [1]
		String card = "7655-8988-9234-5677";
		String[] cardArr = card.split("-");
		Random rnd = new Random();
		int[] index = rnd.ints(0, 4).distinct().limit(2).toArray();
		cardArr[index[0]] = "****";
		cardArr[index[1]] = "****";

		System.out.println(String.join("-", cardArr));

		// [2]
		int n = 10;
		String result = binaryConvert(n);
		System.out.println(result);

	} // main

	private static String binaryConvert(int n) {
		// 내가 쓴 코딩
		String binaryNum = "";
		int m = 1;

		do {
			binaryNum += n/m;
			n %= m;
			m *= 2;
		} while (n/m > 1);
		
		if (n%2==0) binaryNum += "10";
		else binaryNum += "01";

		return String.format("%s%s", "0".repeat(8-binaryNum.length()), binaryNum);

		// [1]
//		int[] bin = new int[8];
//		int s = bin.length - 1;
//		int mok = 0, nmg = 0;
//
//		do {
//			mok = dec/2;
//			nmg = dec%2;
//			bin[s--] = nmg;
//		} while (mok != 0);
//		return String.join("", );

		// [2]
//		int share, rest; // 몫, 나머지 변수
//		String binary = "";
//		while (n != 0) {
//			share = n / 2;
//			rest = n % 2;
//			binary = rest + binary;
//			n = share;
//		} // while
//
//		// System.out.println( binary );
//		// 1010
//		return String.format("%s%s", "0".repeat(8 - binary.length()), binary);

	}

}
