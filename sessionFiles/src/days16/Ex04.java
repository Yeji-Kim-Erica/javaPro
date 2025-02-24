package days16;

/**
 * @author kenik
 * @date 2025. 2. 24. - 오전 11:16:11
 * @subject 
 * @content  java.exe Ex04  C:\\a.txt  D:\\temp\\a.txt   ->   
 *           main() {  프로그램 시작~    매개변수 String 주고...
 *           
 *           } 프로그램 종료
 *           
 *           java.exe  FileCopy  원보파일경로  복사할곳경로
 */
public class Ex04 {

	public static void main(String[] args) {
		
		for (int i = 0; i < args.length ; i++) {
			System.out.printf("args[%d]=%s\n", i, args[i]); 
		} // for i

		System.out.println("end");
	} // main

} // class
