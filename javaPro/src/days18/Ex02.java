package days18;

/**
 * @author 김예지
 * @date 2025. 2. 26.
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		Ex00 obj = new Ex00();
		obj.aaa();
		obj.bbb();
		obj.ccc();
		*/
		
		// 인터페이스에 업캐스팅
		/*
		IC obj = new Ex00();
		obj.aaa();
		obj.bbb();
		obj.ccc();
		*/
		
		// 부모 인터페이스에도 업캐스팅이 가능
		IA obj = new Ex00();
		obj.aaa();
		// obj.bbb(); X
		// obj.ccc(); X
		
		
		
	} // main
	
} // Ex02 class

interface IA{
	void aaa();
}
interface IB{
	void bbb();
}
// 인터페이스끼리 상속할 때 사용하는 키워드: extends
interface IC extends IA, IB{
	// void aaa();
	// void bbb();
	void ccc();
}

// class Ex00 implements IA, IB{
class Ex00 implements IC{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}
	
}


