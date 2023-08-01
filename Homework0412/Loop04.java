package Homework0412;
import java.util.Scanner;

public class Loop04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("길이 : ");
		
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

}
