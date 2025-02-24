package days16;

// 자동차 클래스 
public class Car {
	
	// 필드
	String name;
	String gearType;
	int door;
	// has-a 관계 : Car + Engine
	//                      결합력 높은 코딩 , 좋은 코딩X
    // private Engine engine = new Engine(); // 명시적 초기화 X
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
    	this.engine = new Engine(); // 생성자 초기화 X
    }
    // 1 생성자
    Car(Engine engine){
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
