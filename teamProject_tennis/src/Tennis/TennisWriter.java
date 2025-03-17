package Tennis;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TennisWriter {
	private FileWriter writer;
	private BufferedWriter br;
	private static TennisWriter instance; // 싱글톤 객체
	
	// TennisWriter 클래스를 싱글톤 패턴으로 구현하면, getInstance() 메서드를 통해 하나의 객체만 생성하고
	// 계속 재사용 할 수 있다
	// 파일에 입력할때마다 새로운 TennisWriter를 구현할 필요가 없다는 얘기

	// 파일을 열거나 새로 생성하는 생성자
	public TennisWriter() throws IOException {
		this.writer = new FileWriter(".\\game_log.txt", true);
		this.br = new BufferedWriter(writer);
	}
	
	// 싱글톤 인스턴스를 반환하는 메소드
	public static synchronized TennisWriter getInstance() throws IOException {
		if (instance == null) {
			instance = new TennisWriter();
		}
		return instance;
	}
	
	// 파일을 작성하는 메소드
	public void write(String content) throws IOException {
		br.write(content);
		br.flush();  // 버퍼에 있는 내용을 즉시 파일로 쓴다
	}
	
	// 파일 닫는 메서드
	public void close() throws IOException {
		if (writer != null) {
			writer.close();
		}
		if (br != null) {
			br.close();
		}
    }
}
