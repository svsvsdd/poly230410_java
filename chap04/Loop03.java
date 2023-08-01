package chap04;
import java.util.Scanner;

public class Loop03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("10보다 큰 숫자를 입력하세요.");
		int x = s.nextInt();	//초기화
		int sum = 0;	//초기화
		
		do {
			sum += x;	//sum = sum + x
			x--;	//x 감소
			
		}while (x >= 10);	//10이상일때
		System.out.println("합계 : " + sum);	//위의 sum결과를 불러옴
	}

}
