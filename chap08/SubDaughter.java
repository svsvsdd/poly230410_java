package chap08;

public class SubDaughter extends SubFather {
	void printDaughter() {
		System.out.println("나는 딸입니다.");
		System.out.println("나는 아버지로뷰터 상속받습니다.");
		System.out.println("나의 아버지는 " + this.familyName);
		System.out.println("나의 집은 " + this.houseAddress);
	}
}
