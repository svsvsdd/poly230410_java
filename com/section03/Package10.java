package com.section03;
import java.util.StringTokenizer;

public class Package10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer str = new StringTokenizer("Welcome to Java Programming!!"); //문자열을 토큰으로 분리 " " 
		
		System.out.println("str.nextElement(): ");
		while (str.hasMoreElements()) {
			System.out.println(str.nextElement());
		}
	}

}
