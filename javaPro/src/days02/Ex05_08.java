package days02;

public class Ex05_08 {
	public static void main(String[] args) {
		
		// 정수가 메모리에 어떻게 저장되고 표현되는지 확인했다. 이제 실수, 문자를 확인해보자!
		
		// [문자 표현 방법]
		// 문자는 유니코드 2바이트로 저장된다.
		// [][][][][][][][] [][][[][][][][]
		char c = 'A'; // 2진수 변환
		// 문자 자체는 2진수로 변환이 불가하기 때문에, 문자에 10진수 숫자를 매치시켜서 그것을 2진수로 변환
		// 'A'는 문자코드표에서 65와 매칭됨.
		// 이러한 문자코드표를 ASCII(아스키, American Standard Code for Information Interchange) 라고 함.
		
		// [실수 표현 방법]은 Ex05_09에서 확인
		
	}
}
