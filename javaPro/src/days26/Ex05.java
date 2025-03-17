package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author 김예지
 * @date 2025. 3. 11.
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		
		// String parent = "C:\\temp\\";
		String parent = ".\\src\\days26\\temps\\";
		LocalDate now = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd(E)");
		String strNow = now.format(dtf);
		parent += strNow;
		
		String fileName = ".\\src\\days26\\1차_조편성.txt";
		String pathname = "";
		
		try (FileReader reader = new FileReader(fileName);
			 BufferedReader br = new BufferedReader(reader)) {
			
			String line = null;
			while ((line = br.readLine())!=null) {
				String[] arr = line.split("\\s*[,:-]\\s*");
				File f = null;
				for (int i = 1; i < arr.length-1; i++) {
					pathname = String.format("%s\\%s(%s)\\%s", parent, arr[0], arr[arr.length-1].trim(), arr[i]);
					f = new File(pathname);
					f.mkdirs();
				} // for i
				
			} // while
			
		} catch (Exception e) {
			// TODO: handle exception
		} // try~catch
		
		
		/*
		
		
		// 날짜별 폴더를 생성하고자 하는 위치
		String parent = "C:\\temps";
		// String parent = ".\\src\\days26\\temps";
		
		// 조별 정보 저장할 변수
		String groupIndex = null;
		String groupName = null;
		String[] members = null;
		
		// 날짜 형식 지정해서 변수 처리
		String date = DateTimeFormatter.ofPattern("yyyy-MM-dd(E)").format(LocalDate.now());
		
		// 조편성 파일 불러와서 정보 저장하기
		String line = null;
		try (FileReader reader = new FileReader(".\\src\\days26\\1차_조편성.txt");
			 BufferedReader br = new BufferedReader(reader);) {
			
			String regex = "\\s*:\\s*|\\s*,\\s*|\\s*-\\s*";
			while ((line = br.readLine())!=null) {
				String[] infos = line.split(regex);
				groupIndex = infos[0];
				members = new String[infos.length-2];
				for (int i = 1; i < infos.length-1; i++) {
					members[i-1] = infos[i];
				} // for i
				groupName = infos[infos.length-1].trim();
				
				// 날짜별, 조별, 조원별 폴더 생성
				for (int i = 0; i < members.length; i++) {
					File teamMembers = new File(parent + "\\" + date + "\\" + groupIndex+"("+groupName+")" + "\\" + members[i]);
					teamMembers.mkdirs();
				} // for i
				
			} // while
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
		
		
		*/
		
	} // main
	
} // class
