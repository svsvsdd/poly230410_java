package com.section03;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Java");	//문자열 저장
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");	//인덱스의 char(i)값 반환
		}
		System.out.println("\n");
		System.out.println(str.compareTo("JAVA"));	//첫 번째 문자열이 두 번째 문자열보다 사전 순서상 앞에 있으면 음수 값을, 뒤에 있으면 양수 값을 반환. a<A 이므로 양수 반환. 'a'의 유니코드 값은 97이고 'A'의 유니코드 값은 65이므로 차이는 97 - 65 = 32. 따라서 32를 반환
		System.out.println(str.compareTo("Java"));	//문자열 같기에 0 반환
		System.out.println(str.compareToIgnoreCase("JAVA"));	//대소문자 구분없으면 문자열 같기에 0 반환
		
	}

}
