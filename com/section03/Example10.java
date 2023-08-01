package com.section03;
import java.util.Calendar;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();	//Calendar.getInstance() 메소드는 현재 날짜와 시간을 나타내는 Calendar 객체를 반환
		System.out.print("현재 날짜 : ");
		System.out.print(calendar.get(Calendar.YEAR) + "년 ");
		System.out.print(calendar.get(Calendar.MONTH) + "월 ");
		System.out.print(calendar.get(Calendar.DATE) + "일 ");
		
	}

}
