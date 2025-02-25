package days17;

/**
 * @author 김예지
 * @date 2025. 2. 25.
 * @subject
 * @content
 */
public class K_Engine implements Engine{

	int speed;
	
	@Override
	public void moreFuel(int fuel) {
		this.speed += fuel * 0.15;
	}

	@Override
	public void lessFuel(int fuel) {
		this.speed -= fuel * 0.15;
	}

	@Override
	public void stop() {
		this.speed = 0;
	}

}
