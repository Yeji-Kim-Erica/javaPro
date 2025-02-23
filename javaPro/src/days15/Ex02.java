package days15;

/**
 * @author 김예지
 * @date 2025. 2. 21.
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// [JVM(자바 가상 머신)의 메모리 구조]
		// 응용프로그램을 실행하면 JVM이 OS로부터 프로그램을 실행하는 데에 필요한 메모리를 할당받는다.
		/* JVM은 용도에 따라서 정보를 여러 영역으로 나누어서 관리
			1) Method Area
				: 프로그램 실행 시 클래스 파일(.class)을 읽어서
				클래스에 대한 정보를 Method Area에 저장
				  ㄴ 클래스 변수는 Method Area에 정보가 저장됨 (Method Area 영역에 올라감)
			2) Call [Stack] 호출 스택
				: 메소드가 호출할 때 메소드에서 사용할 저장 공간
				  ㄴ 지역변수는 Stack 영역에 저장됨
			
			3) [Heap] (동적 영역)
				: new 연산자에 의해서 저장공간이 생성됨. (ex: new int[3], new Person())
				  ㄴ 객체가 생성될 때 인스턴스(인스턴스 변수)가 heap 영역에 저장됨
		
		 */
		
		// 강사님 자료 보고 추가할 거 있으면 추가하기
		
		
		
	} // main
	
}
