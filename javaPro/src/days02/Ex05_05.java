package days02;

public class Ex05_05 {
	public static void main(String[] args) {
		
		// 실수 : float(4바이트), double(8)
		
		// float avg = 78.99; 에러메시지
		// Type mismatch: cannot convert from double to float
		float i = 78.99F; // 리터럴 + 접미사 (=F;)
		float k = 0; // 오류 없음. 왜? 아직 몰라~
		// float k = 0.; 오류남. 왜? .만 붙어도 double로 인지되기 때문.
		float j = 0f; // 실수형 0. 실수형 0과 정수형 0은 다름.
		
		// int i = 10L; 에러메시지
		// Type mismatch: cannot convert from long to int
		
		// f,F 접미사 : float
		// l,L 접미사 : long
		// d, D 접미사 : double
	}
}
