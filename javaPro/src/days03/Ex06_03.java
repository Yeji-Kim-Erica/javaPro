package days03;

/**
 * @author yejikim
 * @date 2025. 2. 5. - 오후 2:45:04
 * @subject
 * @content
 */
public class Ex06_03 {
	
	public static void main(String[] args) {
		
		// 자동형변환: 작은 자료형이 큰 자료형에 할당될 때는 자동으로 형변환된다.
		// 자동형변환 경우 2가지
		// 1) 작은 자료형(예시: int)이 큰 자료형(예시: long)으로 할당될 때는 자동으로 형변환된다.
		int i = 100;
		long l = i;
		// 2) 작은 자료형과 큰 자료형을 함께 연산하면 자동으로 큰 자료형으로 형변환된다.
		double j = 100 + 3D; // 접미사 d 또는 D는 double을 말함.
		
		// Ex06_02 참고
		// tot = kor + eng + mat;
		// Type mismatch: cannot convert from int to short
		// 어라 왜 바이트끼리 더했는데 int가 결과값으로 나오지?
		// 컴퓨터 내부에서 연산할 때는 연산 속도가 int로 하는 것이 더 빨라서 int로 연산함. -> 결과값을 int로 돌려줌.
		// 같은 이유로 tot = (short) kor + eng + mat;도 오류가 남. int > short기 때문에. (나머지 eng + mat가 int임)
		// avg = (double) tot / 3; 도 주의해야 함.
		// avg = tot / 3; 이렇게 쓰면 int > short 라서 tot / 3 값(몫)은 소수점뒤가 0인 정수가 나와버림. (원래의 33이 버려짐)
		// 같은 이유로 avg = (double) (tot / 3); 도 안됨 tot / 3이 먼저 연산되면 이미 소수점 뒤가 버려지고 난 후 double이 되기 때문.
		
		// int j = 0L; -> 오류 발생 : 우측항의 자료형이 더 큼 (long형 0)
		// Type mismatch: cannot convert from long to int
		// 이때 강제형변환이 필요함
		
		// 예를 들어, (3 + 5) * 2 라는 식이 있으면 우리는 괄호 안의 계산을 먼저함.
		// ㄴ 이때 이 식에서는 () -> * 보다 우선되는 연산자임
		// 강제형변환의 CAST 연산자가 이와 비슷하게 작동한다고 생각하기 (우선 연산됨)
		
		// 강제형변환
		// () : CAST 연산자
		// CAST는 숫자타입 자료형끼리만 변환이 가능함
		int k = (int)0L;
		
		// 
		
	}
	
}
