package chap04;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요: " );
		int a = s.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요: " );
		int b = s.nextInt();
		
		

		int sum = 0;	//sum 초기화
		//for(int i = 1; ((3*i)>=a && (3*i)<=b); i++){
		for(int i = 1; (a<(3*i) && (3*i)<b); i++){
			
			System.out.print(3*i + " "); //3 6 9...
			
			sum = sum + (3 * i);	//3의 배수의 합
		}
		System.out.println("");
		System.out.println("입력 받은 두 숫자 중 3의 배수의 합: " + sum);	
	}
}