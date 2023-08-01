package com.member2;

public class Member {
	private int num;
	private String name;
	private String phone;
	private String addr;
	private String pass;
	
	public Member(int num, String name, String phone, String addr, String pass) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.pass = pass;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}