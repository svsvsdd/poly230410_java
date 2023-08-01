package Homework0417;

import java.util.Scanner;

public class HW5_6 {
	public static void max(int x, int y, int z) {
		if(x > y) {		//x>y이면
			if (x > z) {	//x>y이고 x>z이면 x y z
				System.out.println(x +"는 가장 큰 정수입니다.");
						
			}
			else {	//x>y이고 x>z이 아니면 z x y
				System.out.println(z +"는 가장 큰 정수입니다.");
			
			}
		}
		
		if(x < y) {		//x<y이면
			if (x > z) {	//x<y이고 x>z이면 y x z
				System.out.println(y +"는 가장 큰 정수입니다.");
						
			}
			if (y > z) {	//y xz
				System.out.println(y +"는 가장 큰 정수입니다.");
			}
			else {	//x<y이고 y>z이 아니면 z y x
				System.out.println(z +"는 가장 큰 정수입니다.");
			
			}
		}	
	}
	
	public static void min(int x, int y, int z) {
		if(x < y) {		//x<y이면  y x
			if (x < z) {	//x<y이고 x<z이면 z y x
				System.out.println(x +"는 가장 작은 정수입니다.");
		
			}
			else {	//x<y이고 x<z이 아니면 y x z
				System.out.println(z +"는 가장 작은 정수입니다.");
		
			}
		}
		
		if(x > y) {		//x>y이면  x y
			if (x < z) {	//x>y이고 x<z이면 z x y
				System.out.println(y +"는 가장 작은 정수입니다.");
						
			}
			/*if (y < z) {	//xz y
				System.out.println(y +"는 가장 작은 정수입니다.");
			}*/
			else {	//x>y이고 y<z이 아니면 x y z
				System.out.println(z +"는 가장 작은 정수입니다.");
			
			}
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3개의 숫자를 입력하세요.");

		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();		//x 선언
		int y = s.nextInt();		//y 선언
		int z = s.nextInt();		//z 선언
				
		max(x, y, z);
		min(x, y, z);
		
	}

}

