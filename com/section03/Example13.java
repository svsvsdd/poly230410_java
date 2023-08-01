package com.section03;
import java.util.Date;
import java.text.DateFormat;

public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currentDate = new Date();
		System.out.println("현재 날짜 : " + currentDate);
		
		String dateToStr = DateFormat.getInstance().format(currentDate);	//
		System.out.println("DateFormat.getInstance(): " + dateToStr);
		
		dateToStr = DateFormat.getDateInstance().format(currentDate);	//날짜
		System.out.println("DateFormat.getDateInstance(): " + dateToStr);
		
		dateToStr = DateFormat.getTimeInstance().format(currentDate);	//시간		
		System.out.println("DateFormat.getTimeInstance(): " + dateToStr);
		
		dateToStr = DateFormat.getDateTimeInstance().format(currentDate);	//날짜 시간
		System.out.println("DateFormat.getDateTimeInstance(): " + dateToStr);
		
		dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);	//시간
		System.out.println("DateFormat.getTimeInstance(DateFormat.MEDIUM): " + dateToStr);
		
		dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(currentDate);	//날짜 긴형식 시간 짧은형식
		System.out.println("DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT): " + dateToStr);
	}

}
