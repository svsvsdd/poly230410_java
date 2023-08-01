package Homework0421;

public class Child extends Parent {
	String name = "홍길동";
	
	public void details() {	//메서드 details
		super.details();	//Parent
		System.out.println(name);	//Child
	}
	
	public void printDetails() {	//메서드 printDetails
		details();		//Child
		System.out.println("부모 이름 : " + super.name);	//Parent
		System.out.println("자식 이름 : " + name);		//Child
	}

}
