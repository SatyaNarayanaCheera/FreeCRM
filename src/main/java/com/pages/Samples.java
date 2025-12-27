package com.pages;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Samples {


    // SimpleDateFormat is not thread-safe, so give one to each thread
    private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue()
        {
            return new SimpleDateFormat("yyyyMMdd HHmm");
        }
    };

    public String formatIt(Date date)
    {
        return formatter.get().format(date);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Samples s=new Samples();
		String res=s.formatIt(new Date());
		
		System.out.println("res::"+res);

	}

}
