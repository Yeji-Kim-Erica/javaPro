package programmers;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, 2);
        for (int i = 0; i < numbers.length; i++) {
			answer[i] *= numbers[i];
		} // for i
        return answer;
    }
}