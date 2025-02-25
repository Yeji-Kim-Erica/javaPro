package days17;

public class X_Engine implements Engine{
	
	int speed ;

	@Override
	public void moreFuel(int fuel) {
		this.speed += fuel * 0.20;
	}

	@Override
	public void lessFuel(int fuel) {
		this.speed -= fuel * 0.20;
	}

	@Override
	public void stop() {
		this.speed = 0;
	}

}
