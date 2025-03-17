package tennisGame;

public class Match implements Score{
	
	// [필드]
	// 선수 정보
	Info info;
	
	// 세트
	Set set;
	
	// 게임
	Game game;
	
	// 경기 방식
	int matchType; // 단식(1) / 복식(2)
	int setCount; // 3세트(3) / 5세트(5)
	int setType; // 어드밴티지세트(1) / 타이브레이크세트(2)
	int lastSet; // 타이브레이크 경기에서 마지막 세트 타입: 어드밴티지세트(1) / 타이브레이크세트(2)
	
	// 몇번째 세트
	int currentSet = 1;
	
	// 매치 스코어
	int matchScoreA;
	int matchScoreB;
	
	// 매치 종료 지점
	int matchEndPoint;
	
	// 해당 세트 우승 선수/팀
	int matchPoint;
	
	// 최종 우승 선수/팀
	String matchWinner;

	// [생성자]
	// 어드밴티지 경기
	public Match(int matchType, int setCount, int setType) {
		this.matchType = matchType;
		this.setCount = setCount;
		this.setType = setType;
		this.matchEndPoint = setCount - setCount/2;
	}

	// 타이브레이크 경기
	public Match(int matchType, int setCount, int setType, int lastSet) {
		this.matchType = matchType;
		this.setCount = setCount;
		this.setType = setType;
		this.lastSet = lastSet;
		this.matchEndPoint = setCount - setCount/2;
	}
	
	// [메서드]
	@Override
	public void pointWinner(int p) {
		if (p == 1) {
			matchScoreA++;
		} else {
			matchScoreB++;
		} // if else
	}
	
	@Override
	public void dispScoreBoard(Match match) {
		System.out.printf("Speaker > Set %s!\n", (matchPoint==1) ? info.teamA : info.teamB);
		System.out.println("=".repeat(80));
	}
	
	// 경기 시작
	void startMatch() {
		if (setType==1) {
			advantageMatch();
		} else {
			tieBreakMatch();
		}
		System.out.printf("Speaker > Match %s!\n", matchWinner);
		System.out.println("=".repeat(80));
		System.out.println("[경기 종료]");
		System.out.printf("매치 스코어: %s(%d) VS %s(%d)\n", info.teamA, matchScoreA, info.teamB, matchScoreB);
		System.out.printf("최종 우승 %s: %s\n", (matchType==1) ? "선수" : "팀", matchWinner);
	}
	
	// 어드밴티지 경기
	void advantageMatch() {
		while (currentSet <= setCount) {
			set = new Set();
			matchPoint = set.advantageSet(this); // 어드밴티지 세트
			dispScoreBoard(this);
			pointWinner(matchPoint);
			currentSet++;
			if (matchScoreA==matchEndPoint || matchScoreB==matchEndPoint) break;
		} // while
		
		matchWinner = (matchScoreA > matchScoreB) ? info.teamA : info.teamB;
	}
	
	// 타이브레이크 경기
	void tieBreakMatch() {
		while (currentSet < setCount) {
			set = new Set();
			matchPoint = set.tieBreakSet(this); // 타이브레이크 세트
			dispScoreBoard(this);
			pointWinner(matchPoint);
			if (matchScoreA==matchEndPoint || matchScoreB==matchEndPoint) break;
			currentSet++;
		} // while
		
		if (currentSet==setCount) {
			set = new Set();
			matchPoint = (setType==1) ? set.advantageSet(this) : set.tieBreakSet(this); // 어드밴티지 세트
			dispScoreBoard(this);
			pointWinner(matchPoint);
		}
		
		matchWinner = (matchScoreA > matchScoreB) ? info.teamA : info.teamB;
	}
	
}
