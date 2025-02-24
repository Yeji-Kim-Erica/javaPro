package days16;

/**
 * @author 김예지
 * @date 2025. 2. 24.
 * @subject
 * @content
 */

// 자동차 클래스
public class Car {

	// 필드
	String name;
	String gearType;
	int door;
	// has-a 관계: Car + Engine
	private Engine engine; //  = new Engine(); 명시적 초기화 
							// (보통은 명시적 초기화로 생성 X.)
							// 결합력이 높은 코딩이기 때문에 좋은 코딩이 아님
	
	// 결합력의 높고 낮음을 결정하는 기준
	// 노트북 램 온보드 생각하면 됨.
	// 온보드면 교체 안돼서 불편
	
	// getter, setter
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	// 생성자
	Car() { // 디폴트 생성자
		// this.engine = new Engine(); // 생성자에서 객체 생성 (초기화) -> 결합력이 높기 때문에 좋은 코딩은 아님
	}
	
	Car(Engine engine) {
		this.engine = engine;
	}
	
	// 메소드
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	
	void stop() {
		this.engine.stop();
	}
	
} // Car class
