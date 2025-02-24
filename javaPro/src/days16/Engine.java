package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */

// 엔진 클래스
public class Engine {

	// 필드
	int speed;
	
	
	// 메소드
	void moreFuel(int fuel) {
		this.speed += fuel * 0.05;
	}
	
	void lessFuel(int fuel) {
		this.speed -= fuel * 0.05;
	}
	
	void stop() {
		this.speed = 0;
	}
	
	
} // Engine class
