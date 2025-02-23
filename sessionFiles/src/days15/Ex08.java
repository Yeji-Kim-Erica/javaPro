package days15;

/**
 * @author kenik
 * @date 2025. 2. 21. - 오후 5:27:22
 * @subject 
 * @content    java  Ex08 ->  main(){}
 */
public class Ex08 {

	public static void main(String[] args) {
		// Ex08 obj = new Ex08();
		// obj.disp();
		
		// 클래스명.static메서드명();
		// Ex08.disp();
		disp();
		
//		Math mobj = new Math();
//		mobj.max(2, 3);
		
		Math.max(2, 3);
		Math.abs(-10);
		Math.pow(2, 3);

	} // main
	
	private static void disp() {
		System.out.println("출력 함수...");
	}

} // class
