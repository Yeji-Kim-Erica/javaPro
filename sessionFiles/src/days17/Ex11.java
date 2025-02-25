package days17;

/**
 * @author kenik
 * @date 2025. 2. 25. - 오후 3:17:11
 * @subject 
 * @content
 */
public class Ex11 {  // AudioPlayer
	
	// 필드
	A_Player player;
	
	public static void main(String[] args) {
		/*
		 * [ 인터페이스 사용 장점 ]
		 * 1. 개발 시간을 단축.
		 * 2. 표준화 가능
		 * 3. 서로 관련 없는 클래스들에게 관계를 맺어 줄 수 도 있다. 
		 * 4. 독립적인 프로그래밍이 가능하다. 
		 * */
		/*
		Ex11 obj = new Ex11();
		obj.player.stop();
		obj.player.play();
		*/

		// 개발..
		//
		
		//         인터페이스 선언       CRUD 작업
		// 이번 프로젝트 개발 DBMS  : Oracle
		// 다음        "       "    : MS SQL Server
		// 다음        "       "    : My SQL
		
		// 다형성
		// 인터페이스 참조( 업캐스팅 가능 )
		// IDBConn conn = new OracleDrvier();
		IDBConn conn = new MySQLDrvier();
		
		conn.open();
		
		conn.select();
		conn.insert();
		// :
		
		conn.close();
	}

}

interface ILotto{
	int LENGTH = 6;
	void fillLotto(int [] lotto);
	void dispLotto(int [] lotto);
	void isDuplicateLotto(int [] lotto);
}

interface Player2{
	void stop();
	void play();
}

class A_Player implements Player2{

	@Override
	public void stop() {
		// 1주 동안 구현
		
	}

	@Override
	public void play() {
		// 1주 동안 구현
	}
	
}
