package com.member.domain;

import java.util.Scanner;

public class Domain {
	
//	member.num
	
	void printDomain() {
		System.out.println("****************************************");
		System.out.println("		회원 관리 프로그램");
		System.out.println("****************************************");
		System.out.println("1. 고객 정보 등록하기 \t2. 고객 정보 조회하기");
		System.out.println("3. 고객 정보 수정하기 \t4. 고객 정보 삭제하기");
		System.out.println("5. 고객 정보 목록보기 \t6. 고객 정보 파일출력");
		System.out.println("7. 종료");
		System.out.println("****************************************");
		System.out.println("메뉴 번호를 선택하세요");
	}
}	
	
/*	
	public void printInformation() {
		System.out.println("1. 고객 정보 등록하기 2. 고객 정보 조회하기");
		System.out.println("3. 고객 정보 수정하기 2. 고객 정보 삭제하기");
		System.out.println("5. 고객 정보 목록보기 2. 고객 정보 파일출력");
		System.out.println("7. 종료");
		Scanner s = new Scanner(System.in);
		
		
		
		for(;;) {	//무한루프로 작성. 1~4 이외의 값 입력시 아무것도 하지 않게 하기 위함.
			int selected;
			selected = s.nextInt();		//숫자 입력시
			
			if(selected == 1) {
				System.out.println("등록합니다.");
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
			else if(selected == 5) {
				System.out.println("변경합니다.");
				break;	//루프 종료
			}
			else if(selected == 6) {
				System.out.println("변경합니다.");
				break;	//루프 종료
			}
			else if(selected == 7) {
				System.out.println("변경합니다.");
				break;	//루프 종료
			}
			else {
				System.out.println("잘못 입력되었습니다.");
				break;
			}
		}				
		
		
	
	
	for(int i=0; i<myArr.length; i++){	//myArr.length는 배열의 행의 개수를 반환. 따라서 i 변수는 행을 기준으로 반복.
		for(int j=0; j<myArr[i].length; j++) {	//myArr[i].length는 i 번째 행의 열의 개수를 반환. 
		//	if(myArr[i][j] > max) {	//이 부분은 이차원 배열의 모든 원소를 차례대로 탐색하면서, 지금까지 찾은 최대값보다 더 큰 원소를 발견하면 
									//해당 원소를 새로운 최대값으로 설정하고, 그 때의 행과 열의 인덱스를 기록하는 과정입니다.
									//초기에는 max 변수를 배열의 첫 번째 원소로 설정합니다. 그 다음부터 이중 반복문을 돌면서 각 원소를 검사하며, 
									//max보다 큰 원소가 나타나면 max 값을 해당 원소로 업데이트합니다. 동시에, 그 때의 행과 열의 인덱스를 기록하는 row와 col 변수도 업데이트합니다. 
									//그래서 최종적으로는 max 값과 그 때의 행과 열의 인덱스를 구할 수 있습니다.
		//		max = myArr[i][j];	
		//		row = i;
		//		col = j;
				
			}
		}
	}	
	System.out.println("입력된 값 중 최대값은: " + max);
	System.out.println("최대값의 좌표는: " + (row+1) + "행 " + (col+1) + "열");
}
}*/
