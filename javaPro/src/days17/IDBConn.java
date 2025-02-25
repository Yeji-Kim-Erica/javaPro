package days17;

/**
 * @author 김예지
 * @date 2025. 2. 25.
 * @subject
 * @content
 */

// DBMS가 무엇이 되든지 (예: Oracle, My SQL, MS SQL Server 등등) 구현이 가능하게 하는 인터페이스
public interface IDBConn {
	
	public abstract void open(); // DB 연결하는 메서드
	void close(); // DB 연결 종료하는 메서드
	
	void select();
	void insert();
	void update();
	void delete();
	
}
