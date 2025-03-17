package tennisGame;

public class Info {

	// [필드]
	// 선수명/팀명
	String teamA; // A선수명(단식) / A팀(복식)
	String teamB; // B선수명(단식) / B팀(복식)
	
	// 복식에서만 사용되는 선수명 변수
	String a1; // A팀 선수1
	String a2; // A팀 선수2 
	String b1; // B팀 선수1 
	String b2; // B팀 선수2
	
	// 해당 게임 우승 선수/팀
	String gameWinner = null;
	
	// 해당 세트 우승 선수/팀
	String setWinner;
	
	// 최종 우승 선수/팀
	String matchWinner;
	
	// [생성자]
	public Info() {	}
	
	// 단식
	public Info(String teamA, String teamB) {
		this.teamA = teamA;
		this.teamB = teamB;
	}

	// 복식
	public Info(String teamA, String teamB, String a1, String a2, String b1, String b2) {
		this.teamA = teamA;
		this.teamB = teamB;
		this.a1 = a1;
		this.a2 = a2;
		this.b1 = b1;
		this.b2 = b2;
	}
	
}
