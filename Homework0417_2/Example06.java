package Homework0417_2;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Java Programming ";
		System.out.println("s.length() : " + s.length());	//길이
		System.out.println("s.charAt(1) : " + s.charAt(1));	//첫번째 문자
		System.out.println("s.substring(6) : " + s.substring(6));	//6번째 이후 문자열
		System.out.println("s.substring(5, 13) : " + s.substring(5, 13));	//5번째이후~13번까지 문자열
		System.out.println("s.indexOf(P) : " + s.indexOf("P"));	//몇번째 문자열에서 P가 나왔는지
		System.out.println("s.toLowerCase() : " + s.toLowerCase());	//전부 소문자화
		System.out.println("s.toUpperCase() : " + s.toUpperCase());	//전부 대문자화
		
	
	
	}

}
