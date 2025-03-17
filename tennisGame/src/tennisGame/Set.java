package tennisGame;

public class Set implements Score{

	// [필드]
	// 매치
	Match match;
	
	// 게임
	Game game;
	
	// 세트 스코어 / 이긴 게임 수: setScore
	int setScoreA; // A선수/팀이 이긴 게임 수
	int setScoreB; // B선수/팀이 이긴 게임 수
	
	// 해당 게임 우승 선수/팀
	int setPoint;
	
	// 해당 세트 우승 선수/팀
	String setWinner;
	
	// 몇번째 세트
	int currentGame = 1;
	
	// [생성자]
	
	// [메서드]
	@Override
	public void pointWinner(int p) {
		if (p == 1) {
			setScoreA++;
		} else {
			setScoreB++;
		} // if else
	}
	
	@Override
	public void dispScoreBoard(Match match) {
		System.out.printf("Speaker > Game %s!\n", (setPoint==1) ? match.info.teamA : match.info.teamB);
		System.out.println("=".repeat(80));
	}
	
	// 어드밴티지 세트
	int advantageSet(Match match) {
		match.set = this;
		setScoreA = 0;
		setScoreB = 0;
		String teamA = match.info.teamA;
		String teamB = match.info.teamB;
		
		boolean exitSet = false;

		while (!exitSet) {
			game = new Game();
			setPoint = game.standardGame(match); // 스탠다드 게임
			dispScoreBoard(match);
			pointWinner(setPoint);
			currentGame++;
			exitSet = (setScoreA >= 6 || setScoreB >= 6) && (Math.abs(setScoreA-setScoreB) >= 2);
			game.startTeam = (game.startTeam==1) ? 2 : 1;
		} // while
		
		setWinner = (setScoreA > setScoreB) ? teamA : teamB;
		
		return (setWinner.equals(teamA)) ? 1 : 2;
	}
	
	// 타이브레이크 세트
	int tieBreakSet(Match match) {
		match.set = this;
		setScoreA = 0;
		setScoreB = 0;
		String teamA = match.info.teamA;
		String teamB = match.info.teamB;
		boolean exitSet = false;
		
		while (!exitSet) {
			game = new Game();
			setPoint = game.standardGame(match); // 스탠다드 게임
			dispScoreBoard(match);
			pointWinner(setPoint);
			currentGame++;
			if (setScoreA == 6 && setScoreB == 6) {
				game = new Game();
				game.isTieBreakGame = true;
				dispScoreBoard(match);
				setPoint = game.tieBreakGame(match); // 타이브레이크 게임
				break;
			}
			exitSet = (setScoreA >= 6 || setScoreB >= 6) && (Math.abs(setScoreA-setScoreB) >= 2);
			game.startTeam = (game.startTeam==1) ? 2 : 1;
		} // while
		
		setWinner = (setScoreA > setScoreB) ? teamA : teamB;
		
		return (setWinner.equals(teamA)) ? 1 : 2;
	}

}
