package days15;

/**
 * @author 김예지
 * @date 2025. 2. 21.
 * @subject [static 키워드 설명] p.247
 * @content
 			기업은행에 가서 모든 사람이 이자율이 동일한 보통예금(또는 적금)을 든다고 가정하자.
 			저축과 관련된 클래스 선언: Save 클래스 선언
 			-> 왜 static이 들어간 클래스 변수를 선언해야 하고, static 메소드를 선언해야 하는지 이해하기
 			
 */
public class Ex07 {

	public static void main(String[] args) {
		
		// 
		// 클래스명.클래스멤버(필드, 메소드)
		// Save.rate = 0.08; // The field Save.rate is not visible
		Save.setRate(0.08);
		System.out.println(Save.getRate());
		
		Save[] sArr = {
				new Save("권태정", 10000, 0.04),
				new Save("김가은", 23000, 0.04), 
				new Save("김도훈", 3300, 0.04), 
				new Save("김민선", 100000, 0.04),
				new Save("김승효", 100500, 0.04)			
			  };
		
		// Save.setRate(0.08);
		sArr[0].setRate(0.06);
		
		for (Save s : sArr) {
			s.printSave();
		}
		
		/* [1]
		Save s1 = new Save("권태정", 10000, 0.04);
		Save s2 = new Save("김가은", 23000, 0.04);
		Save s3 = new Save("김도훈", 3300, 0.04);
		Save s4 = new Save("김민선", 100000, 0.04);
		Save s5 = new Save("김승효", 100500, 0.04);
		
		s1.printSave();
		s2.printSave();
		s3.printSave();
		s4.printSave();
		s5.printSave();
		*/
		
		// 클래스 배열
		/* [2]
		Save [] sArr = new Save[5];
		sArr[0] = new Save("권태정", 10000, 0.04);
		sArr[1] = new Save("김가은", 23000, 0.04);
		sArr[2] = new Save("김도훈", 3300, 0.04);
		sArr[3] = new Save("김민선", 100000, 0.04);
		sArr[4] = new Save("김승효", 100500, 0.04);
		
		for (int i = 0; i < sArr.length; i++) {
			sArr[i].printSave();
		} // for i
		*/
		
		// 클래스 배열 초기화
		/* [3]
		Save[] sArr = {
				new Save("권태정", 10000, 0.04),
				new Save("김가은", 23000, 0.04), 
				new Save("김도훈", 3300, 0.04), 
				new Save("김민선", 100000, 0.04),
				new Save("김승효", 100500, 0.04)			
			  };
		for (Save s : sArr) {
			s.printSave();
		}
		*/
		
		// 클래스 변수를 선언해야 하는 상황... 예시
		/* 수백만명이 Save 예금을 들고 있다고 가정해보자.
		 0.04라는 이자율은 모든 인스턴스에서 다 똑같은 값이므로
		 굳이 인스턴스에서 그에 해당하는 기억공간을 매번 만들기 보다는
		 [0.04] 클래스를 1개만 생성해서 모든 인스턴스가 같은 값을 가지게 하는 게 효율적
		 
		 [0x1][0x2][0x3][0x4][0x5]					[0x100]
		 0x100						  sArr
		 
		 ["권태정"][10000][0.04]
		 0x1
		 
		 ["김가은"][23000][0.04]
		 0x2
		 
		 ["김도훈"][3300][0.04]
		 0x3
		 
		 ["김민선"][100000][0.04]
		 0x4
		 
		 ["김승효"][100500][0.04]
		 0x5
		 */
		
	} // main
	
}
