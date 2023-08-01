package com.section03;

public class Package07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = 100;	// Integer 객체 생성
		Integer num2 = 200;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		String value1 = num1.toString();   // Integer 객체를 String으로 변환
		String value2 = Integer.toString(num2);  // Integer를 String으로 변환
		
		System.out.println("num1.toString(): " + value1);
		System.out.println("Integer.toString(num2): " + value2);
		
	}

}
