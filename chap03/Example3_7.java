package chap03;

public class Example3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12345";		//s는 문자열 "12345" 선언
		int i = Integer.parseInt(s);	//Integer.parseInt(s)는 문자열 s를 정수형 int로 변환
		System.out.printf("문자를 숫자로 %d (%d) \n", i, i + 10);	//i는 정수형이므로 i = 12345. 앞은 12345 뒤는 10을 더한값인 12355
		
		String a;	//a는 문자열
		a = String.format("%d", i);	//String.format("%d", i) 로 정수형 변수 i를 문자열로 변환하고 변수 a에 저장. a = "12345" 문자열
		
		System.out.printf("숫자를 문자로 %s (%s) \n", a, a+"abcde");	//문자열 a = "12345". 앞은 12345, 뒤는 "12345"+"abcde"로 문자열 12345abcde 출력 
	}

}
