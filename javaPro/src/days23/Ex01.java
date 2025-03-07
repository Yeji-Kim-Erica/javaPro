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
public class Ex01 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days23\\1차_조편성.txt";
		String line = null;

		// Set X
		// List O - ArrayList 컬렉션 클래스
		ArrayList<String> team1 = new ArrayList<>();
		ArrayList<String> team2 = new ArrayList<>();
		ArrayList<String> team3 = new ArrayList<>();
		ArrayList<String> team4 = new ArrayList<>();

		ArrayList<ArrayList<String>> class5 = new ArrayList<>();

		String[] lineArr = null;
		try (FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader);) {
			ArrayList<String> team = null;
			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				lineArr = line.split("[/:]");
				// lineArr = line.split("(/|:)");
				switch (lineArr[0]) // 1조, 2조, ~ 4조
				{
				case "1조":
					team = team1;
					break;
				case "2조":
					team = team2;
					break;
				case "3조":
					team = team3;
					break;
				case "4조":
					team = team4;
					break;
				}

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
		Iterator ir = class5.iterator();
		int no = 1;
		while (ir.hasNext()) {
			System.out.printf("[%d조]\n", no++);
			ArrayList team = (ArrayList) ir.next();
			char seq = 'A';
			Iterator<String> ir2 = team.iterator();
			while (ir2.hasNext()) {
				String name = (String) ir2.next();
				System.out.printf("\t%c. %s\n", seq++, name);
			}
		}
	}

} // class
