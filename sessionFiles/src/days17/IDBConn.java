package days17;

// Oracle, My SQL, MS SQL Server 등등
public interface IDBConn {
	
	public abstract void open(); // DB 연결하는 메서드
	void close();  // DB 연결 종료(닫기) 
	
	// CRUD 작업
	void select();
	void insert();
	void update();
	void delete();

}
