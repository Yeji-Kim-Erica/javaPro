package days17;

public interface Sample {

	// 필드 선언 불가
	// 1. 변수 X, 상수만 선언 가능 + public static final 생략
	public static final int MAX_VALUE = 100;
	int MIN_VALUE = 1; //public static final이 생략된 경우
	
	// 2. 모든 메서드가 추상메서드
	public abstract void test();
	int disp(int a, int b); // public abstract
	
	// 3. jdk1.8  static메소드, default메소드를 추가할 수 있다.
}
