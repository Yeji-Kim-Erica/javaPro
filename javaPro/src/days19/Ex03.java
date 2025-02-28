package days19;

/**
 * @author 김예지
 * @date 2025. 2. 27.
 * @subject 어떤 객체로부터 클래스 정보를 얻어오는 방법 3가지
 * @content				(= Class 객체를 얻어오는 방법)
 */
public class Ex03 {

	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1); // SPADE : 1
		
		/*
		// Class 객체를 얻어오는 방법 [1]: getClass() 메소드
		Class cls = c1.getClass();
		String fullName = cls.getName();
		System.out.println(fullName); // days19.Card
		*/
		
		/*
		// Class 객체를 얻어오는 방법 [2]: 클래스명.class (필드의 static 변수 class)
		// 모든 클래스마다 class라는 이름으로 static 필드가 존재한다.
		Class cls = Card.class;
		// cls를 사용해서 Car 객체(인스턴스)를 생성해보기
		// new Card(); // 기존의 객체 생성 방법
		try {
			Card c2 = (Card) cls.newInstance();
			System.out.println(c2);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		*/
		
		// Class 객체를 얻어오는 방법 [3]: Class.forName()
		String className = "days19.Card";
		try {
			Class c3 = Class.forName(className); // JDBC. 자바와 DB연동 시 사용되는 코딩
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	} // main
	
} // Ex03 class

// final 클래스: 최종클래스 (더 이상 자식 클래스를 가질 수 없음)
// final 메소드: 자식이 재정의 불가한 메소드
// final 필드: 상수
// final 지역변수: (해당 지역 안에서만 사용되는) 상수
final class Card{
	// 필드
	String kind; // 카드 종류
	int num; //		카드 번호
	
	// 생성자
	public Card() {
		this("SPADE", 1);
	}
	public Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	// 메소드
	@Override
	public String toString() {
		return String.format("%s : %d", this.kind, this.num);
	}
	
} // class




