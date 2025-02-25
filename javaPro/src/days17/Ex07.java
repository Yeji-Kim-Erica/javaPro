package days17;

/**
 * @author 김예지
 * @date 2025. 2. 25.
 * @subject [싱글톤(Singleton) 패턴]
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		
		// BoardDAO dao = new BoardDAO(); 생성 불가
		BoardDAO dao1 = BoardDAO.getInstance();
		BoardDAO dao2 = BoardDAO.getInstance();
		BoardDAO dao3 = BoardDAO.getInstance();
		BoardDAO dao4 = BoardDAO.getInstance();
		
		System.out.println(dao1.hashCode());
		System.out.println(dao2.hashCode());
		System.out.println(dao3.hashCode());
		System.out.println(dao4.hashCode());
		
		// 출력결과: 하나의 인스턴스만 생성됨 (해시코드가 동일)
		/*
		 	985922955
			985922955
			985922955
			985922955
		 */
		
		
	} // main
	
} // class

// 싱글톤 패턴 - DAO(Data Access Object)

class BoardDAO{
	/*
	// 2. Lazy Initialization (지연초기화) : 멀티스레드에서 안전하지 않음
	private static BoardDAO boardDAO = null;
	private BoardDAO(){} // 외부에서 객체 생성을 할 수 없게 막아두기
	public static BoardDAO getInstance() {
        if (boardDAO == null) { // 객체가 없으면 생성
        	boardDAO = new BoardDAO();
        }
        return boardDAO;
    }
	*/
	
	/*
	// 3. Thread-Safe Singleton (멀티스레드 안전)
	private static BoardDAO boardDAO;

	private BoardDAO(){}

    public static synchronized BoardDAO getInstance() { // 동기화 처리
    	if (boardDAO == null) {
        	boardDAO = new BoardDAO();
        }
        return boardDAO;
    }
    */
    
    // 4. Double-Checked Locking (이중 체크 락)
	private static BoardDAO boardDAO;

	private BoardDAO(){}

    public static BoardDAO getInstance() {
    	if (boardDAO == null) { // 첫 번째 체크
            synchronized (BoardDAO.class) {
                if (boardDAO == null) { // 두 번째 체크
                	boardDAO = new BoardDAO();
                }
            }
        }
        return boardDAO;
    }
    
    
}













