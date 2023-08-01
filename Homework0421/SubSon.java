package Homework0421;

public class SubSon extends SubFather {	//상속 SubFather
	void printSon() {	//메서드 printSon
		System.out.println("나는 아들입니다.");
		System.out.println("나는 아버지로부터 상속받습니다.");
		System.out.println("나의 아버지는 " + this.familyName);
		System.out.println("나의 집은 " + this.houseAddress);
	}
	
}
