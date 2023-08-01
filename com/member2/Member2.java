package com.member2;

public class Member2 {
	private int[] num;
	private String[] name;
	private int[] phone;
	private String[] addr;
	
	public Member2(int[] num, String[] name, int[] phone, String[] addr) {
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.addr = addr;
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
}