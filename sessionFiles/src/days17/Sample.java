package days17;

public interface Sample {
	
	// 1.  모든 (변수 X, 상수)만 선언 + public static final 생략.
	public static final int MAX_VALUE = 100;
	int MIN_VALUE = 1;  // public static final  생략된 경우

	// 2.모든 메소드가 추상메소드이다.
	public abstract void test();
	int disp(int a, int b); // public abstract  생략된 경우
	
	// 3. jdk1.8  static메소드, default메소드를 추가할 수 있다.
	
}
