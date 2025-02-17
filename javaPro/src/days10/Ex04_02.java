package days10;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import days08.*;

/**
 * @author yejikim
 * @date 2025. 2. 14. - 오후 3:12:15
 * @subject 배열의 가장 큰 단점: 자동으로 크기가 증가 X
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int[] korArr = new int[3];
		int index = 0;
		// ↓
		// [0] [0] [0]
		// k[0]k[1]k[2]
		String regex = "^(100|[1-9]?[0-9])$";
		int score;
		char con = 'y';

		do {
			System.out.printf("%d번 학생 점수 입력 ? ", index + 1);
			score = Ex07.getRandomInteger(0, 100);

			if (index == korArr.length) {
				int[] temp = new int[korArr.length + 2]; // 꼭 2씩 늘릴 필요는 없음. 매개변수로 얼마 늘린 것인지를 받아서 10%, 20% 등 비율만큼 늘리라고 주기도 함.
				for (int i = 0; i < korArr.length; i++) {
					temp[i] = korArr[i];
				} // for i
				korArr = temp;
			} // if
			korArr[index++] = score;

			System.out.printf("> 입력 계속 할래 ? ", index + 1);
			con = (char) System.in.read();
			System.in.skip(System.in.available()); // \\r \\n
		} while (Character.toUpperCase(con) == 'Y');

		dispScore(korArr, index);

		// 최고점수/최저점수/점수평균

//		Arrays.sort(korArr);
//		int maxScore = korArr[korArr.length - 1];
//		int minScore = korArr[korArr.length - index];
//		double avgScore = Arrays.stream(korArr).sum() / (double) korArr.length;

		int maxScore = IntStream.of(korArr).limit(index).max().getAsInt();
		int minScore = IntStream.of(korArr).limit(index).min().getAsInt();
		double avgScore = IntStream.of(korArr).limit(index).average().getAsDouble();

		System.out.printf("최고점수: %d, 최저점수: %d, 점수평균: %.2f", maxScore, minScore, avgScore);

	} // main

	private static void dispScore(int[] korArr, int index) {
		System.out.printf("> 입력한 개수 : %d개\\n", index);
		for (int i = 0; i < index; i++) {
			System.out.printf("[%d]번 학생의 점수 : %d점\n", i + 1, korArr[i]);
		} // for i
	}

}
