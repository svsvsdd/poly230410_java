package Homework0412;

import java.util.Scanner;	//입력 시 가져와야될 라이브러리 역할

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 나이를 입력하세요.");
		
		Scanner s = new Scanner(System.in);	
		int age = s.nextInt();	//변수 age는 int형 자료형
		
		if(age >= 18) {	//조건:18 이상일 때
			System.out.println("당신의 나이는 18세 이상입니다.");
			System.out.println("당신은 투표할 자격이 있습니다.");
			
		}
		
		System.out.println("이 문장은 if문 외부에 있습니다.");	//if와 관계없이 항상 출력
		
		
	}

}
