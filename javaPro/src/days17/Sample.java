package days17;

public interface Sample {

	// 필드 선언 불가
	// 1. 변수 X, 상수만 선언 가능 + public static final 생략
//	public static final int MAX_VALUE = 100;
	int MAX_VALUE = 1; //public static final이 생략된 경우
	
	// 2. 모든 메서드가 추상메서드
	public abstract void test();
	int disp(int a, int b); // public abstract
	
	// 잠들어서 놓친 거 없는지 확인
}
