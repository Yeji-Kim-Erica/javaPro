package days18;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject 계산기 연습해보기 (days18.Ex03_04.java 참고)
 * @content days15.Ex06_02.java의 Calc, Button 클래스를 인스턴스 클래스로 선언해서 구현
 */
public class Practice {
	
	public static void main(String[] args) {

		Calc calc = new Calc();
		calc.btnExec.btnExec_click();

	} // main
	
} // Practice class

class Calc { // Calc 클래스
	// Calc 필드
	class Button { // Calc 클래스 안에 Button 인스턴스클래스 선언
		// Button 필드
		String text; // +, -, = 등등

		// Button 생성자
		public Button() { } // 디폴트 생성자

		public Button(String text) {
			this.text = text;
		}

		// Button 메소드
		public void btnExec_click() { // Button의 클릭 메소드
			String result = "3 + 5 = 8";
			Calc.this.execDisp(result);
		}
	} // Button class
	Button btnExec = null;

	// Calc 생성자
	public Calc() { // 디폴트 생성자
		init(); // 계산기 초기화 메소드 호출
	}

	// Calc 메소드
	private void init() { // 계산기를 초기화하는 메소드
		this.btnExec = new Button("[=]");
	}

	public void execDisp(String result) { // 결과를 화면에 출력하는 메소드
		System.out.printf("[화면결과 출력] %s\n", result);
	}

} // Calc 클래스