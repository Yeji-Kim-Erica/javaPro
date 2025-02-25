package days17;

/**
 * @author kenik
 * @date 2025. 2. 25. - 오후 12:41:27
 * @subject  [추상화]
 * @content    ㄴ abstract 키워드
 *             ㄴ 추상 메소드, 추상 클래스
 *             
 *            - [ 추상클래스 ]
 *               ㄴ 공통적인 부분(멤버)만을 미리 선언한 클래스
 *               ㄴ  getPay() 메소드 처럼.. 오버라이딩
 *                  추상메소드 선언  
 */
public class Ex08 {

	public static void main(String[] args) {
		// 추상 클래스도 일종의 클래스 이다.
		// 추상 클래스에 업캐스팅 가능하다. 
		Player p = new CDPlayer();
		p.play(0);
		p.stop();
	}

}

abstract class Player{

	// 필드
	boolean pause;  // 작동 중지
	int currentPos; // 현재 위치

	// 생성자
	public Player() { }

	// 추상 메서드 선언
	abstract void play(int pos);
	abstract void stop();
}

abstract class AudioPlayer extends Player{

	@Override
	void play(int pos) {
		System.out.println("> 추상 메서드를 오버라이딩 완료!!!");
	}

}

class CDPlayer extends AudioPlayer{

	@Override
	void stop() {
		System.out.println("> 추상 메서드를 오버라이딩 완료!!!");
	}

}



