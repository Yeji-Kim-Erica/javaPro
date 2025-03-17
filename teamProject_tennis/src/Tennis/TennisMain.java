package Tennis;

import java.io.IOException;

public class TennisMain {

	public static void main(String[] args) throws IOException {
		
		// 경기 시작 전 사전 정보 입력
		Player p  = new Player();
		
		TennisMatch match = new TennisMatch(p.getTeamA(), p.getTeamB(), p.getSetType(), p.getSetCount(), p.getLastSetType(), p.getContent());
		match.playMatch();
		
	} // main


}


