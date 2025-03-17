package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 김예지
 * @date 2025. 3. 10.
 * @subject 읽기 작업
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {

		// 강사님 자료에서 추가해오기
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		boolean gender;

		String fileName = "student.txt";

		try (FileReader reader = new FileReader(fileName);
			 BufferedReader br = new BufferedReader(reader)) {

			String line = null;
			String pattern = "([가-힣]{2,}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3}),([0-9.]{4,7}),(true|false)";

			while ((line = br.readLine()) != null) {

				Pattern p = Pattern.compile(pattern);
				Matcher m = p.matcher(line);
				
				while (m.find()) {
					name = m.group(1);
					kor = Integer.parseInt(m.group(2));
					eng = Integer.parseInt(m.group(3));
					mat = Integer.parseInt(m.group(4));
					tot = Integer.parseInt(m.group(5));
					avg = Double.parseDouble(m.group(6));
					gender = Boolean.parseBoolean(m.group(7));
					System.out.printf("%s,%d,%d,%d,%d,%f,%b\n", name, kor, eng, mat, tot, avg, gender);
					
				} // while
				
			} // while

		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch
		
		/* [1]
		while (  ( line = br.readLine() ) != null ) {
			String [] datas = line.split(",");
			name = datas[0];
			kor = Integer.parseInt( datas[1] );
			eng = Integer.parseInt( datas[2] );
			mat = Integer.parseInt( datas[3] );
			tot = Integer.parseInt( datas[4] );
			avg = Double.parseDouble( datas[5]);
			gender = Boolean.parseBoolean(datas[6]);
			System.out.printf("%s,%d,%d,%d,%d,%f,%b\n"
					, name, kor, eng, mat, tot, avg, gender);
		} // while 
		 */

		// [3]
		// [MessageFormat 형식화 클래스 사용] 
		/*
		String pattern = "{0},{1},{2},{3},{4},{5},{6}";
		MessageFormat mf = new MessageFormat(pattern);
		Object [] datas = mf.parse(line);

		// Object [] --> stream --> String [] 변환
		String [] s = Arrays.asList(datas).toArray(new String[datas.length]);

		name =   s[0]; 
		kor = Integer.parseInt( s[1] );
		eng = Integer.parseInt( s[2] );  // 예외발생
		mat = Integer.parseInt( s[3] ); // "null"

		avg = Double.parseDouble( s[5] ); 
		gender = Boolean.parseBoolean( s[6] );
		*/

		System.out.println("end");

	} // main

}
// class
