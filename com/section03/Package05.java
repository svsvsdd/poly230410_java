package com.section03;
import java.util.Scanner;

public class Package05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";	//문자열 저장할 변수 선언 초기화
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("입력 문자열 : ");
		str = in.nextLine();	//문자열 입력받기
		
		int len = str.length();	//문자열 길이
		
		String revStr1 = "";	//문자열 저장할 변수 선언 초기화
		
		for(int i = len - 1; i >= 0; i--) {	//입력받은 문자열 끝에서부터 처음까지 반복
			revStr1 = revStr1 + str.charAt(i);	//revStr1에 각 문자 추가(역순)
			
		}
		
		System.out.println("String 클래스의 역순 문자열 : " + revStr1);
		
		StringBuffer revStr2 = new StringBuffer(str);
		revStr2.reverse();	//역순
		
		System.out.println("StringBuffer 클래스의 역순 문자열 : "+ revStr2);
	}

}
