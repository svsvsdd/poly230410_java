package com.section03;

public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 3;
		int i1 = a.intValue();	//Integer를 명시적으로 int로 변환
		int j1 = a;				//언박싱
		
		System.out.println(a + " " + i1 + " " + j1);
		int b = 20;
		Integer i2 = Integer.valueOf(b);	//int를 명시적으로 Integer로 변환
		Integer j2 = b;						//오토박싱
		
		System.out.println(b + " " + i2 + " " + j2);
	}

}
