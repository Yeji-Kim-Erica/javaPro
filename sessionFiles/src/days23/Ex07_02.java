package days23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author kenik
 * @date 2025. 3. 6. - 오후 4:13:31
 * @subject 
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days23\\1차_조편성.txt";
		String line = null;
	
		// 순서 유지 O
		Map<String, ArrayList<String>> class5 = new LinkedHashMap<>();
		
		String [] lineArr = null;
		ArrayList<String> team = null;
		
		try (FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader);	){
			
			while ( (line = br.readLine())!= null) {
				team = new ArrayList<String>(); // 				
				lineArr = line.split("[/:]"); 
				String teamName = lineArr[0]; // 1조, 2조...
				for (int i = 1; i < lineArr.length; i++) {
					team.add( lineArr[i] );
				} // for i
				
				// class5.add(team);
				class5.put(teamName, team);
				
			} // while
			
			// 각 팀원 출력형식 출력 
			dispClass(class5);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("end");
	} // main

	// 반복자 사용해서 출력.
	private static void dispClass(Map<String, ArrayList<String>> class5) {
		
		Set<Entry<String, ArrayList<String>>> es = class5.entrySet();
		Iterator<Entry<String, ArrayList<String>>> ir = es.iterator();
		while (ir.hasNext()) {
			Entry<String, ArrayList<String>> entry =  ir.next();
			String key = entry.getKey();
			System.out.printf("[%s]\n", key);
			ArrayList<String> team = entry.getValue();
			char seq = 'A';
			Iterator<String> ir2 = team.iterator();
			while (ir2.hasNext()) {
				String name = ir2.next();
				System.out.printf("	%c. %s\n", seq++, name);
			} // while
		} // while 
		 
	} 

} // class
  