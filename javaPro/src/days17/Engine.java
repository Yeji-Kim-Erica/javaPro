package days17;

/**
 * @author 김예지
 * @date 2025. 2. 25.
 * @subject
 * @content
 */

// 엔진 인터페이스
public interface Engine {
	
	// 모두가 추상 메소드이다
	public abstract void moreFuel(int fuel);
	void lessFuel(int fuel);
	void stop();
	
	
} // Engine interface