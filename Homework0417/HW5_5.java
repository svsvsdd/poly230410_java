package Homework0417;

import java.util.Scanner;

public class HW5_5 {
	public static void Loop() {
		System.out.println("[메뉴] 1:검색 2:등록 3:삭제 4:변경 >");
		Scanner s = new Scanner(System.in);
		
		for(;;) {	//무한루프로 작성. 1~4 이외의 값 입력시 아무것도 하지 않게 하기 위함.
			int selected;
			selected = s.nextInt();
			
			if(selected == 1) {
				System.out.println("검색합니다.");
				break;	//루프 종료
			}
			else if(selected == 2) {
				System.out.println("등록합니다.");
				break;	//루프 종료
			}
			else if(selected == 3) {
				System.out.println("삭제합니다.");
				break;	//루프 종료
			}
			else if(selected == 4) {
				System.out.println("변경합니다.");
				break;	//루프 종료	
			}
			else {
				System.out.println("잘못된 입력입니다.");
				break;	
			}
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop();
	}
}

/*
Scanner s = new Scanner(System.in);
int choice = 1;	//초기화.아래에서 1 입력시 다시 작동 시작
while(choice == 1) {	//choice 1일때
	int a;	//초기화
	
	System.out.println("숫자를 입력하세요.");
	a = s.nextInt();

	switch(a % 2) {	//a를 2로 나눠서 그 나머지가
	case 0:	//0일 경우
		System.out.println("짝수입니다.");
	case 1:	//0이 아니면(1일 경우)
		System.out.println("홀수입니다.");
	}
	System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니요 0을 입력하세요.");	//0의 입력 조건은 사실 없음. 1을 입력하냐 마냐의 조건만 존재.
	choice = s.nextInt();	//1입력 시 재작동
}
System.out.println("모든 숫자를 확인했습니다.");	//1 이외의 숫자 입력하면 반복 종료
}		
}		
*/