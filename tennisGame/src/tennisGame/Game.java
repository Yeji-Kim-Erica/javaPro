package tennisGame;

import java.util.Random;
import java.util.Scanner;

public class Game implements Score{

	// [필드]
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	
	// 화면 출력을 위한 정보
	Info info;
	
	// 세트
	Set set;
	
	// 매치
	Match match;
	
	// 서브할 선수/팀
	int startTeam = random.nextInt(2)+1;
	
	// 게임 스코어 / 한 게임 내에서 득점(gameScore)
	int gameScoreA = 0; // A선수/팀의 한 게임 내 득점
	int gameScoreB = 0; // B선수/팀의 한 게임 내 득점
	
	// 게임 포인트 / 어느 선수/팀이 득점했는지
	int gamePoint = random.nextInt(2)+1; // 1일 때 A선수/팀 득점, 2일 때 B선수/팀 득점
	
	// 해당 게임 우승 선수/팀
	String gameWinner = null;
	
	// 몇번째 포인트
	int currentPoint = 1;
	
	// 스탠다드 게임에서만 사용
	// 듀스(AD) 상황에서 사용
	boolean isDuece = false;
	// 어드밴티지 스코어 (advantagePoint)
	int advantagePointA; // A선수/팀의 어드밴티지 스코어
	int advantagePointB; // B선수/팀의 어드밴티지 스코어
	
	// 타이브레이크 게임에서만 사용
	// 타이브레이크
	boolean isTieBreakGame = false;
	
	// [생성자]
	
	// [메서드]
	@Override
	public void pointWinner(int p) {
		if (p == 1) {
			gameScoreA++;
		} else {
			gameScoreB++;
		} // if else
		gamePoint = random.nextInt(2)+1;
	}
	
	@Override
	public void dispScoreBoard(Match match) {
		Score.super.dispScoreBoard(match);
		if (gameScoreA==0 && gameScoreB==0 && !(match.matchScoreA==0 && match.matchScoreB==0 && match.set.setScoreA==0 && match.set.setScoreB==0)) {
			System.out.printf("Speaker > Game %s!\n", gameWinner);
			System.out.println("=".repeat(80));
		}
	}
	
	// 스탠다드 게임(Standard Game)
	int standardGame(Match match) {
		match.set.game = this;
		gameScoreA = 0;
		gameScoreB = 0;
		String teamA = match.info.teamA;
		String teamB = match.info.teamB;
		boolean exitGame1 = false;
		boolean exitGame2 = false;
		
		while (!exitGame2) {
			
			do {
				dispScoreBoard(match);
				pointWinner(gamePoint);
				exitGame1 = (gameScoreA >= 3 || gameScoreB >=3);
				currentPoint++;
				if (gameScoreA > gameScoreB) {
					gameWinner = teamA;
				} else {
					gameWinner = teamB;
				} // if else
			} while (!exitGame1); // do~while
			
			if (gameScoreA == 3 && gameScoreB == 3) {
				duece(match);
			} // if
			
			exitGame2 = (gameScoreA == 4 || gameScoreB == 4);
		} // while
		
		return (gameWinner.equals(teamA)) ? 1 : 2;
	}
	
	// 듀스(Duece)
	void duece(Match match) {
		match.set.game = this;
		boolean exitDuece1 = false;
		boolean exitDuece2 = false;
		
		do {
			// 어드밴티지 스코어 (advantagePoint)
			advantagePointA = 0; // A선수/팀의 어드밴티지 스코어
			advantagePointB = 0; // B선수/팀의 어드밴티지 스코어
			
			do {
				dispScoreBoard(match);
				if (advantagePointA==0 && advantagePointB==0) isDuece = true;
				else isDuece = false;
				
				if (gamePoint == 1) {
					advantagePointA++;
				} else {
					advantagePointB++;
				} // if else
				
				gameWinner = (advantagePointA > advantagePointB) ? match.info.teamA : match.info.teamB;
				exitDuece1 = (advantagePointA==2 || advantagePointB==2);
				exitDuece2 = (advantagePointA==1 && advantagePointB==1);
				
				gamePoint = random.nextInt(2)+1;
				startTeam = (startTeam==1) ? 2 : 1;
				currentPoint++;
			} while (!exitDuece2 && !exitDuece1);
			
		} while (!exitDuece1);
		
		gamePoint = (advantagePointA > advantagePointB) ? 1 : 2;
		pointWinner(gamePoint);
		
	}

	// 타이브레이크 게임(Tie-break Game)
	int tieBreakGame(Match match) {
		match.set.game = this;
		isTieBreakGame = true;
		System.out.println("Tie-break Game 시작");
		System.out.println("-".repeat(60));
		
		gameScoreA = 0;
		gameScoreB = 0;
		String teamA = match.info.teamA;
		String teamB = match.info.teamB;
		int startTeamTieBreak = startTeam;
		boolean exitGame = false;
		
		do {
			gameWinner = (match.set.setPoint==1) ? teamA : teamB;
			dispScoreBoard(match);
			pointWinner(gamePoint);
			currentPoint++;
			if (currentPoint%2==0) startTeam = (startTeam==1) ? 2 : 1;
			exitGame = (gameScoreA >= 7 || gameScoreB >= 7) && Math.abs(gameScoreA - gameScoreB) >= 2;
			if (gameScoreA > gameScoreB) {
				gameWinner = teamA;
			} else {
				gameWinner = teamB;
			} // if else
		} while (!exitGame); // do while
		
		System.out.println("Tie-break Game 종료");
		startTeam = (startTeamTieBreak==1) ? 2 : 1;
		isTieBreakGame = false;
		return (gameWinner.equals(teamA)) ? 1 : 2;
	}
	
}
