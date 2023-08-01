package chap04;
import java.util.Scanner;
public class If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		int grade = s.nextInt();	//grade는 int형 자료형
		
		if(grade >= 90) {	//90 이상이면
			System.out.println("A 학점");
			
		}
		else if(grade >= 80) {	//80 이상이면
			System.out.println("B 학점");
			
		}
		else if(grade >= 70) {	//70 이상이면
			System.out.println("C 학점");
			
		}
		else if(grade >= 60) {	//60 이상이면
			System.out.println("D 학점");
			
		}
		else {	//60 미만이면
			System.out.println("F 학점");
			
		}
	}

}
