package Homework0417_2;

public class Array06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Java Programming ";
		String s1 = "Java";
		String s2 = " Programming";
		String s3 = s1.concat(s2);	//결합 "Java Programming"
		String s4 = s.trim();	//문자열 앞 뒤의 공백 제거(문자열 사이는 제거 안함) "Java Programming"
		
		System.out.println("s3 " + s3);
		System.out.println("s4 " + s4);
		System.out.println("s3.equals(s4) " + s3.equals(s4)); //JavaProgramming
	}

}