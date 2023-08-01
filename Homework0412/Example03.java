package Homework0412;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;	//초기값 20
		
		if(num == 10) {		//10일때 작동
			System.out.println("숫자가 10입니다.");
			
		}
		else if(num == 15) {	//15일때 작동
			System.out.println("숫자가 15입니다.");
			
		}
		else if(num == 20) {	//20일때 작동
			System.out.println("숫자가 20입니다.");
			
		}
		else {	//10, 15, 20 이외일때 작동
			System.out.println("숫자가 존재하지 않습니다.");
		}
	}

}
