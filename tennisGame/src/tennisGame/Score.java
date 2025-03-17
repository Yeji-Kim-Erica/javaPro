package tennisGame;

import java.util.Random;

public interface Score {

	Random random = new Random();
	
	// 전광판에 표시될 점수
	String[] score = {"0", "15", "30", "40"};
	// 스피커가 부르는 스코어
	String[] speaker = {"LOVE", "FIFTEEN", "THIRTY", "FOURTY"};
	
	void pointWinner(int p); // 문제: p의 값이 1인가 2인가에 따라 해당 선수의 포인트를 증가시킴

	default void dispScoreBoard(Match match) { // 문제: 현재의 스코어보드를 화면에 출력
		Match m = match;
		String teamA = m.info.teamA;
		String teamB = m.info.teamB;
		int matchScoreA = m.matchScoreA;
		int matchScoreB = m.matchScoreB;
		
		Set s = match.set;
		int setScoreA = s.setScoreA;
		int setScoreB = s.setScoreB;
		
		Game g = match.set.game;
		int gameScoreA = g.gameScoreA;
		int gameScoreB = g.gameScoreB;
		boolean isTieBreakGame = g.isTieBreakGame;
		boolean isDuece = g.isDuece;
		int advantagePointA = g.advantagePointA;
		int advantagePointB = g.advantagePointB;
		int startTeam = g.startTeam;
		
		// 점수판에 출력되는 스코어
		String scoreA = gameScoreA + "";
		String scoreB = gameScoreB + "";
		if (!isTieBreakGame) {
			if (isDuece) {
				scoreA = (advantagePointA==1) ? "AD" : "";
				scoreB = (advantagePointB==1) ? "AD" : "";
			} else {
				scoreA = score[gameScoreA];
				scoreB = score[gameScoreB];
			} // if else
		} // if
		
		// 실제로 부르는 스코어
		String speak = null;
		String speakA = null;
		String speakB = null;
		if (!isTieBreakGame) {
			if ((gameScoreA==3 && gameScoreB==3) && !isDuece) {
				speak = "Duece";
			} else {
				speakA = speaker[gameScoreA];
				speakB = speaker[gameScoreB];
				speak = (startTeam==1) ? String.format("%s %s", speakA, speakB) : String.format("%s %s", speakB, speakA);
				if (isDuece) speak = String.format("Advantage %s", 
						((startTeam==1 && advantagePointA==1) || (startTeam==2 && advantagePointB==1)) ? "In" : "Out");
			} // if else
		} // if
		
		// 출력화면
		System.out.println("Player\tServe\tSet\tGame\tPoint");
		System.out.printf("%-3s\t%-5s\t%2d\t%2d\t%3s\n", teamA, (startTeam==1) ? "  s" : " ",  matchScoreA, setScoreA, scoreA);
		System.out.printf("%-3s\t%-5s\t%2d\t%2d\t%3s\n", teamB, (startTeam==2) ? "  s" : " ",  matchScoreB, setScoreB, scoreB);

		System.out.println("-".repeat(80));
		
		if (gameScoreA != 0 || gameScoreB != 0) {
			System.out.printf("Speaker > %s\n", speak);
			System.out.println("=".repeat(80));
		} else {
			if (matchScoreA==0 && matchScoreB==0 && setScoreA==0 && setScoreB==0) {
				System.out.println("\t\t[경기시작]");
				System.out.println("=".repeat(80));
			}
		}
		
		//sc.nextLine();
	};
	
}
