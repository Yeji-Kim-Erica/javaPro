package Tennis;

import java.io.IOException;

enum Score {
	LOVE(0), FIFTEEN(15), THIRTY(30), FOURTY(40), AD(41);

	private final int point;

	Score(int point) {
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	public static String getPointNameByPoint(int point) {
		for (Score score : Score.values()) {
			if (score.getPoint() == point) {
				return score.name(); // 존재하면 enum 이름 반환
			}
		}
		return ""; // 없으면 빈 문자열 반환
	}
}

interface IRun{
	boolean pointWinner(int p);
	void dispScoreBoard();
}

class Status implements IRun{
	Score pointName;// = Score.getPointNameByPoint(0);;

	String playerName1;
	String playerName2;
	String teamName1;
	String teamName2;

	int serve = 1;

	int player1Point;
	int player2Point;

	int player1DuecePoint = 0;
	int player2DuecePoint = 0;

	int player1Game;
	int player2Game;

	int player1Set;
	int player2Set;

	boolean bDual = false;
	boolean bDuece = false;

	boolean isAdvantagePlayer1 = false;  // 어드밴티지 상태 설정
	boolean isAdvantagePlayer2 = false;

	boolean isTieBreak = false;
	int tieBreakPoint1;
	int tieBreakPoint2;

	public Status(String Name1, String Name2, boolean bDual, int ...args) {
		super();

		this.bDual = bDual;      

		if(!bDual)
		{
			playerName1 = Name1;
			playerName2 = Name2;
			teamName1 = "";
			teamName2 = "";
		}
		else
		{
			playerName1 = "";
			playerName2 = "";
			teamName1 = Name1;
			teamName2 = Name2;
		}
		this.player1Point = args.length > 0 ? args[0] : 0;
		this.player2Point = args.length > 1 ? args[1] : 0;
		this.player1Game = args.length > 2 ? args[2] : 0;
		this.player2Game = args.length > 3 ? args[3] : 0;
		this.player1Set = args.length > 4 ? args[4] : 0;
		this.player2Set = args.length > 5 ? args[5] : 0;
		this.player1DuecePoint = args.length > 6 ? args[6] : 0;
		this.player2DuecePoint = args.length > 7 ? args[8] : 0;
	}   

	@Override
	public boolean pointWinner(int p) {
		return false;
	}

	@Override
	public void dispScoreBoard() {

		try {
			TennisWriter writer = TennisWriter.getInstance();

			StringBuilder sb = new StringBuilder();

			sb.append("\nPlayer\t\tServe\tSet\tGame\tPoint\n");
			sb.append("-".repeat(60) + "\n");


			if(!isTieBreak) {
				String AdvPlayer1 = (isAdvantagePlayer1 ? "AD" : "") + "  ";  // 어드밴티지 상태일 때만 AD 표시
				String AdvPlayer2 = (isAdvantagePlayer2 ? "AD" : "") + "  ";  // 어드밴티지 상태일 때만 AD 표시
				if (!bDuece) {
					sb.append(String.format("%s\t\t%s\t%2d\t%2d\t%3s\n", playerName1, (serve == 1 ? "Serve" : ""), player1Set, player1Game, (!bDuece ? player1Point : Score.getPointNameByPoint(player1Point))));
					sb.append(String.format("%s\t\t%s\t%2d\t%2d\t%3s\n", playerName2, (serve == 2 ? "Serve" : ""), player2Set, player2Game, (!bDuece ? player2Point : Score.getPointNameByPoint(player2Point))));
					
				} else {
					sb.append(String.format("%s\t\t%s\t%2d\t%2d\t%3s\n", playerName1, (serve == 1 ? "Serve" : ""), player1Set, player1Game, AdvPlayer1));
					sb.append(String.format("%s\t\t%s\t%2d\t%2d\t%3s\n", playerName2, (serve == 2 ? "Serve" : ""), player2Set, player2Game, AdvPlayer2));
					
				}
				
				if (bDuece) {
					if (isAdvantagePlayer1) {  // Player1이 어드밴티지 상태일 때
						sb.append(String.format("\nSpeak > %s\n", AdvPlayer1 + " " + playerName1));
						sb.append("=".repeat(60));
					} else if (isAdvantagePlayer2) {  // Player2가 어드밴티지 상태일 때
						sb.append(String.format("\nSpeak > %s\n", AdvPlayer2 + " " + playerName2));
						sb.append("=".repeat(60));
					} else {  // 듀스 상태
						sb.append(String.format("\nSpeak > %s\n", "[Deuce]"));
						bDuece = true;
						sb.append("=".repeat(60));
					}
				} else {  // 듀스 상태가 아닐 때 점수 증가
					if (player1Point != 40 || player2Point != 40) {  // 듀스가 아니면 점수 표시
						sb.append(String.format("\nSpeak > %s\n", (serve == 1 ? Score.getPointNameByPoint(player1Point) + "  " + Score.getPointNameByPoint(player2Point)
						: Score.getPointNameByPoint(player2Point) + "  " + Score.getPointNameByPoint(player1Point))));
					} else {  // 듀스 상태로 전환
						sb.append(String.format("\nSpeak > %s\n", "[Deuce]"));
						bDuece = true;
					}
					sb.append("=".repeat(60));
				}  
			}

			if (isTieBreak) {

				sb.append(String.format("%s\t\t%s\t%2d\t%2d\t%3s\n", playerName1, (serve == 1 ? "Serve" : ""), player1Set, player1Game, tieBreakPoint1));
				sb.append(String.format("%s\t\t%s\t%2d\t%2d\t%3s\n", playerName2, (serve == 2 ? "Serve" : ""), player2Set, player2Game, tieBreakPoint2));
			}
			System.out.println(sb.toString());
			writer.write(sb.toString());
			
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}   

}