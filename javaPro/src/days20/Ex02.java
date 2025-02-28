package days20;

import java.util.StringTokenizer;

/**
 * @author 김예지
 * @date 2025. 2. 28.
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		String data = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
		String word = "홍길동";
		int wordLength = word.length(); // 3
		int index = -1; // 홍길동을 찾은 위치를 저장할 변수
		int fromIndex = 0; // 찾기 시작할 위치를 저장할 변수
		int count = 1;
		int second = -1;
		
		/* [1]
		while (true) {
			index = data.indexOf(word, fromIndex);
			if (index == -1) break;
			System.out.printf("> %d번째 찾은 위치 : %d\n", count++, index);
			fromIndex = index + wordLength;
		} // while
		*/
		
		// [2]
		while ((index = data.indexOf(word, fromIndex)) != -1) {
			if(count == 2) second = index;
			System.out.printf("> %d번째 찾은 위치 : %d\n", count++, index);
			fromIndex = index + wordLength;
		} // while
		
		StringBuilder sb = new StringBuilder(data);
		sb.replace(second, second+wordLength, "김예지");
		System.out.println(sb);
		
		/*
		String data = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
		
		int index = data.indexOf("홍길동");
		int[] counts = new int[data.length()];
		int len = "홍길동".length();
		int i = 0;
		
		while (index!=-1) {
			System.out.printf("%d번째 찾은 위치 : %d\n", i+1, index);
			counts[i++] = index;
			index = data.indexOf("홍길동", index+1);
		} // while
		
		StringBuilder sb = new StringBuilder(data);
		sb.replace(counts[1], counts[1]+len, "김예지");
		System.out.println(sb);
		*/
	} // main
	
}
