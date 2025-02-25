package days17;

/**
 * @author 김예지
 * @date 2025. 2. 25.
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 * [ final 키워드 설명 ]
		 * 1. 변수 앞에  - 상수
		 *    지역변수
		 *    인스턴스 변수
		 *    클래스 변수
		 *    
		 * 2. 메서드 앞에
		 *    Ex06.java
		 *      ㄴ Parent 클래스 
		 *      ㄴ Child 클래스
		 *      
		 *    오버라이딩을 할 수 없는 마지막(최종) 메서드를 선언할 때 
		 *    final 키워드를 메서드 앞에 붙인다.   
		 * 
		 * 3. 클래스 앞에
		 *    final class SalesMan extends Regular{
		 *    }
		 *    ㄴ 더 이상 자식 클래스를 가질 수 없는 최종(마지막) 클래스이다. 
		 * */

		FinalTest obj = new FinalTest();
		obj.plus(100);
		
	} // main
	
} // class

class FinalTest {
//	public final double PI; // The blank final field PI may not have been initialized
//	public final double PI = 3.141592; // 명시적 초기화
	public final double PI = 3.14;
	
	{
		// The final field FinalTest.PI cannot be assigned
		//PI = 3.141592;  // 인스턴스 초기화 블럭
	}
	
	public FinalTest() {};
	public FinalTest(double pi) {};
	
	public void plus(final int value) { // final이 붙으면 value++; 코드는 사용 불가능 (상수가 돼서)
		// 지역변수 (상수)
		final int MAX_VALUE = value;
	}
	
}

