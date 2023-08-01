package Homework0417;

public class HW5_4 {
	public static void star() {
		for(int i = 1; i <= 10; i++) {
		    for(int j = 1; j <= i; j++) {
		        System.out.print("*");	//j<=i일때 j만큼 "*"출력
		    }
		    System.out.println(); //i 증가할 때 줄바꿈
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		star();
	}

}
