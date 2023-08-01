package com.member.domain;
import java.util.Arrays;

public class Member {
//	private int[] num;
//	private String[] name;
//	private int[] phone;
//	private String[] addr;
	
	private int num;
	private String name;
	private int phone;
	private String addr;
	
	
	
//	public Member(int[] num, String[] name, int[] phone, String[] addr) {
	public Member(int num, String name, int phone, String addr) {
	//소스 아래3번째 constructor using field
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	/*Member[](int num2, String name2, int phone2, String addr2)는 배열 자체를 생성하는 생성자를 정의하는 것이 아니라, Member 클래스의 인스턴스를 생성하면서 인스턴스 변수에 값을 할당하기 위한 생성자를 정의한 것입니다. 즉, 배열을 생성하는 것이 아닌, 단일 Member 객체를 생성하는 생성자입니다.

반면에 Member(int[] num, String[] name, int[] phone, String[] addr)는 배열 형태로 Member 객체를 생성하는 생성자를 정의한 것입니다. 이 생성자는 num, name, phone, addr 변수들이 배열로 선언되어 있기 때문에, Member 클래스의 인스턴스를 배열 형태로 생성할 수 있습니다.

두 생성자의 차이점은 인자로 전달되는 값의 형태입니다. 첫 번째 생성자에서는 각 변수마다 하나의 값만 전달받을 수 있고, 두 번째 생성자에서는 각 변수마다 배열 형태의 값들을 전달받을 수 있습니다. 따라서, 두 번째 생성자를 사용하면 여러 개의 Member 객체를 배열 형태로 생성할 수 있습니다.*/



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}



	public String getAddr() {
		return addr;
	}



	public void setAddr(String addr) {
		this.addr = addr;
	}


	
	//@Override
	public String toString1() {
		return ("회원번호 " + num + "\t 이름 " + name + "\t연락처 " + phone);
	}

	//@Override
	public String toString2() {
		return ("회원번호 " + num + "\t 이름 " + name + "\t연락처 " + phone + "\t주소 " + addr);
	}
			
	
	
	
	
	
/*	@Override
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
*/	
	
	
	// 프라이빗 으로 변수 만들어도 우클릭 소스 겟터/셋터
	
}
