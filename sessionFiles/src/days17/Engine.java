package days17;

// 엔진 인터페이스
public interface Engine {
		
	// 모두가 추상 메서드이다.
	public abstract void moreFuel(int fuel);	
	void lessFuel(int fuel);	
	void stop() ;

}
