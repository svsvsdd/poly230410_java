package Homework0412;
import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하세요");
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		switch(num / 10) {	//정수인 몫의 값이
		case 10:
		case 9:	//10, 9이면
			System.out.println("A 학점");
			break;
		case 8:
			System.out.println("B 학점");
			break;
		case 7:
			System.out.println("C 학점");
			break;
		case 6:
			System.out.println("D 학점");
			break;
		default:	//위의 조건들에 해당하지 않을 경우
			System.out.println("F 학점");
			break;
		}
	}

}
