package days15;

/**
 * @author kenik
 * @date 2025. 2. 21. - 오후 3:34:17
 * @subject 
 * @content
 *       3) 단독(홀로) 사용될 때의 this 용도
		 *      - 매개변수  Ex06_02.java 
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		// new Calc().btnExec.btnExec_click();
		
		Calc calc = new Calc();
		calc.btnExec.btnExec_click();

	}

}

// 계산기
class Calc{
	
	// Button [] btns = null;
	Button btnExec = null;
	
	// 디폴트 생성자
	public Calc() {
		init(); // 계산기 초기화하는 메서드를 호출
	}

	private void init() {
		// this [1 용도]
		//                                 this [3 용도]
		this.btnExec = new Button("[ = ]", this);
	}
	
	public void execDisp(String result) {
		System.out.printf("[화면결과 출력] %s\n", result);
	}
	
}

// 버튼
class Button{
	
	String text ; //  [ = ]
	Calc calc;
	
	public Button() { 
		
	}
	
	public Button(String text) {
		// this [1 용도]
		this.text = text;
		//
		//
		//
		
	}
	
	public Button(String text, Calc calc) { 
		// this [2 용도]
		this(text);
		this.calc = calc;
	}

	// 계산버튼을 클릭-> 클릭 이벤트 발생 -> btnExec_click() 메서드 
	public void btnExec_click() {
		// 계산기 접근할 수 있어야 된다. 
		// 3 + 5 = 8
		// 
		String result = "3 + 5 = 8";
		this.calc.execDisp(result);
	}
	
}
