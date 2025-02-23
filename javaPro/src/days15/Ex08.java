package days15;

/**
 * @author 김예지
 * @date 2025. 2. 21.
 * @subject
 * @content java.exe로 Ex08을 실행 -> main(){}
 */
public class Ex08 {

	// static이 붙어있기 때문에, 객체가 아직 생성되지 않았지만 main 메서드를 바로 실행할 수 있음.
	public static void main(String[] args) {
		// Ex08 obj = new Ex08();
		// obj.disp();
		
		// 클래스명.static메소드명();
		// Ex08.disp();
		
		// 하지만 같은 클래스 내에서 사용하는 것이기 때문에,
		disp(); // 이렇게만 써도 사용 가능. disp()는 스태틱 메소드이기 때문에 객체 생성 없이 사용 가능
		
//		Math mobj = new Math();
//		mobj.max(2, 3);
		// ↑ Math의 max 메소드가 static 메소드가 아니었다면, 이렇게 써야 했을 것 (객체 생성 후 사용)
		
		// 빨간색 s가 뜨는 건 다 static 메소드
		Math.max(2, 3);
		Math.abs(-10);
		Math.pow(2, 3);
		
	} // main

	private static void disp() {
		System.out.println();
	}
	
} // class
