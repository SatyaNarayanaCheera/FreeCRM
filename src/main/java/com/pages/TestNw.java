package com.pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestNw {
	
	static {
		System.out.println("static block called first..");
	}
	
	public static void disp() {
		System.out.println("disp()...");
	}
	public static void main(String[] args) {
		TestNw.disp();
	}

	



}
