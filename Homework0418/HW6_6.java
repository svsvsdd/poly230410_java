package Homework0418;

public class HW6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iday = {31,28,31,30,31,30,31,31,30,31,30,31};	//int[0] iday = 31
		for(int i = 1; i < 13; i++) {
			System.out.print(i + "월 => ");
			
			for(int j = 0; j < 32; j++) {
				System.out.print(j);
				
				if(iday[i-1] == j) break;	//배열이 0부터 시작이라 i-1 해서 0으로 해줘야됨.
				System.out.print(",");	//마지막일 때 콤마 안찍으려면 break 밑으로 빼야됨.
			}
			System.out.println();
		}
	}

}
