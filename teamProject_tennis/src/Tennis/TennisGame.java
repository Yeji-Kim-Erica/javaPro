package Tennis;

import java.io.IOException;
import java.util.Random;

public class TennisGame {

    private final int[] scorePlus = {0, 15, 30, 40};
    private String p1;
    private String p2;
    private Status status;
    private StringBuilder sb;

	public TennisGame(int currentServer, String player1, String player2, StringBuilder sb, Status status) {
		super();
		this.p1 = player1;
		this.p2 = player2;
		this.status = status;
		this.sb = new StringBuilder();
		resetGame();
		
	}

	private void resetGame() {
        status.player1Point = 0;
		status.player2Point = 0;
		status.isAdvantagePlayer1 = false;
		status.isAdvantagePlayer2 = false;
		status.bDuece = false;
	}

	public int playGame(Random rnd) throws IOException {

		TennisWriter writer = TennisWriter.getInstance();
		
		// 게임
		while (true) {
			// 1 또는 2로 포인트를 랜덤하게 할당
			int point = rnd.nextInt(2) + 1;
			int adventagePoint = rnd.nextInt(2) + 1;

			// 듀스가 아닐때만 점수 출력
			if (!status.bDuece) {
				int gamePlaying = gamePlaying(point, status, p1, p2 ,scorePlus, sb, writer);
				if (gamePlaying == 1 && !status.bDuece ) {
					resetGame();
					return 1;
				}else if(gamePlaying == 2 && !status.bDuece ) {
					resetGame();
					return 2;
				}
			}

			// 듀스 상태에서 어드밴티지 처리
			else {
				int checkDeuce= deuce(adventagePoint, status, p1, p2, sb);
				if (checkDeuce == 1) {
					resetGame();
					status.bDuece = false;
					return 1;
				}else if(checkDeuce == 2) {
					resetGame();
					status.bDuece = false;
					return 2;
				}
			} 
		} 
	}

	private static int gamePlaying(int point, Status status, 
			String p1, String p2, int[] scorePlus, StringBuilder sb, TennisWriter writer) throws IOException {

		int winner = 0;
		status.dispScoreBoard();

		// 듀스 상태가 아닐때 게임 진행 현황
		if (status.player1Point == 40 && point == 1 && status.player2Point != 40 ) {
			winner=1;
		} else if (status.player2Point == 40 && point == 2 && status.player1Point != 40 ) {
			winner=2;
			// 듀스일때
		} else if (status.player1Point == 40 && status.player2Point == 40) { // 듀스 시작
			status.bDuece = true;
			winner = 3;
		}

		// 듀스 상태가 아니라면 점수를 15, 30, 40으로 증가
		if (point == 1) {
			status.player1Point = plusPoint(status.player1Point, scorePlus);
		} else {
			status.player2Point = plusPoint(status.player2Point, scorePlus);
		}
		return winner;
	}

	private static int deuce(int adventagePoint,Status status, String p1, String p2, StringBuilder sb) throws IOException {

		int winner = 0;

		if (adventagePoint == 1) {
			if (!status.isAdvantagePlayer1) {
				// 어드밴티지로 설정
				status.isAdvantagePlayer1 = true;
				status.isAdvantagePlayer2 = false;
				status.dispScoreBoard();
			} else {
				// 어드밴티지 상태에서 첫 번째 점수를 이기면 게임 승리
				status.dispScoreBoard();
				winner = 1;
			}
		} else {
			if (!status.isAdvantagePlayer2) {
				status.isAdvantagePlayer1 = false;
				status.isAdvantagePlayer2 = true;
				status.dispScoreBoard();
			} else {
				status.dispScoreBoard();
				winner = 2;
			}
		}
		return winner;
	}

	private static int plusPoint(int playerPoint, int[] scorePlus) {
		if (playerPoint == 0) {
			playerPoint = scorePlus[1];
		} else if (playerPoint == scorePlus[1]){
			playerPoint = scorePlus[2];
		}else {
			playerPoint = scorePlus[3];
		}
		return playerPoint;
	}
}
