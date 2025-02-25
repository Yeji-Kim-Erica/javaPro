package days17;

/**
 * @author 김예지
 * @date 2025. 2. 25.
 * @subject
 * @content
 */

// 자동차 클래스
public class Car {

	// 필드
	String name;
	String gearType;
	int door;
	// 인터페이스
	private Engine engine;
	
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
	}
	
	Car(Engine engine) { // 매개변수 다형성
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
