package chap04;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();	//num은 int형 자료형
		
		if(num % 2 == 0) {	//2로 나눠 나머지 0이면
			System.out.println(num + "은 짝수입니다.");
			
		}
		else {	//2로 나눠 나머지 0이 아니면(1)
			System.out.println(num + "은 홀수입니다.");
			
		}
		System.out.println("이 문장은 if문 외부에 있습니다.");	//if와 관계없이 항상 출력
		
	}

}
