package Homework0418;
import java.util.Scanner;

public class HW6_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);		//스캐너 형식으로 값을 입력받기.
		int[] myArr = new int[5];
		int sum = 0;
		//double avg = (double) sum / myArr.length;	//sum 계산 이후에 avg 계산해야됨.->밑에 sum아래로 빼야됨
		
		for (int i = 0; i < 5; i++) {
		    System.out.print("숫자를 입력하세요: ");
		    myArr[i] = s.nextInt();
		    }
		

		//scanner.close();
		
		
		/*
		myArr[0] = 50;
		myArr[1] = 60;
		myArr[2] = 70;
		myArr[3] = 80;
		myArr[4] = 90;
			
		*/
		
		for(int i = 0; i<myArr.length; i++)	{//직접 숫자로 넣는것보다 myArr.length로 오류 최소화
			sum += myArr[i];	//sum은 각 점수의 합
			System.out.println(i+1 + "번 학생의 국어 점수: " + myArr[i]);	//배열시작이 0이라 0+1번째 학생 번호
		}
		double avg = (double) sum / myArr.length;	//sum에 (double) 처리 안해줘도 실수형 변환이 됨. 나눗셈에서는 문제 생길 수 있음.

		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}
}

