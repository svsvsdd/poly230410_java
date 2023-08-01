package Homework0421;

public class Son extends Father {	//상속 Father
	String name = "홍길동";
	
	void printDetails() {
		System.out.println("나의 이름은 " + this.name);	//자기자신(name=홍길동)
		System.out.println("나의 아버지는 " + this.familyName);	//father class의 이름
		System.out.println("나의 집은 " + this.houseAddress);	//father class
	}
}
