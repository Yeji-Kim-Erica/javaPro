package days17;

// 자동차 클래스 
public class Car {
	
	// 필드
	String name;
	String gearType;
	int door;
	//     인터페이스
	private Engine engine = null;
    
    // getter, setter
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	// 디폴트 생성자
    Car(){    	
    }
    // 1 생성자
    Car(Engine engine){  // 매개변수 다형성
    	this.engine = engine;
    }
	// 메서드
    void speedUp( int fuel) {
    	this.engine.moreFuel(fuel);
    }
    void speedDown(int fule) {
    	this.engine.lessFuel(fule);
    }
    void stop() {
    	this.engine.stop();
    }

} // class
