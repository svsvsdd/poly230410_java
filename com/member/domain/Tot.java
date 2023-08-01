package com.member.domain;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Tot {

	private int[] num;
	private String[] name;
	private int[] phone;
	private String[] addr;
	
	
	public Member(int[] num, String[] name, int[] phone, String[] addr) {
		//소스 아래3번째 constructor using field
			super();
			this.num = num;
			this.name = name;
			this.phone = phone;
			this.addr = addr;
		}
		
				
		@Override
		public String toString() {
			return "Member [num=" + Arrays.toString(num) + ", name=" + Arrays.toString(name) + ", phone="
					+ Arrays.toString(phone) + ", addr=" + Arrays.toString(addr) + "]";
		}


		public int[] getNum() {
			return num;
		}
		public void setNum(int[] num) {
			this.num = num;
		}
		public String[] getName() {
			return name;
		}
		public void setName(String[] name) {
			this.name = name;
		}
		public int[] getPhone() {
			return phone;
		}
		public void setPhone(int[] phone) {
			this.phone = phone;
		}
		public String[] getAddr() {
			return addr;
		}
		public void setAddr(String[] addr) {
			this.addr = addr;
		}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Member memb = new Member();
		
	//	ArrayList<Member> md = new ArrayList<Member>();
		Scanner s = new Scanner(System.in);
		Controller cont = new Controller();
		
		for(;;) {	//무한루프로 작성. 1~7 이외의 값 입력시 아무것도 하지 않게 하기 위함.
			int selected;
			selected = s.nextInt();		//숫자 입력시
			
			if(selected == 1) {
				cont.memberJoin();
				break;	//루프 종료
			}
			else if(selected == 2) {
				cont.search();
				break;	//루프 종료
			}
			else if(selected == 3) {
				cont.edit();
				break;	//루프 종료
			}
			else if(selected == 4) {
				cont.delete();
				break;	//루프 종료
			}
			else if(selected == 5) {
				cont.list();
				break;	//루프 종료
			}
			else if(selected == 6) {
				cont.printFile();
				break;	//루프 종료
			}
			else if(selected == 7) {
				cont.exit();
				break;	//루프 종료
			}
			else {
				System.out.println("잘못 입력되었습니다.");
				break;
			}
		}				
		System.out.println("1. 고객 정보 등록하기 2. 고객 정보 조회하기");
		System.out.println("3. 고객 정보 수정하기 2. 고객 정보 삭제하기");
		System.out.println("5. 고객 정보 목록보기 2. 고객 정보 파일출력");
		System.out.println("7. 종료");
	}

}
