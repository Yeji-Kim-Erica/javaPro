package tennisGame;

import java.util.Scanner;

public class Scan {

	// [필드]
	// 입력
	Scanner sc = new Scanner(System.in);
	
	// 경기 방식
	Match match;
	
	// 선수/팀명
	Info info;
	
	static String[] matchTypes = {"", "단식", "복식"};
	static String[] setTypes = {"","어드밴티지 세트","타이브레이크 세트"};
	
	// [생성자]
	
	// [메서드]
	
	// 입력 메서드
	Match scan() {
		match = saveMatchInfo();
		if (match.matchType == 1) {
			match.info = saveNameSingles();
		} else {
			match.info = saveNameDoubles();
		} // if else
		
		int a, b, c, d;
		a = match.matchType;
		b = match.setCount;
		c = match.setType;
		d = match.lastSet;
		
		System.out.println("-".repeat(80));
		System.out.printf("%s경기 / %d판 %d선승제 / %s 방식", matchTypes[a], b, b-b/2, setTypes[c]);
		System.out.printf("%s%s ", (c==2) ? " / 마지막 세트: " : "", (c==2) ? setTypes[d] : "");
		System.out.printf("(%s VS %s)\n", match.info.teamA, match.info.teamB);
		System.out.println("=".repeat(80));
		
		return match;
	}
	
	// 1. 경기 방식 입력
	Match saveMatchInfo() {
		int a, b, c, d;
		a = chooseMatchType();
		b = chooseSetCount();
		c = chooseSetType();
		d = 0;
		if (c == 2) {
			d = chooseLastSet();
			this.match = new Match(a, b, c, d);
		} else {
			this.match = new Match(a, b, c);
		}
		System.out.println("-".repeat(80));
		
		return this.match;
	}
	
	// 1-1. 단식/복식
	int chooseMatchType() {
		String matchType;
		int cnt = 0;
		do {
			if (cnt++ != 0) System.out.println("[경고] 올바른 매치 타입이 아닙니다. 1 또는 2를 입력해주세요.\n");
			System.out.print("> 매치 타입 입력 (단식: 1, 복식: 2) : ");
			matchType = sc.nextLine().trim();
		} while (!matchType.matches("1|2"));
		return Integer.parseInt(matchType);
	}
	
	// 1-2. 3세트/5세트
	int chooseSetCount() {
		String setCount;
		int cnt = 0;
		do {
			if (cnt++ != 0) System.out.println("[경고] 올바른 세트 수가 아닙니다. 3 또는 5를 입력해주세요.\n");
			System.out.print("> 세트 입력 (3세트: 3, 5세트: 5) : ");
			setCount = sc.nextLine().trim();
		} while (!setCount.matches("3|5"));
		return Integer.parseInt(setCount);
	}
	
	// 1-3. 어드밴티지 세트/타이브레이크 세트
	int chooseSetType() {
		String setType;
		int cnt = 0;
		do {
			if (cnt++ != 0) System.out.println("[경고] 올바른 세트 타입이 아닙니다. 1 또는 2를 입력해주세요.\n");
			System.out.print("> 세트 타입 입력 (어드밴티지 세트: 1, 타이브레이크 세트: 2) : ");
			setType = sc.nextLine().trim();
		} while (!setType.matches("1|2"));
		return Integer.parseInt(setType);
	}
	
	// 1-4. 타이브레이크 경기 시 마지막 세트 타입
	int chooseLastSet() {
		String lastSet;
		int cnt = 0;
		do {
			if (cnt++ != 0) System.out.println("[경고] 올바른 세트 타입이 아닙니다. 1 또는 2를 입력해주세요.\n");
			System.out.print("> 마지막 세트 타입 입력 (어드밴티지 세트: 1, 타이브레이크 세트: 2) : ");
			lastSet = sc.nextLine().trim();
		} while (!lastSet.matches("1|2"));
		return Integer.parseInt(lastSet);
	}
	
	// 2. 선수/팀 이름 입력
	// 2-1. 단식
	Info saveNameSingles() {
		String teamA, teamB;
		System.out.print("> 첫번째 선수 이름 입력 : ");
		teamA = sc.nextLine().trim();
		System.out.print("> 두번째 선수 이름 입력 : ");
		teamB = sc.nextLine().trim();
		this.info = new Info(teamA, teamB);
		
		return this.info;
	}

	// 2-2. 복식
	Info saveNameDoubles() {
		String teamA, teamB, a1, a2, b1, b2;
		
		System.out.print("> 첫번째 팀 이름 입력 : ");
		teamA =  sc.nextLine().trim();
		System.out.printf("%s팀 첫번째 선수 이름 입력 : ", teamA);
		a1 = sc.nextLine().trim();
		System.out.printf("%s팀 두번째 선수 이름 입력 : ", teamA);
		a2 = sc.nextLine().trim();
		
		System.out.print("> 두번째 팀 이름 입력 : ");
		teamB = sc.nextLine().trim();
		System.out.printf("%s팀 첫번째 선수 이름 입력 : ", teamB);
		b1 = sc.nextLine().trim();
		System.out.printf("%s팀 두번째 선수 이름 입력 : ", teamB);
		b2 = sc.nextLine().trim();
		
		this.info = new Info(teamA, teamB, a1, a2, b1, b2);
		
		return this.info;
	}

	
} // class
