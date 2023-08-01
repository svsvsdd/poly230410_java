package com.member2;

public abstract class ManageMember {
	abstract boolean createMember(String name, int phone);
	abstract boolean readMember(int num);
	abstract boolean updateMember(int num, String name, int phone);
	abstract boolean deleteMember(int num);
	//abstract boolean fileMember(int num);
	abstract boolean listMember(int num);
}