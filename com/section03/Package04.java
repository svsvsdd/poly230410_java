package com.section03;

public class Package04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "www.google.com";
		
		String[] arrStr1;
		
		arrStr1 = str1.split("\\.");	//문자열 분할 .에서 나누기 위해 \. 해야하니 \\. www google com 3개의 배열로 arrStr1.length = 3
		
		for (int i = 0; i < arrStr1.length; i++) {
			System.out.println(arrStr1[i]);
		}
	}

}
