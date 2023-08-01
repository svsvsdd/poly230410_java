package com.member2;
import java.util.Scanner;

import com.member2.controlMember;

public class App {
	public static void main(String[] args) {

		Scanner keyScan = new Scanner(System.in);
		controlMember cm = new controlMember();
		int index = 0; // 회원고유번호
		String option; // 메뉴번호 변수
		int count = 0; // 로그인 시도 횟수
		
		// 로그인을 위한 마스터계정 생성
		cm.createMaster(index);
		index++;
		
		// 로그인화면
		while(count < 4) {
			if(count == 3) {
				System.out.println("로그인횟수 초과");
				break;
			}
			System.out.println("**************************************************");
			System.out.println("\t\t로그인");
			System.out.println("**************************************************");
			System.out.print("아이디를 입력하세요: ");
			String id = keyScan.nextLine();
			int result = cm.login(id);
			if(result == 0) {
				System.out.println("로그인 성공");
				break;
			} else if(result == 1) {
				System.out.println("비밀번호가 틀렸습니다.");
				count++;
				continue;
			} else if(result == 2) {
				System.out.println("일치하는 회원이 없습니다.");
				continue;
			}
		}
		
		while (count < 3) {
			
			// 메뉴화면을 출력합니다.	
			cm.menu();
			
			// option의 값이 int형인지 확인하여 int형 외의 값이 들어오면 처음으로 돌아갑니다.
			option = keyScan.nextLine();
			
			// intFinder메서드를 호출하여 문자값이 있으면 false를 반환합니다.
			if(cm.intFinder(option) == false) continue;
			
			// 회원등록 메서드 호출
			if (Integer.parseInt(option) == 1) {
				cm.createMember(index);
				index++;
				
			// 회원정보 메서드 호출
			} else if (Integer.parseInt(option) == 2) {
				cm.readMember();
				
			// 회원수정 메서드 호출
			} else if (Integer.parseInt(option) == 3) {
				cm.updateMember();
				
			// 회원삭제 메서드 호출
			} else if (Integer.parseInt(option) == 4) {
				cm.deleteMember();

			// 회원리스트 메서드 호출
			} else if (Integer.parseInt(option) == 5) {
				cm.listMember();
			
			// 파일출력 메서드 호출
			} else if (Integer.parseInt(option) == 6) {
				cm.fileMember();
			
			// 종료
			} else if (Integer.parseInt(option) == 7) {
				System.out.println("종료합니다.");
				break;
				
			} else {
				System.out.println("1 ~ 7 사이의 숫자를 입력해 주세요.");
				continue;
			}
			System.out.println();
		}
	}
}