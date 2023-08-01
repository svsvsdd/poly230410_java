package com.member.domain;
import java.util.Arrays;

public class Member2 {
	private int[] num;
	private String[] name;
	private int[] phone;
	private String[] addr;
	
	
	public Member2(int[] num, String[] name, int[] phone, String[] addr) {
//	public Member(int num, String name, int phone, String addr) {
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
	
	
	
	// 프라이빗 으로 변수 만들어도 우클릭 소스 겟터/셋터
	
}
