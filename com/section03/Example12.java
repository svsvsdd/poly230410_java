package com.section03;
import java.util.Random;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random1 = new Random();	
		System.out.println("난수 값 : " + random1.nextInt());	//int 범위 내 난숫 ㅐㅇ성
		Random random2 = new Random();
		for(int i = 0; i < 10; i++) {	//10개 생성
			System.out.println(random2.nextInt(100) + " ");	//0이상 100미만 난수 생성
		}
	}

}
