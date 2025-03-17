package tennisGame;

public class Main{

	public static void main(String[] args) {
		
		startGame();
		
	} // main
	
	// 메서드
	static void startGame() {
		// 정보 입력
		Match match = new Scan().scan();
		
		// 매치(경기) 시작
		match.startMatch();
		
	}
} // class
