package days14;

/**
 * @author 김예지
 * @date 2025. 2. 20.
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// 시간정보(시간, 분, 초)를 저장하려고 한다.
		int hour, minute, second;
		
		// 5개의 시간 정보를 저장하려고 할 때
		
		// [1번째 방법]
		int hour1, minute1, second1;
		int hour2, minute2, second2;
		int hour3, minute3, second3;
		int hour4, minute4, second4;
		int hour5, minute5, second5;
		
		// [2번째 방법]
		int[] hourArr = new int[5];
		int[] minuteArr = new int[5];
		int[] secondArr = new int[5];
		
		// [3번째 방법] 클래스 선언 - Time -> 클래스 배열 이용
		Time[] timeArr = new Time[5];
		
		/*
		 [멤버(필드, 메소드) 앞에 붙는 접근지정자 설명]
		 1. public: 패키지 내/외부 어디서나 접근(참조) 가능
		 2. protected: default 기능 + 상속 (패키지 외부에서 자식 클래스에 접근 가능)
		 3. default(package): 패키지 내부에서만 접근(참조) 가능
		 4. private: 같은 클래스 내에서만 접근(참조) 가능
		 
		 접근가능범위
		 public > protected > default > private
		 
		 */
		
	} // main
	
} // class
