package com.section03;
import java.util.StringTokenizer;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("Java, C, Python, JSP, PHP", ",");	//문자열을 토큰으로 분리 "," 
		while (st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		
	}

}
