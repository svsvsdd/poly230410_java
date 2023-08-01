package chap04;
import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3개의 숫자를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();		//x 선언
		int y = s.nextInt();		//y 선언
		int z = s.nextInt();		//z 선언
		
		if(x > y) {		//x>y이면
			if (x > z) {	//x>y이고 x>z이면 
				System.out.println(x +"는 가장 큰 정수입니다.");
				
			}
			else {	//x>y이고 x>z이 아니면 
				System.out.println(x +"는 가장 큰 정수가 아닙니다.");
			}
		}
		else {		//x>y가 아니면
			System.out.println(x +"는 가장 큰 정수가 아닙니다.");
			
		}
	}

}
