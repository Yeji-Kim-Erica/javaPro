package javaPro;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {

		int[] cards = { 8, 6, 3, 7, 2, 5, 1, 4 };
		System.out.println(solution(cards));
	}

	public static int solution(int[] cards) {
		int answer, boxNum, count, openedBox, sum;
		boxNum = count = openedBox = sum = 0;
		answer = 1;
		boolean flag = false;
		int[] boxes = new int[cards.length];

		do {
			while (!flag) {
				boxNum = (int) (Math.random() * cards.length);
				if (cards[boxNum] != 0) flag = true;
			}

			BOX: while (openedBox < cards.length) {
				int temp = cards[boxNum];
				cards[boxNum] = 0;
				boxNum = temp - 1;
				openedBox++;
				if (cards[boxNum] == 0) break BOX;
			}
			boxes[count] = openedBox;
			sum += openedBox;
			if (sum == cards.length) break;
			openedBox = 0;
			flag = false;

		} while (++count < cards.length);

		Arrays.sort(boxes);
		answer = boxes[boxes.length - 1] * boxes[boxes.length - 2];

		return answer;
	}

}
