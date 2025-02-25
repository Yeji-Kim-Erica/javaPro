package days17;

/**
 * @author 김예지
 * @date 2025. 2. 25.
 * @subject 클래스를 설계할 때
 * @content 추상화 작업을 언제/어떻게 하는가? 에 대한 예제
 */
public class Ex09_02 {

	public static void main(String[] args) {
		// 추상화 작업
		//	ㄴ 공통된 부분을 따로 빼는 것
		//  ㄴ 유닛: 탱크, 마린, 수송선
		
		
	} // main
	
}

//abstract class Unit{
//	int x, y; // 현재 위치
//	abstract void move(int x, int y);
//	abstract void stop();
//}
//
//// 해병대원
//class Marine extends Unit{
//	
//	void stimPack() {
//		//
//	}
//
//	@Override
//	void move(int x, int y) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	void stop() {
//		// TODO Auto-generated method stub
//		
//	}
//}
//
//// 탱크
//class Tank extends Unit{
//	
//	// 공격 모드를 변환하는 메서드
//	void changeMode() {
//		
//	}
//
//	@Override
//	void move(int x, int y) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	void stop() {
//		// TODO Auto-generated method stub
//		
//	}
//}
//
//// 수송선
//class DropShip extends Unit{
//	
//	// 짐을 올리는 작업
//	void load() {}
//	// 짐을 내리는 작업
//	void unload() {}
//	@Override
//	void move(int x, int y) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	void stop() {
//		// TODO Auto-generated method stub
//		
//	}
//}


