package days15;

/**
 * @author 김예지
 * @date 2025. 2. 21.
 * @subject
 * @content [3] this가 단독으로(홀로) 사용될 때 this의 용도: 매개변수
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		// new Calc().btnExec.btnExec_click();
		Calc calc = new Calc();
		calc.btnExec.btnExec_click();
		
	} // main
	
}

// 계산기
class Calc{
	
	// Button [] btns = null;
	Button btnExec = null;
	
	// 디폴트 생성자
	public Calc() {
		init(); // 계산기를 초기화하는 메소드를 호출
	}

	private void init() { 
		// this [용도 1]
//		this.btnExec = new Button("[=]"); // 계산기가 실행되는 순간 버튼들도 생성될 수 있도록 하기 위한 메소드.
		this.btnExec = new Button("[=]", this);// this [용도 3] -> 버튼을 누르면 결과가 실행되어 Calc에 나와야하기 때문에 둘을 연결해준 것.
		
	}
	
	public void execDisp(String result) {
		 System.out.printf("[화면결과 출력] %s\n", result);
	}
	
}

// 버튼
class Button{
	
	String text; // +, -, = 등등 표시를 가지는 필드
	Calc calc;

	// 디폴트 생성자
	public Button() {
	}

	public Button(String text) {
		// this [용도 1]
		this.text = text;
	}
	
	public Button(String text, Calc calc) {
		// this [용도 2]
		this(text);
		this.calc = calc;
	}

	// 실제 계산기의 계산 버튼을 클릭 -> 클릭 이벤트 발생 -> btnExec_click() 메서드
	public void btnExec_click() {
		// 계산기에 접근할 수 있어야 함.
		// 3 + 5 = 8
		
		String result = "3 + 5 = 8";
		this.calc.execDisp(result);
	}

	
	
}