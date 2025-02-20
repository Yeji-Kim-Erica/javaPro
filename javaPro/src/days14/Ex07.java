package days14;

/**
 * @author 김예지
 * @date 2025. 2. 20.
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 클래스 복사 (copy)
		// 클래스 복제 (clone) - 얕은 복제/깊은 복제
		
		/*
		 *  
		 *  인스턴스								  			  객체
		 *  [color][power][channel][메서드주소값]["]["]		[0x100]
		 *  0x100								  			   t1
		 *  
		 *    									  			  객체
		 *  												[0x100]
		 *    									  			   t3
		 *  
		 *  
		 *  인스턴스											  객체
		 *  [color][power][channel][메서드주소값]["]["]		[0x200]
		 *  0x200											   t2
		 *  
		 *  
		 *  	
		 *  메서드들은 한번만 올라감 [power()][channelUp()][channelDown()]
		 */
		
		Tv t1 = new Tv();
		
		// 클래스(객체) 복제(clone)
		Tv t2 = new Tv();
		t2.channel = t1.channel;
		t2.power = t1.power;
		t2.color = t1.color;
		
		// 클래스 복사(copy)
		Tv t3 = t1;
		
		t1.color = "red";
		System.out.println(t1.color); // 결과: red
		System.out.println(t3.color); // 결과: red
		
		objectCopy(t1);
		System.out.println(t1.color); // 결과: blue
		
	} // main

	private static void objectCopy(Tv t) { // Tv t = t1; 클래스 복사
		t.color = "blue";
	}
	
}
