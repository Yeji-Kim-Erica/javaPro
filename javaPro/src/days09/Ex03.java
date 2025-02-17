package days09;

import java.util.Arrays;
import java.util.Random;

/**
 * @author yejikim
 * @date 2025. 2. 13. - 오전 11:20:26
 * @subject
 * @content
 */

import days08.Ex07;

public class Ex03 {

	public static void main(String[] args) {
		
		String card ="7655-8988-9234-5677";
		
		/* 결제할 때마다 영수증 보면 임의의 숫자 4개가 ****로 출력된다고 할 때,
		"7655-****-9234-5677"
		"7655-8988-9234-****"
		"****-8988-9234-5677"
		"7655-8988-****-5677"
		*/
		
		/*
		String [] cardArr = card.split("-");
		int index = (int)(Math.random()*3+1);
		cardArr[index] = "****";
		
		System.out.print("\b");
		for (String cardNum : cardArr) {
			System.out.printf("-%s", cardNum);
		}
		*/
		
		String [] cardArr = card.split("-");
		// int index = Ex07.getRandomInteger(0, 3);
		// int index = new Random().nextInt(4);
		Random rnd = new Random();
		int index = rnd.nextInt(4);
		cardArr[index] = "****";
		
		// 각각의 카드 배열의 요소들을 "-" 라는 구분자로 연결해서 출력
		// String.join() 메서드
		String result = String.join("-", cardArr);
		System.out.println(result);
		
	} // main
	
}
