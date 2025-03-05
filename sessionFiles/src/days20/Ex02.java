package days20;

/**
 * @author kenik
 * @date 2025. 2. 28. - 오전 10:31:34
 * @subject 
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		2. 문자열 다루는 클래스 및 메소드 문제.
		  String data = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
		  ㄱ. "홍길동"을 찾아서 모든 위치를 출력하고
		  ㄴ. 두 번째 "홍길동"을 본인이름으로 바꿔서 출력하세요. 

		  실행결과)
		    ㄱ. 결과
		  	> 1번째 찾은 위치 : 7
			> 2번째 찾은 위치 : 19
			> 3번째 찾은 위치 : 31
			ㄴ. 결과
			안녕하세요. 홍길동입니다. 이름은 이창익입니다. 별명도 홍길동입니다.
		 */
		String data = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
		String word = "홍길동";
		int wordLength = word.length(); // 3
		int index = -1;  // 홍길동을 찾은 위치를 저장할 변수
		int fromIndex = 0; // 찾기 시작할 위치를 저장할 변수
		int count = 0;
		/* [1]
		while(true) {
			index = data.indexOf(word, fromIndex);
			if( index == -1 ) break;
			System.out.printf("> %d번째 찾은 위치 : %d\n", count++ , index);
			fromIndex = index + wordLength;
		} // while
		*/
		
		int [] findArr = new int[data.length()/wordLength];
		// int twoIndex = -1;
		while( (index = data.indexOf(word, fromIndex)) != -1 ) {
			findArr[count] = index;
			System.out.printf("> %d번째 찾은 위치 : %d\n", ++count , index);
			// if( count == 2 ) twoIndex = index;
			fromIndex = index + wordLength;			
		} // while

		StringBuilder sb = new StringBuilder(data);
		int start = findArr[1];
		// int start = twoIndex;
		int end = start + wordLength;
		sb.replace(start, end, "이창익");
		
		System.out.println(sb.toString());
		
		System.out.println("end");
	} // main

} // class
