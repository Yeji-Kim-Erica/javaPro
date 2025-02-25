package days17;

/**
 * @author kenik
 * @date 2025. 2. 25. - 오후 4:09:03
 * @subject  인터페이스  
 * @content    ㄴ 상수, 추상메소드 선언
 *             ㄴ [ jdk 1.8 부터   default, static 메소드 추가.. ]
 */
public class Ex13 {

	public static void main(String[] args) {
		// html 문서를 구문분석(파싱)을 해서 내가 원하는 내용을 얻어오기.
		// 또는
		// xml 문서를 구문분석(파싱)을 해서 내가 원하는 내용을 얻어오기.
		String fileName = "sample.xml"; 
		String docType = "xml";
		// 업캐스팅
		Parseable parser = ParserManager.getParser(docType);
        // 다형성
		parser.parse(fileName);
		parser.print();
		
		System.out.println("end");

	} // main

} // class

// 2000년도 A 개발자
interface Parseable{
	
	// 구문분석을 하는  추상 메소드 선언
	void parse(String fileName);
	
	// void test(); // 새로운 추상 메소드 추가.
	static void test() {
		System.out.println("20년 지난 후에 이 기능 메서드 추가");
	}
	
	// default 메서드 
    default void print() {
    	System.out.println("인쇄 기능 구현된 메소드 추가");
    }
	
}

// 
interface ParseablePlus extends Parseable{
	
	// 인쇄하는 추상 메소드 선언
	void print();
	
}

// 2000년 A 개발자
// HTML문서를 파싱하는 클래스( 파서 ) 선언
class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("HTML 문서 파일을 구분 분석 메서드 호출됨...");
	}
	
}

//2000년 A 개발자
// XML문서를 파싱하는 클래스( 파서 ) 선언
class XMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("XML 문서 파일을 구분 분석 메서드 호출됨...");
	}
	
}

//2020년 A 개발자
// PDF 문서를 파싱하는 클래스( 파서 ) 선언
class PDFParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("PDF 문서 파일을 구분 분석 메서드 호출됨...");
	}
	
}

//2023년 A 개발자
// WORD 문서를 파싱하는 클래스( 파서 ) 선언
class WORDParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("WORD 문서 파일을 구분 분석 메서드 호출됨...");
	}
	
	public void print() {
    	System.out.println("인쇄 기능 구현된 메소드 추가");
    }
}

// 시간이 지남에 따라 4개 뿐만 아니라
// ???Parser 클래스을 선언해서 사용... 

// ???Parser 4개 -> 1개의 파서를 찾아서 사용할 수 있도록 관리하는 클래스
// ~~~Manager
class ParserManager{
	//                                       xml, html, pdf 등등
	public static Parseable getParser(String docType) {
		Parseable parser = null;
		switch ( docType) {
		case "xml":
			parser = new XMLParser();
			break; 
		case "html":
			parser = new HTMLParser();
			break; 
		case "pdf":
			parser = new PDFParser();
			break;
		case "word":
			parser = new WORDParser();
			break; 
		default:
			parser = null;
			break;
		} // switch
		
		return parser;
	}
	
}




