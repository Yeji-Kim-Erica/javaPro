package days14;

/**
 * @author 김예지
 * @date 2025. 2. 20.
 * @subject 클래스(객체) 배열
 * @content		ㄴ 배열? 동일한 자료형을 가진 자료를 메모리상에 나열하는 것.
 */
public class Ex08_02 {

	public static void main(String[] args) {
		// 클래스(객체) 배열 선언 *** (중요! 프로젝트할 때 참고~)
		// [배열 선언 형식]
		// 자료형 [] 배열명 = new 자료형[배열크기];
		Person [] pArr = new Person[5]; // 객체 생성이 아닌, 배열만 생성한 것.
		// pArr[0], pArr[1], ... 모두 객체의 기본값 null이 들어가 있음.
		
		/*
		 *  
		 *  pArr[0] pArr[1] pArr[2] pArr[3] pArr[4]       변수
		 *  [null]  [null]  [null]  [null]  [null]		[0x100]
		 *  0x100								          pArr
		 *  
		 *  객체 생성이 되지 않은 상태
		 *  
		 *  아직 인스턴스 생성이 되지 않음. 배열만 생성됨.
		 *  
		 */
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i] = new Person(); // 객체 생성
		} // for i
		
		// 5명의 사람(Person)
		pArr[0].name = "권태정";
		pArr[1].name = "김가은";
		pArr[2].name = "김도훈";
		pArr[3].name = "김민선";
		pArr[4].name = "김승효";
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].work();
		} // for i
		
	} // main
	
} // class
