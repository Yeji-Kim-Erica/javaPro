package days18;

import java.util.Arrays;

import days15.MyPoint;

/**
 * @author kenik
 * @date 2025. 2. 26. - 오후 4:34:24
 * @subject Chapter 12.   Object 클래스 설명
 * @content   ㄴ 모든 클래스의 최상위 부모 클래스
 */
public class Ex10 {

	public static void main(String[] args) {
		/* [1] hashCode()
		Value v1 = new Value(10);
		int hashCode = v1.hashCode(); // 객체 자신의 해시코드값.
		System.out.println( hashCode );
		
		Value v2 = new Value(10);
		hashCode = v2.hashCode(); // 객체 자신의 해시코드값.
		System.out.println( hashCode );
		
		Value v3 = v1;
		hashCode = v3.hashCode(); // 객체 자신의 해시코드값.
		System.out.println( hashCode );
        */
		
		/* [2] getClass()
		Value v1 = new Value(10);
		Class cls = v1.getClass(); // 객체의 클래스 정보를 [C]lass 반환하는 메서드
		String fullName =  cls.getName();
		System.out.println( fullName );  // days18.Value
		// 메서드, 생성자, 필드 등 모든 클래스 정보를 얻어올 때 사용하는 메서드
		
		// [3] toString()
		// 5:05 수업시작~
		// fullName    @16진수 hashCode   => toString()
		// days18.Value@5594a1b5
		System.out.println( v1.toString() ); //  객체 자신의 정보를 문자열으로 반환하는 메서드
		System.out.println( v1 );  // toString() 생략해도 된다. 		
		System.out.printf("%s@%x", cls.getName(), v1.hashCode());
		*/
		
		// [4] equals()
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		// v1,   v2 객체 같냐?
		System.out.println(  v1 == v2 );  // false		
		Value v3 = v1;  // 객체 복사(copy)
		System.out.println(  v1 == v3 );  // true
		// [1] Object.equals() 메서드를 오버라이딩하지 않으면 == 연산자 동일한 기능이다.
		// [2] 오버라이딩  int value 필드    필드값이 같으면 같은 객체이다..true
		System.out.println( v1.equals(v2) );  // false
		System.out.println( v1.equals(v3) );  // true
		
		MyPoint p1 = new MyPoint(1, 2);
		Value v4 = null;
		System.out.println( v1.equals(v4) );  // true
		
		System.out.println( v1.toString());  // [value=10]
		System.out.println( v1 );  // [value=10]

		
//		int [] m = { 1,2,3 } ;
//		System.out.println(  Arrays.toString(m) );
	} // main
	

} // class

class Value { // extends Object
	
	// v1.equals(v2)
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Value && obj != null) {
			Value v = (Value)obj; // 다운캐스팅.
			return v.value == this.value;
		} // if
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
	// 메서드 X
}

  