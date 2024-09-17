package com.date.time.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo_old {
	public static void main(String[] args) throws ParseException {
		Date d1 = new Date();
		System.out.println(d1);
		
		//converting Date to String
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String format1 = sdf1.format(d1);
		System.out.println(format1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
		String format2 = sdf2.format(d1);
		System.out.println(format2);
		
		//converting String to date
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
		Date parsedDate = sdf3.parse("29/11/2023");
		System.out.println(parsedDate);
	}
	

}
