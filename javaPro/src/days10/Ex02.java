package days10;

/**
 * @author yejikim
 * @date 2025. 2. 14. - 오전 10:32:01
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		
		/*
		5만원 : 2 개
		1만원 : 2 개
		5천원 : 1 개
		1천원 : 0 개
		5백원 : 1 개
		1백원 : 2 개
		5십원 : 1 개
		1십원 : 1 개
		5원 : 0 개
		1원 : 0 개
		*/
		
		int money = 125760;
		String [] moneyArr = {"만원", "천원", "백원", "십원", "원"};
		int mok = 10000;
		for (int i = 0; i < moneyArr.length; i++) {
			System.out.printf("5%s : %d 개\n", moneyArr[i], money/(mok*5));
			money %= (mok*5); // -> 이 부분을 스위치 개념을 이용하면 됨.
			System.out.printf("1%s : %d 개\n", moneyArr[i], money/mok);
			money %= mok;
			mok/=10;
		} // for i
		
	} // main
	
}
