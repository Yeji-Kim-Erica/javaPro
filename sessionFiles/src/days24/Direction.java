package days24;

public enum Direction {
	// The constructor Direction(int, String) is undefined
	EAST(100, "→"), SOUTH(200, "↓"), WEST(300, "←"), NORTH(400,"↑");

	// 5:02 수업 시작~ 
	// 필드
	private final int value;
	private final String symbol;
	
	// 2 생성자 선언
	Direction(int value, String symbol) { 
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue() {
		return value;
	}

	public String getSymbol() {
		return symbol;
	}
	
	// setter X
	
	// 메서드 선언 가능
	// 추상메서드 선언 가능.
	public String toString() {
		return name()+":" + this.symbol;
	}
}
  