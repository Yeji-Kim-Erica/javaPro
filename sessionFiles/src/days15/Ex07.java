package days15;

/**
 * @author kenik
 * @date 2025. 2. 21. - 오후 4:31:54
 * @subject  [ static 키워드 설명 ] p 247
 * @content
 *     기업은행 : 이자율 동일한 보통예금(적금)
 *     저축 관련된 클래스 선언  : Save 클래스 선언  
 */
public class Ex07 {

	public static void main(String[] args) {
//		객체명.인스턴스변수
//		객체명.인스턴스메서드()		
		
//		클래스명.클래스멤버(필드,메소드);
		// The field Save.rate [is not visible]
		// Save.rate = 0.08;
		
		

		// 5:01 수업 시작~
		//                                  이자율
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
		// 클래스 배열  Alt + Shift + A
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

		// [3] 클래스 배열 초기화.
	 
		Save [] sArr = {
								new Save("권태정", 10000, 0.04), 
								new Save("김가은", 23000, 0.04),
								new Save("김도훈", 3300, 0.04),
								new Save("김민선", 100000, 0.04),
								new Save("김승효", 100500, 0.04)
						};
		
		//Save.setRate(0.08);
		sArr[0].setRate(0.06);
		System.out.println( Save.getRate() );
		
		for (Save s : sArr) {
			s.printSave();
		}
	 
		
		/*
		  수백만명이 Save 예금 들고 있다.. (가정) 
          [0x1][0x2][0x3][0x4][0x5]                    [ 0x100 ]
          0x100                                       sArr 
          
          ["권태정"][10000] 
          0x1
          
          ["권태정", 10000] 
          0x2
          
          ["권태정", 10000]               [0.04] 클래스 1개 생성
          0x3
          
          ["권태정", 10000] 
          0x4
          
          ["권태정", 10000] 
          0x5


		 * */

	} // main

} // class



