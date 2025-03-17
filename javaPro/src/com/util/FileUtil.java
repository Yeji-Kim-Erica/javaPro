package com.util;

import java.io.File;

public class FileUtil {
	
	
	// 파일명 반환 메서드 (매개변수: 파일 객체)
	public static String getFileName( File f) {
	    String fileName = f.getName();
	    return fileName;
	 }
	 
	// 파일명 반환 메서드 (매개변수: 파일 경로)
	 public static String getFileName( String pathname ) {
	    int idx =  pathname.lastIndexOf("\\");
	    String fileName =     pathname.substring(idx+1);      
	    return fileName;
	 }
	 
	 // 확장자 반환 메서드
	 public static String getExtension(String fileName) {
	    int idx = fileName.lastIndexOf(".");
	    String ext =  fileName.substring(idx);
	    return ext;
	 }
	 
	 // 확장자를 제외한 파일명을 반환하는 메서드
	 public static String getBaseName(String fileName) {
	    int idx = fileName.lastIndexOf(".");
	    String baseName =  fileName.substring(0, idx);
	    return baseName;
	 }
}
