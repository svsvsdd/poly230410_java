package chap04;

public class Ex4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;	//"*" 처음에 1개
		int m = 10;	//" " 10번째 위치
		
		while(true) {
			for(int i = 0; i < m; i++)System.out.print(" ");
			for(int i = 0; i < n; i++)System.out.print("*");
			System.out.println();
			
			m = m - 1;	//" " -1
			n = n + 2;	//"*" +2
			if(m < 0) break;
			
		}
	}

}
