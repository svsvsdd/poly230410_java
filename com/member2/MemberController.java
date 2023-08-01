package com.member2;

import java.util.Scanner;

import com.member.domain.Member;

public class MemberController extends ManageMember{
	Scanner keyScan = new Scanner(System.in);
	Member members = new Member(new int[100], new String[100], new int[100], new String[100]);
	int index = 1;
	
	@Override
	public boolean createMember(String name, int phone) {
		members.getNum()[index] = index;
		members.getName()[index] = name;
		members.getPhone()[index] = phone;
		members.getAddr()[index] = null;
		index++;
		return true;
	}
	@Override
	public boolean readMember(int num) {
		System.out.print("회원번호: ");
		System.out.print(members.getNum()[num] + " ");
		System.out.print("회원이름: ");
		System.out.print(members.getName()[num] + " ");
		System.out.print("전화번호: ");
		System.out.print(members.getPhone()[num] + " ");
		System.out.print("회원주소: ");
		System.out.print(members.getAddr()[num]);
		System.out.println();
		return true;
	}

	@Override
	public boolean updateMember(int num, String name, int phone) {
		members.getName()[num] = name;
		members.getPhone()[num] = phone;
		return true;
	}

	@Override
	public boolean deleteMember(int num) {
		members.getName()[num] = null;
		members.getPhone()[num] = 0;
		members.getAddr()[num] = null;
		return true;
	}
	
	@Override
	public boolean listMember(int num) {
		for(int i = 0; i < members.getName().length; i++) {
			if(members.getName()[i] != null) {
				System.out.print("회원번호: ");
				System.out.print(members.getNum()[i] + " ");
				System.out.print("회원이름: ");
				System.out.print(members.getName()[i] + " ");
				System.out.print("전화번호: ");
				System.out.print(members.getPhone()[i] + " ");
				System.out.print("회원주소: ");
				System.out.print(members.getAddr()[i]);
				System.out.println();
			}
		}
		return true;
	}
	
//	@Override
//	public boolean fileMember(int num) {
//		// TODO Auto-generated method stub
//		return false;
//	}

}