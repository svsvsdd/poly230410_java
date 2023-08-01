package chap09;

public abstract class Animal {
	public abstract void printSount();	//추상 메서드 - 매개변수 없음 ();
	
	public void displayInfo() {		//일반 메서드 - 중괄호 
		System.out.println("나는 동물입니다");
	}
}
