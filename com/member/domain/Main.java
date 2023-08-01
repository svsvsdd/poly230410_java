package com.member.domain;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Domain d = new Domain();
		
		d.printDomain();	//프로그램 실행창
		
	/*	System.out.println("****************************************");
		System.out.println("		회원 관리 프로그램");
		System.out.println("****************************************");
		System.out.println("1. 고객 정보 등록하기 \t2. 고객 정보 조회하기");
		System.out.println("3. 고객 정보 수정하기 \t4. 고객 정보 삭제하기");
		System.out.println("5. 고객 정보 목록보기 \t6. 고객 정보 파일출력");
		System.out.println("7. 종료");
		System.out.println("****************************************");
		System.out.println("메뉴 번호를 선택하세요");
	*/	
		
		
				
		ArrayList<Member> md = new ArrayList<Member>();
		
		Scanner s = new Scanner(System.in);
		
		Controller cont = new Controller();
		
		
		while (true) {
		    int selected;
		 //   selected = s.nextInt(); // 정수 형태로 입력받기
			
		    String input = s.next(); // 문자열로 입력받기
		    try {
		        selected = Integer.parseInt(input); // 입력받은 값이 int형이라면 진행
		    } catch (NumberFormatException e) {	//아니면 예외처리
		        System.out.println("잘못 입력되었습니다.");
		        d.printDomain();
		        continue; //루프
		    }
		    
		    
		    if (selected == 1) {
		    	cont.memberJoin();
		    	d.printDomain();
		    	continue;	//루프 
		    } 
		    else if (selected == 2) {
		    	cont.search();
		    	d.printDomain(); 
		    	continue;	//루프 
		    } 
		    else if(selected == 3) {
				cont.edit();
				d.printDomain();	//프로그램 실행창
				continue;	//루프 
			}
			else if(selected == 4) {
				cont.delete();
				d.printDomain();	//프로그램 실행창
				continue;	//루프 
			}	
			
			else if(selected == 5) {
				cont.list();
				d.printDomain();	//프로그램 실행창
				continue;	//루프 
			}
			else if(selected == 6) {
				cont.printFile();
				d.printDomain();	//프로그램 실행창
				continue;	//루프 
			}
			else if (selected == 7) {
		        cont.exit();
		        
		        break; //end loop
		    } 
			else {	//정수 1-7 이외의 수 입력시
		        System.out.println("잘못 입력되었습니다.");
		        d.printDomain();
		        continue;	//루프
		    }
		}
	}
}

/*		
	try {
		for(;;) {	//무한루프로 작성. 1~7 이외의 값 입력시 아무것도 하지 않게 하기 위함.
			int selected;
			selected = s.nextInt();		//숫자 입력시
			
			if(selected == 1) {
				cont.memberJoin();
				d.printDomain();	//프로그램 실행창

				continue;
			}
	
			else if(selected == 2) {
				cont.search();
				d.printDomain();	//프로그램 실행창

				continue;
			}
			else if(selected == 3) {
				cont.edit();
				d.printDomain();	//프로그램 실행창

				continue;	//루프 
			}
			else if(selected == 4) {
				cont.delete();
				d.printDomain();	//프로그램 실행창
				
				continue;	//루프 
			}	
			
			else if(selected == 5) {
				cont.list();
				d.printDomain();	//프로그램 실행창
				
				continue;	//루프 
			}
			else if(selected == 6) {
				cont.printFile();
				d.printDomain();	//프로그램 실행창
				
				continue;	//루프 
			}
			else if(selected == 7) {
				cont.exit();
				d.printDomain();	//프로그램 실행창
				
				break;	//루프 종료
			}
			else {
				System.out.println("잘못 입력되었습니다.");
				d.printDomain();	//프로그램 실행창
				
				continue;
		
			}
		}
	} catch(InputMismatchException e){	//try catch가 아니라 if문으로 해서 조건 만족하면 실행. 아니면 무시쪽으로 가야됨. 
			System.out.println("잘못 입력되었습니다.");
			d.printDomain();	//프로그램 실행창
			s.nextLine(); //잘못된 입력 삭제
//		    continue; //go back to beginning of loop	이건 루프 밖이라 의미가 없음
			
			
			for(;;) {	//무한루프로 작성. 1~7 이외의 값 입력시 아무것도 하지 않게 하기 위함.		for()르 하지 않고 while true/f
				int selected;
				selected = s.nextInt();		//숫자 입력시
				
				if(selected == 1) {
					cont.memberJoin();
					d.printDomain();	//프로그램 실행창

					continue;
				}
		
				else if(selected == 2) {
					cont.search();
					d.printDomain();	//프로그램 실행창

					continue;
				}
				else if(selected == 3) {
					cont.edit();
					d.printDomain();	//프로그램 실행창

					continue;	//루프 
				}
				else if(selected == 4) {
					cont.delete();
					d.printDomain();	//프로그램 실행창
					
					continue;	//루프 
				}	
				
				else if(selected == 5) {
					cont.list();
					d.printDomain();	//프로그램 실행창
					
					continue;	//루프 
				}
				else if(selected == 6) {
					cont.printFile();
					d.printDomain();	//프로그램 실행창
					
					continue;	//루프 
				}
				else if(selected == 7) {
					cont.exit();
					d.printDomain();	//프로그램 실행창
					
					break;	//루프 종료
				}
				else {
					System.out.println("잘못 입력되었습니다.");
					d.printDomain();	//프로그램 실행창
					
					continue;
			
				}
			}
		
	}
		
		
		
		
	}

}
*/