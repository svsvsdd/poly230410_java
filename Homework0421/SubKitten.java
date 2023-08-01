package Homework0421;

public class SubKitten extends SuperCat {
	String age = "2살";
	void printInfo() {	//메서드 printInfo
		System.out.println("아기 고양이입니다.");
	}
	void printDetail() {	//메서드 printInfo
		super.printInfo();	//SuperCat
		System.out.println("품종은 "+super.breed+", 나이는 "+super.age);
		printInfo();	//SubKitten
		System.out.println("품종은 "+breed+", 나이는 "+age);
		//System.out.println("아기 고양이는 " +this.breed+ ", 나이는 "+this.age);
	}
}
