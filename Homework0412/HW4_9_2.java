package Homework0412;

public class HW4_9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 10; i++) {	//i = 1단부터 9단까지 반복실행
			System.out.println("**********");
			System.out.println("구구단 " + i + " 단");
			System.out.println("**********");
			for(int j = 1; j < 10; j ++) {	//i = 1단일때 1~9까지 j 증가, 2단일때 ..., 9단일 때 ...
				System.out.println(i + " * " + j + " = " + i*j);	// i * j = i*j
			}
		}
	}
}
