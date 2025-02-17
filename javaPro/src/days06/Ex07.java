package days06;

/**
 * @author yejikim
 * @date 2025. 2. 10. - 오후 2:46:47
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		
		// 순서도
		// https://ko.wikipedia.org/wiki/%EC%88%9C%EC%84%9C%EB%8F%84
		
		// [과제]
		// 1~100 홀수의 합
		// for 순서도 (순환구조 활용)
		// while 순서도
		// 그려서 캡쳐해서 카톡으로 보내기
		
		// ASCII + for문 출력
		// 256가지의 문자
		// 0 ~ 31 : 제어문자 (예: '\n', '\t' 등등)
		// 32 ~ 127 : 일반문자 (대문자는 65~90, 소문자는 97~122, 숫자는 48~57)
		
		for (int i = 0; i < 256; i++) {
			System.out.printf("[%d('%c')]\n", i, (char)i);
		} // for i
		
	} // main
	
}
