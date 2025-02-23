
package days14;

/**
 * @author 김예지
 * @date 2025. 2. 20.
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		int[] m = new int[3];
		// m: 지역변수, 참조변수, 배열명. 참조할 주소값을 저장할 변수. 주소값을 저장할 기억공간이 만들어짐.
		
		// 변수 선언 형식
		// 자료형 변수명 [=초기값];
		Car myCar; // int[] m과 같은 역할.
		// Car는 클래스로, 참조타입자료형에 속하므로 자료형에 쓸 수 있다.
		// myCar: 지역변수, 참조변수이자 객체. 객체명.
		new Car(); // new int[3] 과 같은 역할. 값을 저장할 기억공간이 만들어짐. 인스턴스 생성.
		
		// 클래스: 객체를 생성하기 위한 설계도
		// 객체: 클래스를 자료형으로 선언된 참조변수
		// 인스턴스: new 연산자로 인해 클래스의 객체가 실제 heap 영역에 생성된 것
		myCar = new Car();
		
		// 객체명.필드명;
		// 객체명.메소드명();
		myCar.name = "K9";
		myCar.dispCarInfo();
		
		// 초기화 안하면 (new 연산자로 인스턴스화를 안하면) myCar의 기본값은 null이 됨. (참조하는 주소가 X)
		// Car myCar = null; (자동으로 초기화하도록 선택하면 이런 코드가 뜸)
		// NullPointerException
		
		
		/*                                          Car 클래스
		 * 
		 *                                          [0x100]
		 *   인스턴스                                 myCar
		 *   [name][speed][wc][메주소]                변수
		 *   0x100                                   지역변수
		 *                                           참조변수
		 *                                           객체명
		 *                                          
		 *                                          
		 *               [dispCarInto()]
		 *               주소                            
		 * */
		
		
		
		
	} // main
	
} // class
