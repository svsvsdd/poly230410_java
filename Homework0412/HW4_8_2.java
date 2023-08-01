package Homework0412;

public class HW4_8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;	//초기화
		while(i <= 10 ) {	//10이하일때 반복
			int j = 1;
		    while (j <= i) {	//j<=i일때 
		    	System.out.print("*");	//j 갯수만큼 "*" 출력
				j++;	//j증가
		    }
		    System.out.println();	//줄바꿈
		    i++;	//이후 i증가
		}			    
	}
}
