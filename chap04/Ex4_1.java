package chap04;
import java.util.Scanner;

public class Ex4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요: " );	//println하면 줄바꿔버림
		int a = s.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요: " );
		int b = s.nextInt();
		
		System.out.println("합계: " + (a + b));
	}

}
/*
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int sum = 0;	//초기화
	System.out.println("5개의 숫자를 입력하세요.");
	
	for(int n = 1; n <= 5; n++) {	//n 초기값 1, 5이하일때 증가
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();	//int형 자료형
		sum += num;			//sum = sum+num
	}
	System.out.println("합계 : " + sum);
}

}
*/