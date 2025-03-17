package Tennis;

import java.io.IOException;
import java.util.Random;

public class TennisSet {

	private String p1;
	private String p2;
	private int currentServer;
	private int setType;
	private int setCount;
	private int lastSet;
	private Status status;
	private StringBuilder sb;

	public TennisSet(String player1, String player2, int currentServer, int setType, int setCount, int lastSet, StringBuilder sb, Status status) {
		this.p1 = player1;
		this.p2 = player2;
		this.currentServer = currentServer;
		this.setType = setType;
		this.setCount = setCount;
		this.lastSet = lastSet;
		this.sb = new StringBuilder();
		this.status = status;
		resetSet();

	}

	private void resetSet() {
		status.player1Game = 0;
		status.player2Game = 0;
		status.player1Point = 0;
		status.player2Point = 0;
		status.isTieBreak = false;
		status.tieBreakPoint1 = 0;
		status.tieBreakPoint2 = 0;

	}

	public int playSet(Random rnd) throws IOException {

		TennisWriter writer = TennisWriter.getInstance();

		while (true) {
			TennisGame game = new TennisGame(currentServer, p1, p2, sb, status);
			int winner = game.playGame(rnd);

			if (winner == 1) {
				status.player1Game++;

			}else {
				status.player2Game++;
			}


			boolean isLastSet = false;
			if (setType  == 2 && (setCount == 5  && status.player1Set == 2 && status.player2Set == 2) ||
					setType  == 2 && (setCount == 3  && status.player1Set == 1 && status.player2Set == 1)) {
				if ((status.player1Game == 6 && status.player2Game == 6)) {
					sb.append("마지막 세트");
					sb.append(String.format("마지막 세트 방식 : " + (lastSet == 1 ? "어드벤티지" : "타이브레이크")));
					isLastSet = true;
				}
			} // if

			boolean isLastSetTiebreak = (isLastSet && lastSet == 2);

			if (!isLastSet) {
				
				// 게임 스코어가 2점 차이 이상 날때 세트 종료
				if(status.player1Game > 6 || status.player2Game > 6 && Math.abs(status.player1Game-status.player2Game) >= 2 ) {

					sb.append(String.format("\n[Total Game Score]\n%s %d : %s %d\n", p1, status.player1Game, p2, status.player2Game));

					System.out.println(sb.toString());
					writer.write(sb.toString());

					// 게임 종료 후 서버 변경 (1 -> 2 또는 2 -> 1)
					currentServer = (currentServer == 2) ? 1 : 2;
					status.serve = currentServer;

					if (status.player1Game > status.player2Game) {
						resetSet();
						return 1;
					} else {
						resetSet();
						return 2;
					}

					// 게임 스코어가 동률이고 setType  이 타이브레이크일때
				}else if ((status.player1Game == 6 && status.player2Game == 6) && setType  == 2 ) {
					int win = tiebreakSet(currentServer, p1, p2, status, sb, writer);

					// 게임 종료 후 서버 변경 (1 -> 2 또는 2 -> 1)
					currentServer = (currentServer == 2) ? 1 : 2;
					status.serve = currentServer;

					if (win == 1) {
						resetSet();
						return 1;
					}else {
						resetSet();
						return 2;
					}
				}

			}else {
				// 마지막 세트가 타이브레이크 일때 
				if (isLastSetTiebreak && (status.player1Game == 6 && status.player2Game == 6)) {
					int win = tiebreakSet(currentServer, p1, p2, status, sb, writer);

					// 게임 종료 후 서버 변경 (1 -> 2 또는 2 -> 1)
					currentServer = (currentServer == 2) ? 1 : 2;
					status.serve = currentServer;

					if (win == 1) {
						resetSet();
						return 1;
					}else {
						resetSet();
						return 2;
					}

				} else if (!isLastSetTiebreak && (status.player1Game == 6 && status.player2Game == 6)){
					// 어드벤티지 세트는 기존의 일반 게임 종료 로직 유지
					sb.append(String.format("\n[Total Game Score]\n%s %d : %s %d\n", p1, status.player1Game, p2, status.player2Game));

					System.out.println(sb.toString());
					writer.write(sb.toString());

					// 게임 종료 후 서버 변경 (1 -> 2 또는 2 -> 1)
					currentServer = (currentServer == 2) ? 1 : 2;
					status.serve = currentServer;

					if (status.player1Game > status.player2Game) {
						resetSet();
						return 1;
					} else {
						resetSet();
						return 2;
					}
				}
			}
		}
	}

	private static int tiebreakSet(int currentServer, String p1, String p2, 
			Status status, StringBuilder sb, TennisWriter writer ) throws IOException {

		status.isTieBreak = true;
		currentServer = (currentServer == 1) ? 2 : 1;
		int winner = 0;

		Random rnd = new Random();

		status.tieBreakPoint1 = 0;
		status.tieBreakPoint2 = 0;

		int totalPoints = 0;

		sb.setLength(0);
		sb.append("\nSpeak > [TieBreak Start]\n");
		System.out.println(sb.toString());
		writer.write(sb.toString());

		sb.setLength(0);

		while (true) {
			int point = rnd.nextInt(2) + 1;
			if (point == 1) {
				status.tieBreakPoint1++;
			} else {
				status.tieBreakPoint2++;
			}

			totalPoints++;

			// 서브는 득점 여부와 관계없이 2포인트마다 교체
			if (totalPoints % 2 != 0) {
				currentServer = (currentServer == 1) ? 2 : 1;
				status.serve = currentServer;
			}

			status.dispScoreBoard();

			if ((status.tieBreakPoint1 > 6 || status.tieBreakPoint2 > 6) && Math.abs(status.tieBreakPoint1-status.tieBreakPoint2) >= 2) {
				sb.append(String.format("\n[Tiebreak Score]\n%s %d : %s %d\n", p1, status.tieBreakPoint1, p2, status.tieBreakPoint2));
				sb.append("=".repeat(60));
				winner = (status.tieBreakPoint1 > status.tieBreakPoint2) ? 1 : 2;

				// 타이브레이크 끝날때마다 게임 점수 초기화
				status.tieBreakPoint1 = 0;
				status.tieBreakPoint2 = 0;
				status.isTieBreak = false;
				break;
			} 
		}
		return winner;
	}
}
