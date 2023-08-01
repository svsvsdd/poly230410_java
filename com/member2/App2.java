package com.member2;

import java.util.Scanner;

import com.member2.MemberController;

public class App2 {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		MemberController mc = new MemberController();

		int option;
		String name, addr;
		int num, phone;
		
		while (true) {
			System.out.print("번호를 입력하세요 ");
			option = keyScan.nextInt();
			keyScan.nextLine();

			switch (option) {
			case 1:
				System.out.println("회원등록");
				System.out.print("이름: ");
				name = keyScan.nextLine();
				System.out.print("전화번호: ");
				phone = keyScan.nextInt();
				keyScan.nextLine();
				mc.createMember(name, phone);
				System.out.println("등록되었습니다.");
				continue;
			case 2:
				System.out.println("회원조회");
				System.out.print("회원번호: ");
				num = keyScan.nextInt();
				keyScan.nextLine();
				mc.readMember(num);
				continue;
			case 3:
				System.out.println("회원수정");
				System.out.print("회원번호: ");
				num = keyScan.nextInt();
				keyScan.nextLine();
				System.out.print("이름: ");
				name = keyScan.nextLine();
				System.out.print("전화번호: ");
				phone = keyScan.nextInt();
				keyScan.nextLine();
				mc.updateMember(num, name, phone);
				System.out.println("수정되었습니다.");
				continue;
			case 4:
				System.out.println("회원삭제");
				System.out.print("회원번호: ");
				num = keyScan.nextInt();
				keyScan.nextLine();
				mc.deleteMember(num);
				System.out.println("삭제되었습니다.");
				continue;
			case 5:
				System.out.println("회원목록");
				mc.listMember(0);
				continue;
			case 7:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("알맞는 숫자를 입력하세요");
				continue;
			}
		}

	}
}