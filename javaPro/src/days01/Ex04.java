package days01; // 관련있는 클래스들끼리 그룹화하기 위해서

/**
 * @author yejikim
 * @date 2025. 2. 3. - 오후 5:24:24
 * @subject
 * @content
 */
public class Ex04 { // 클래스 선언 부분
	
	public static void main(String [] args){
		// [변수와 상수]
		// 기억공간: 값을 저장하기 위한 공간
		// 변수: 변하는 수. 값을 변경할 수 있는 기억공간
		// 상수: 변하지 않는 수 == 고정된 수. 값을 변경할 수 없는 기억공간 (ex: 100, 'A', 3,14 -> 셋 다 리터럴)
		
		// 본인의 이름을 저장할 기억공간을 만들어서 값을 할당하기
		// [자바 변수 선언 형식]
		// [자료형] [변수명] = [초기값];
		String userName;
		userName = "김예지";
		// 문자열 == 문자의 나열 (ex: "김예지" 와 '김' + '예' + '지')
		System.out.println(userName);
		
	} // main

} // class
