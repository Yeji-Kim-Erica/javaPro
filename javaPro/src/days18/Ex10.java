package days18;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject Chapter 12: Object 클래스 설명
 * @content				  ㄴ 모든 클래스의 최상위 부모클래스
 */
public class Ex10 {

	public static void main(String[] args) {
		/* [1] hashCode() 메서드
		Value v1 = new Value(10);
		int hashCode = v1.hashCode(); // 객체 자신의 고유한 해시코드값
		System.out.println(hashCode); // 985922955
		
		Value v2 = new Value(10);
		hashCode = v2.hashCode(); // 객체 자신의 고유한 해시코드값
		System.out.println(hashCode); // 1435804085
		
		Value v3 = v1; // (복사)
		hashCode = v3.hashCode(); // 객체 자신의 고유한 해시코드값
		System.out.println(hashCode); // 985922955
		*/
		
		/* [2] getClass() 메서드
		Value v1 = new Value(10);
		Class cls = v1.getClass(); // 객체의 클래스 정보를 [C]lass 반환하는 메서드
		String fullname = cls.getName();
		// 풀네임(Full name) = 패키지명.클래스명
		System.out.println(fullname); // days18.Value
		// 메서드, 생성자, 필드 등 모든 클래스 정보를 얻어올 때 사용하는 메서드
		
		[3] toString() 메서드
		v1.toString(); // 객체 자신의 정보를 문자열로 반환하는 메서드
		System.out.println(v1.toString()); // days18.Value@3ac3fd8b
		System.out.println(v1); // days18.Value@3ac3fd8b
		// toString()을 생략해도 된다. (v1과 v1.toString()은 같은 의미다)
		
		System.out.printf("%s@%x", cls.getName(), v1.hashCode()); // days18.Value@3ac3fd8b
		// 즉, toString()이 돌려주는 정보는
		// fullName@16진수hasCode값		이다.
		*/
		
		// [4] equals()
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		// v1, v2 객체가 같냐고 묻기
		System.out.println(v1 == v2); // false
		
		// v1, v3 객체가 같냐고 묻기
		Value v3 = v1; // 객체 복사 (copy)
		System.out.println(v1 == v3); // true
		
		// [4-1] Object.equals() 메서드를 오버라이딩(재정의)하지 않으면 == 연산자와 동일한 기능을 가진다
//		System.out.println(v1.equals(v2)); // false
//		System.out.println(v1.equals(v3)); // true
		// ↑ 오버라이딩 하기 전 결과들
		
		// [4-2] 오버라이딩: int value 필드. 필드값이 같으면 같은 객체이다. 라고 재정의하기
		System.out.println(v1.equals(v2)); // true
		System.out.println(v1.equals(v3)); // true
		
		System.out.println(v1.toString()); // [value=10]
		System.out.println(v1); // [value=10]
		
	} // main
	
} // class

class Value extends Object{
	// v1.equals(v2)
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Value && obj != null) {
			Value v = (Value) obj; // 다운캐스팅
			return v.value == this.value;
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("[value=%d]", this.value);
	}

	// 필드
	int value;
	
	// 생성자
	public Value(int value) {
		this.value = value;
	}
	
	// 메서드
	
	
} // Value class