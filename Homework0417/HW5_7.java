package Homework0417;

import java.util.Scanner;

public class HW5_7 {
	public static void star(int num) {
		int n = 1;
		while(true) {
			for(int i = 0; i < num; i++) {
				System.out.print(" "); //i 증가할 때 줄바꿈
			}
		
			for(int i = 0; i < n; i++) {
		    	System.out.print("*");	//j<=i일때 j만큼 "*"출력
			}	
			System.out.println();
			num = num - 1;
			n = n +2;
		
			if(num < 0) break;
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");

		int num = s.nextInt(); 
		
		star(num);
	}

}

/*

Scanner s = new Scanner(System.in);
System.out.print("숫자를 입력하세요 : ");

int len = s.nextInt(); 

for(int i = 0; i < len; i++) {	//첫번째 조건
	for(int j = 0; j < i; j++) {	//중첩 반복문	-맨 처음 i=0 j=0이면 넘어감
		System.out.print(" ");	//줄 안바꿈
		
	}
	for(int j = 0; j < (2*len)-1-(i*2); j++) {	//중첩 반복문	-맨 처음은 9번 *출력
		System.out.print("*");	//줄 안바꿈 
		
	}
	System.out.println("");	//단순히 줄바꿈 역할
}
}

}*/