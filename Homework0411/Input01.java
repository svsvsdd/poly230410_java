package Homework0411;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);	//s1이라는 이름으로 값을 받음
		System.out.println("정숫값 입력하기");
		int n = s1.nextInt();					//s1에 int n을 받아옴
		
		System.out.println("실숫값 입력하기");
		double db = s1.nextDouble();			//s1에 double db를 받아옴
		System.out.println("정숫값 : " + n);
		System.out.println("실숫값 : " + db);
		
	}

}
