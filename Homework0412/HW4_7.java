package Homework0412;
import java.util.Scanner;

public class HW4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		}				
	}
}
