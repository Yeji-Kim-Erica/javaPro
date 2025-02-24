package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content 클래스 변수의 초기화 순서: 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭
 			인스턴스 변수의 초기화 순서: 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자
 			
 			공장에서 제품을 생산할 때 제품마다 생산일련번호(serial no)를 부여
 			인스턴스마다 고유한 일련번호를 부여...
 */
public class Ex05_02 {

	public static void main(String[] args) {
		
		Document doc1 = new Document();
		Document doc2 = new Document();
		Document doc3 = new Document("자바문서.txt");
		Document doc4 = new Document();
		Document doc5 = new Document();
		
	} // main
	
} // main class

class Document{
	String fileName;
	static int count = 1;
	
	{ // 인스턴스 초기화 블럭: 생성자보다 먼저 호출됨.
		count++;
	}
	/*
	 	문서 "Noname1"가 생성되었습니다.
		문서 "Noname2"가 생성되었습니다.
		문서 "자바문서.txt"가 생성되었습니다.
		문서 "Noname4"가 생성되었습니다.
		문서 "Noname5"가 생성되었습니다.
	 */
	// static { count++ } 안되는 이유: 클래스 초기화 블럭은 한번만 호출되므로 적합하지 않음
	
	public Document() {
		// count++;
		this(String.format("Noname%d", count));
	}
	
	public Document(String fileName) {
		// count++;
		this.fileName = fileName;
		System.out.printf("문서 \"%s\"가 생성되었습니다.\n", this.fileName);
	}
} // Document class



