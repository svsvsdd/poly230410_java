package Homework0421;

public class SubDaughter extends SubFather {	//상속 SubFather
	void printDaughter() {	//메서드 printDaughter
		System.out.println("나는 딸입니다.");
		System.out.println("나는 아버지로뷰터 상속받습니다.");
		System.out.println("나의 아버지는 " + this.familyName);
		System.out.println("나의 집은 " + this.houseAddress);
	}
}
