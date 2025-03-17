package days25;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject SequenceInputStream
 * @content 순차적인 + 바이트스트림(입력용)
 				ㄴ 여러 개의 입력 스트림을 연속적으로 연결해서 하나의 스트림으로 데이터를 처리할 수 있는 바이트 스트림
 				예) 용량이 큰 파일을 여러 개의 작은 파일로 분리해서 생성 후 하나의 스트림으로 처리하고자 할 때 -> 하나의 용량이 큰 파일로 변환하려고 할 때
 */
public class Ex08 {

	public static void main(String[] args) throws IOException {
		byte[] n = {1,2,3};
		byte[] m = {4,5,6};
		byte[] k = {7,8,9};
		// 각각의 byte[] -> 메모리스트림 3개로 생성
		// -> 읽기 -> SequenceInputStream 1개 -> 처리
		ByteArrayInputStream baisN = new ByteArrayInputStream(n);
		ByteArrayInputStream baisM = new ByteArrayInputStream(m);
		ByteArrayInputStream baisK = new ByteArrayInputStream(k);
		
		/* [1]
		SequenceInputStream sis1 = new SequenceInputStream(baisN, baisM);
		SequenceInputStream sis2 = new SequenceInputStream(sis1, baisK);
		*/
		
		
		Vector<ByteArrayInputStream> v = new Vector<ByteArrayInputStream>();
		v.add(baisN);
		v.add(baisM);
		v.add(baisK);
		Enumeration<ByteArrayInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		
		int b;
		while ((b = sis.read())!=-1) {
			System.out.println(b);
		} // while
		
	} // main
	
} // class
