package days17;

/**
 * @author kenik
 * @date 2025. 2. 25. - 오전 11:45:55
 * @subject   [ 싱글톤(Singleton) 패턴 ]
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		
		// BoardDAO dao = new BoardDAO();
		BoardDAO dao1 = BoardDAO.getInstance();
		BoardDAO dao2 = BoardDAO.getInstance();
		BoardDAO dao3 = BoardDAO.getInstance();
		BoardDAO dao4 = BoardDAO.getInstance();
		
		System.out.println( dao1.hashCode() );
		System.out.println( dao2.hashCode() );
		System.out.println( dao3.hashCode() );
		System.out.println( dao4.hashCode() );

	} // main

} // class

// 싱글톤 패턴 - DAO 
// 2. Lazy Initialization (지연 초기화)  멀티스레드 안전 X
// 3. Thread-safe Singleton
class BoardDAO{
	
	private static volatile BoardDAO boardDAO = null;
	
	// 외부에서 객체 생성 X
	private BoardDAO() {}
	
	/*
	public static synchronized  BoardDAO getInstance() {
        if (boardDAO == null) {
        	boardDAO = new BoardDAO();
        }
        return boardDAO;
    }
    */
	
	// Double-Checked Locking (이중 확인 잠금)
	public static BoardDAO getInstance() {
        if (boardDAO == null) {
        	synchronized (BoardDAO.class) {
        		boardDAO = new BoardDAO();
        	}
        }
        return boardDAO;
    }
	
}

 






