package Homework0420;

public class MemberChain {
	String firstName;
	String country;
	int age;
	
	public MemberChain() {
		this("홍길순");
	}
	
	public MemberChain(String mName) {	//"홍길순" 받아줌
		this(mName, 20);
	}
	
	public MemberChain(String mName, int mAge) {	//"홍길순", 20 받아줌
		//this(mName, mAge, "대한민국");	//this가 받아주는게 없어서 오류가 나는듯?
		country = "대한민국";
		firstName = mName;
		age = mAge;
		//System.out.println("이름 : " + mName + " 나이 : " + mAge + " 국가 : " + country);
	}
	

	void printInfo() {
		System.out.println("이름 : " + firstName); 
		System.out.println("나이 : " + age);
		System.out.println("국적 : " + country);
		
	}
	
}
