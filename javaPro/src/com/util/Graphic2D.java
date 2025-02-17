package com.util;

public class Graphic2D {

	public static void drawLine() {
		System.out.println("---------");
	}

	public static void drawLine(int length) {
		System.out.println("=".repeat(length));
	}

	public static void drawLine(int length, String style) {
		System.out.println(style.repeat(length));
	}

}
