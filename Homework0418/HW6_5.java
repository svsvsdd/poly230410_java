package Homework0418;

public class HW6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 13; i++) {
			System.out.print(i + "월 => ");
			
			LOOP:for(int j = 1; j < 32; j ++) {
				System.out.print(j + ",");
				
				switch(i) {
				case 4: case 6: case 9: case 11:
					if(j == 30) break LOOP;	//break LOOP 없으면 31까지 계속감
					break;	//for 루프 벗어남 없어도 같은 결과
				case 2:
					if (j == 28) break LOOP;	//break LOOP 없으면 31까지 계속감
					break;	//for 루프 벗어남 없어도 같은 결과
				}
			}
			System.out.println();
		}
	}

}
