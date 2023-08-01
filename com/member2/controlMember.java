package com.member2;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.member.domain.Member;

public class controlMember extends ManageMember {

	ArrayList<Member> members = new ArrayList<Member>();
	Scanner keyScan = new Scanner(System.in);
	
	// 마스터계정을 만들어줍니다.
	public void createMaster(int num) {
		members.add(new Member(num, "마스터", "master", "마스터계정", "0627"));
	}
	
	// 이름을 input으로 받아 로그인기능을 수행합니다.
	public int login(String id) {
		int returnNum = 2;
		String passWord = "";
		for (int i = 0; i < members.size(); i++) {
			if (id.equals(members.get(i).getName())) {
				System.out.print("비밀번호를 입력하세요: ");
				passWord = keyScan.nextLine();
				if (passWord.equals(members.get(i).getPass())) {
					returnNum = 0; // 로그인성공
					break;
				} else {
					returnNum = 1; // 비밀번호틀림
					break;
				}
			} else {
				returnNum = 2; // 회원정보없음
			}
		}
		return returnNum;
	}
	
	// String input값에서 문자값이 있는지 확인합니다.
	public boolean intFinder(String input) {
		if (!input.matches("-?\\d+")) {	//이 부분은 정규표현식을 사용한 것입니다. 정규표현식은 문자열에서 특정한 문자 조합을 찾거나 대체하는데 사용되는 패턴입니다. 이 코드에서는 input값이 숫자인지 아닌지를 판별하기 위해 정규표현식을 사용했습니다. “-?\d+” 는 음수와 양수를 모두 포함한 정수를 의미합니다. 이렇게 답변이 도움이 되었는지요? 더 궁금하신 것이 있으면 언제든지 물어보세요!
			System.out.println("문자는 입력할 수 없습니다.");
			return false;
		} else {
			return true;
		}
	}
	
	
	// 이름을 input받아 members배열에서 input값과 일치하는 배열index를 반환합니다.
	public int memberFinder(String name) {
		int output = 0;
		for (int i = 0; i < members.size(); i++) {
			
			// name == member[i].getName();
			if (name.equals(members.get(i).getName())) {
				output = members.get(i).getNum();
				break;
			}
		}
		return output;
	}

	// 메뉴화면을 출력해 줍니다.
	public void menu() {
		System.out.println("**************************************************");
		System.out.println("\t\t회원 관리 프로그램");
		System.out.println("**************************************************");
		System.out.println("  1. 고객 정보 등록하기\t2. 고객 정보 조회하기");
		System.out.println("  3. 고객 정보 수정하기\t4. 고객 정보 삭제하기");
		System.out.println("  5. 고객 정보 목록보기\t6. 고객 정보 파일출력");
		System.out.println("  7. 종료");
		System.out.println("**************************************************");
		System.out.print("메뉴 번호를 선택해주세요 ");
	}
	
	
	@Override
	public void createMember(int num) {
		System.out.println("고객등록");
		System.out.print("등록하실 회원의 이름을 입력하세요: ");
		String name = keyScan.nextLine();
		System.out.print("등록하실 회원의 연락처를 입력하세요: ");
		String phone = keyScan.nextLine();
		System.out.print("등록하실 회원의 주소를 입력하세요: ");
		String addr = keyScan.nextLine();
		System.out.print("등록하실 회원의 비밀번호를 입력하세요: ");
		String pass = keyScan.nextLine();

		// 변수를 받아 새로운 members를 만들어 넣어줍니다.
		members.add(new Member(num, name, phone, addr, pass));
		System.out.println("등록 완료되었습니다.");
	}
	
	
	@Override
	public void readMember() {
		System.out.println("고객조회");
		System.out.print("조회할 회원 이름를 입력해주세요 ");
		String input = keyScan.nextLine();
		int num = memberFinder(input);

		if (num != 0) {
			System.out.println(input + " 고객 정보 :");
			for (int i = 0; i < members.size(); i++) {
				if (members.get(i).getNum() == num) {
					System.out.print("회원번호 " + String.format("%02d", members.get(i).getNum()) + "\t");
					System.out.print(" 이름 " + members.get(i).getName() + "\t");
					System.out.print(" 연락처 " + members.get(i).getPhone() + "\t");
					System.out.print("주소 " + members.get(i).getAddr() + "\n");
					break;
				}
			}
		} else {
			System.out.println("일치하는 회원정보가 없습니다.");
		}
	}

	@Override
	public void updateMember() {
		System.out.println("고객수정");
		System.out.print("수정할 회원 이름를 입력해주세요 ");
		String input = keyScan.nextLine();
		int num = memberFinder(input);
		if (num != 0) {
			System.out.print(input + " 회원의 이름을 수정하세요: ");
			String name = keyScan.nextLine();
			System.out.print(input + " 회원의 연락처를 수정하세요: ");
			String phone = keyScan.nextLine();
			System.out.print(input + " 회원의 주소를 입력하세요: ");
			String addr = keyScan.nextLine();
			System.out.print(input + " 회원의 비밀번호를 입력하세요: ");
			String pass = keyScan.nextLine();
			for (int i = 0; i < members.size(); i++) {
				if (members.get(i).getNum() == num) {
					if (name == "") members.get(i).setName(members.get(i).getName());
					else members.get(i).setName(name);
					if (phone == "") members.get(i).setPhone(members.get(i).getPhone());
					else members.get(i).setPhone(phone);
					if (addr == "") members.get(i).setAddr(members.get(i).getAddr());
					else members.get(i).setAddr(addr);
					if (pass == "") members.get(i).setPass(members.get(i).getPass());
					else members.get(i).setPass(pass);
					System.out.println("수정 완료되었습니다.");
					break;
				}
			}
		} else {
			System.out.println("일치하는 회원정보가 없습니다.");
		}
	}

	// 회원삭제시 해당 회원의 비밀번호를 입력해야 삭제할 수 있습니다.
	@Override
	public void deleteMember() {
		System.out.println("고객삭제");
		System.out.print("삭제할 회원 이름을 입력해주세요 ");
		String input = keyScan.nextLine();
		int num = memberFinder(input);
		String id = members.get(num).getName();
		int result = login(id);
		if (result == 0) {
			members.remove(num);
			System.out.println("삭제되었습니다.");
		} else if (result == 1) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (result == 2) {
			System.out.println("일치하는 회원정보가 없습니다.");
		}
	}

	@Override
	public void listMember() {
		System.out.println("고객목록");
		for (int i = 1; i < members.size(); i++) {
			System.out.print("회원번호 " + String.format("%03d", members.get(i).getNum()));
			System.out.print("\t이름 " + members.get(i).getName() + "\t");
			System.out.print("\t연락처 " + members.get(i).getPhone() + "\t");
			System.out.print("\t주소 " + members.get(i).getAddr() + "\n");
		}
	}

	@Override
	public void fileMember() {
		System.out.println("파일출력");
		try {
			File file = new File("memberList.txt");
			if (file.exists())
				file.createNewFile();

			FileOutputStream fos = new FileOutputStream(file);

			for (int i = 1; i < members.size(); i++) {
				String str = "회원번호 " + members.get(i).getNum() + "이름 " + members.get(i).getName() + "\t연락처"
						+ members.get(i).getPhone() + "\t주소" + members.get(i).getAddr() + "\n";
				byte[] b = str.getBytes();
				fos.write(b);
			}
			fos.close();
			System.out.println("파일 쓰기 성공");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}