package days23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 김예지
 * @date 2025. 3. 6.
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days23\\1차_조편성.txt";
		String line = null;

		ArrayList<ArrayList<String>> class5 = new ArrayList<>();

		String[] lineArr = null;
		ArrayList<String> team = null;
		
		try (FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader);) {
			
			while ((line = br.readLine()) != null) {
				team = new ArrayList<String>();
				lineArr = line.split("[/:]");
				for (int i = 1; i < lineArr.length; i++) {
					team.add(lineArr[i]);
				} // for i

				class5.add(team);

			} // while

			// 각 팀원 출력형식 출력
			// dispTeam(team1, team2, team3, team4);
			dispClass(class5);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		System.out.println("end");
	} // main

	private static void dispClass(ArrayList<ArrayList<String>> class5) {
		Iterator<ArrayList<String>> ir = class5.iterator();
		int no = 1;
		while (ir.hasNext()) {
			System.out.printf("[%d조]\n", no++);
			ArrayList<String> team = ir.next();
			char seq = 'A';
			Iterator<String> ir2 = team.iterator();
			while (ir2.hasNext()) {
				String name = ir2.next();
				System.out.printf("\t%c. %s\n", seq++, name);
			}
		}
	}

} // class
