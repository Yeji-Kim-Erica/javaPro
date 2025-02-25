package days17;

/**
 * @author 김예지
 * @date 2025. 2. 25.
 * @subject 인터페이스
 * @content		ㄴ 상수, 추상메소드 선언
 				ㄴ JDK 1.8부터 [default, static 메소드] 추가됨..
 */
public class Ex13 {

	public static void main(String[] args) {
		// html 문서를 구문분석(파싱)을 해서 내가 원하는 내용을 얻어오기
		// 또는
		// xml 문서를 구문분석(파싱)을 해서 내가 원하는 내용을 얻어오기
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

// 2000년도에 A개발자가 이 인터페이스를 선언하고 구현함.
interface Parseable{
	
	// 구문 분석을 하는 추상 메소드 선언
	void parse(String fileName);
	
// void test(); // 새로운 추상 메소드 추가. 그냥 추가하면 이 인터페이스로 구현된 클래스들이 추상클래스로 변하게 됨 (객체 생성 불가)
	static void test() { // 이러면 이제 인터페이스가 바뀌어도 아래의 클래스들이 추상화되지 않음
		System.out.println("20년 후 이 기능 메서드 추가");
	}
	
	default void print() { // default라고 써져있어도 public임. 여기서 default는 메소드의 한 종류임. 기타제어자!
		System.out.println("인쇄 기능이 구현된 메소드 추가");
	}
	
	// static 메소드는 오버라이딩 불가.
	// default 메소드는 다시 구현할 수 있음.
	
}

interface ParseablePlus extends Parseable{
	// 인쇄하는 추상 메소드 선언
	void print();
}

// 2000년도 A개발자
// HTML 문서를 파싱하는 클래스(파서) 선언
class HTMLParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println("HTML 문서 파일을 구문 분석하는 메소드 호출됨...");
	}
}

// 2000년도 A개발자
// XML 문서를 파싱하는 클래스(파서) 선언
class XMLParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println("XML 문서 파일을 구문 분석하는 메소드 호출됨...");
	}
}

// 2020년도 A개발자
// PDF 문서를 파싱하는 클래스(파서) 선언
class PDFParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println("PDF 문서 파일을 구문 분석하는 메소드 호출됨...");
	}
}

// 2023년도 A개발자
// WORD 문서를 파싱하는 클래스(파서) 선언
class WORDParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println("WORD 문서 파일을 구문 분석하는 메소드 호출됨...");
	}
}

// 시간이 지나감에 따라 4개 뿐 아니라 많은 ???? Parser 클래스를 선언해서 사용
// 인터페이스에서 바꾸고 싶은 내용이 생기면 static 메소드와 default 메소드를 이용하면 됨

// ??? Parser 4개 -> 1개의 파서를 찾아서 사용할 수 있도록 관리하는 클래스
// ~~~Manager : 관리자 클래스에 보통 많이 사용

class ParserManager{
	public static Parseable getParser(String docType) {
		Parseable parser = null;
		
		switch (docType) {
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


