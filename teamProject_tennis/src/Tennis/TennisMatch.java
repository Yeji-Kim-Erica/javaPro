package Tennis;

import java.io.IOException;
import java.util.Random;

public class TennisMatch {

	private String player1;
	private String player2;
	private int setType;
	private int setCount;
	private int lastSet;
	private String content;
	private Random rnd;

	public TennisMatch(String p1, String p2, int setType, int setCount, int lastSet, String content) {
		this.player1 = p1;
		this.player2 = p2;
		this.setType = setType;
		this.setCount = setCount;
		this.lastSet = lastSet;
		this.rnd = new Random();
		this.content = content;
	}

	public void playMatch() throws IOException {

		Status status = new Status(player1, player2, false,0,0,0,0,0,0);
		int startPlayer = rnd.nextInt(2)+1;
		int currentServer = startPlayer;

		TennisWriter writer = TennisWriter.getInstance();
		System.out.println(content);
		writer.write(content);
		StringBuilder sb = new StringBuilder();

		while (true) {
			TennisSet set = new TennisSet(player1, player2, currentServer, setType, setCount,lastSet, sb, status);
			int winner = set.playSet(rnd);

			if (winner == 1) {
				status.player1Set++;
			} else {
				status.player2Set++;
			}

			sb.setLength(0);
			sb.append(String.format("\n[Set Win] %s %d : %s %d\n", 
					player1, status.player1Set, (winner == 1 ? player1 : player2), status.player2Set));
			sb.append("=".repeat(60));

			writer.write(sb.toString());
			System.out.println(sb.toString());

			if ((setCount == 3 && status.player1Set >= 2) || (setCount == 5 && status.player1Set >= 3)) {
				sb.setLength(0);
				sb.append(String.format("\n[Match Win] %s \n", (status.player1Set > status.player2Set) ? player1 : player2));
				writer.write(sb.toString());
				System.out.println(sb.toString());
				break;
			}

			else if ((setCount == 3 && status.player2Set >= 2) || (setCount == 5 && status.player2Set >= 3)) {
				sb.setLength(0);
				sb.append(String.format("\n[Match Win] %s \n", (status.player1Set > status.player2Set) ? player1 : player2));
				writer.write(sb.toString());
				System.out.println(sb.toString());
				break;
			}
		}
	}
}
