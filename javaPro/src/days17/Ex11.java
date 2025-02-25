package days17;

/**
 * @author 김예지
 * @date 2025. 2. 25.
 * @subject
 * @content
 */
public class Ex11 {

	A_Player player;
	
	public static void main(String[] args) {
		
		/* [인터페이스 사용 장점]
		 	1. 개발 시간을 단축.
		 	2. 표준화가 가능.
		 	3. 서로 관련없는 클래스들에게 관계를 맺어줄 수도 있다.
		 	4. 독립적인 프로그래밍이 가능하다.
		 */
		
		// 추상클래스는 공통된 필드를 가지는 거 중복코딩 막기 위한 정도로 생각~
		
//		Ex11 obj = new Ex11();
//		obj.player.stop();
//		obj.player.play();
		
		// 인터페이스 선언  CRUD 작업
		// 이번 플젝 DBMS: Oracle
		// 다음 플젝 DBMS: MS SQL Server
		// 다다음 플젝 DBMS: My SQL
		
		// 다형성
		// 인터페이스 참조 (업캐스팅)
		// IDBConn conn = new OracleDriver();
		IDBConn conn = new MySQLDriver();
		
		conn.open();
		
		conn.select();
		conn.select();
		
	} // main
	
}

interface ILotto{
	int LENGTH = 6;
	void fillLotto(int[] lotto);
	void dispLotto(int[] lotto);
	void isDuplicate(int[] lotto);
}

interface Playerr{
	void play();
	void stop();
}

class A_Player implements Playerr{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}
