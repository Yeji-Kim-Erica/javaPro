package tennisTeamProjectGroup5;

import java.util.Scanner;

public class Score {

	// [필드]
	// 입력
	Scanner sc = new Scanner(System.in);
	
	static String[] matchTypes = {"", "단식", "복식"};
	static String[] setTypes = {"","어드밴티지 세트","타이브레이크 세트"};
	
	// 경기 방식
	int matchType; // 단식(1) / 복식(2)
	int setCount; // 3세트(3) / 5세트(5)
	int setType; // 어드밴티지세트(1) / 타이브레이크세트(2)
	int lastSet; // 타이브레이크 경기에서 마지막 세트 타입: 어드밴티지세트(1) / 타이브레이크세트(2)
	
	
	
	// [생성자]
	
	// [메서드]
	
	
} // class
