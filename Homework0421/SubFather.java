package Homework0421;

public class SubFather extends GrandFather {	//상속 GrandFather
	String familyName = "프로그래머";
	String houseAddress = "인천";
	
	void printFather() {	//메서드 printFather
		System.out.println("나는 아버지입니다! 나는 할아버지로부터 상속받습니다.");
	}
}
