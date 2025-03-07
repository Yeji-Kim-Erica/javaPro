package days24;

/**
 * @author 김예지
 * @date 2025. 3. 7.
 * @subject 자바에서 입출력
 * @content		   Input Output
 					ㄴ 줄여서 IO
 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		 [용어정리]
		 1. 자바의 IO (입출력)
		 자바를 이용해 컴퓨터 내부에서 프로그램을 하나 실행한다고 생각해보자.
		 
		 <컴퓨터 내부 프로그램>					<외부 장치 (프로그램)>
		 						-출력->
		 						 송신			  모니터
		 						Output
		 						 
		 					   <-입력-
		 					     수신			  키보드
		 					    Input
		 					    
		 2. 자바의 모든 입출력은 스트림(Stream)이라는 개념으로 이루어진다.
		 
		 3. 자바 스트림(Stream)
		 - Stream의 사전적 정의: 흐르는 물
		 - Stream을 비유적으로 설명하자면? 빨대 같은 것 (음료: 데이터, 빨대: Stream)
		 	ㄴ 빨대는 단방향 (입력은 입력만, 출력은 출력만)
		 		1) 입력스트림 (= 읽기)
		 		2) 출력스트림 (= 쓰기)
		 
		 4. 자바 스트림의 종류 2가지 (용도에 따라 분류)
		 	1) 문자(텍스트) 스트림
		 		Reader 최상위 부모클래스
		 		Writer 최상위 부모클래스
		 		
		 		ex: FileReader, FileWriter, BufferedReader, BufferedWriter
		 		-> Reader/Writer로 끝나면 문자를 다루는 Stream
		 		
		 		1문자(== char == 유니코드 2바이트) 단위로 처리
		 		하지만 처리할 때는 int로 한다 (int 연산 속도가 더 빨라서인듯? 아닌가)
		 		
		 		전송되는 데이터의 단위는 한 문자, 문자열, 문자 배열 .. 다 가능
		 		
		 	2) 바이트(이진) 스트림
		 		InputStream 최상위 부모클래스
		 		OutputStream 최상위 부모클래스
		 		
		 		ex: FileInputStream, FileOutputStream, BufferedInputStream, 
		 		-> Input/OutStream으로 끝나면 바이트 값을 다루는 Stream
		 		
		 		0 과 1의 1비트 단위로 처리하지 않는다.
		 		1바이트(8비트)를 최소 단위로 처리함
		 		한 바이트, 바이트 배열, 정수(int)(= 이진값)
		 
		 5. 보조스트림: 어떤 스트림의 입출력이 더 쉬워지도록 보조 역할을 하는 Stream
		 	- 문자 보조스트림
		 		- 입력 담당 보조스트림
		 		- 출력 보조스트림
		 	- 바이트 보조스트림
		 		- 입력 담당 보조스트림
		 		- 출력 보조스트림
		 
		 */
		
		
	} // main
	
} // class
