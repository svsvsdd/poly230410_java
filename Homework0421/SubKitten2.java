package Homework0421;

public class SubKitten2 extends SuperCat2 {
	String name;
	String age = "2살";
	public SubKitten2(String n1, String n2) {	//메서드 SubKitten2
		super(n1);	//SuperCat2
		this.name = n2;	//SubKitten2
		System.out.println("아기 고양이입니다." + " 이름은 " + name);
	}

}
