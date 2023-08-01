package Homework0412;
import java.util.Scanner;

public class Loop01 {

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
