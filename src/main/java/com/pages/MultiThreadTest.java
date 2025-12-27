package com.pages;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MultiThreadTest {


	private static final ThreadLocal<SimpleDateFormat> sdf =
		    ThreadLocal.withInitial(() ->
		        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"));

		public static String format(Date date) {
		    return sdf.get().format(date);
		}

		
		public static void main(String[] args) {
			
			  ExecutorService pool = Executors.newFixedThreadPool(10);
			for(int i=0;i<100;i++) {
			
				pool.submit(() -> {
	                String result = sdf.get().format(new Date());
	                System.out.println(result);
	            });
				
	    }
	}
}



