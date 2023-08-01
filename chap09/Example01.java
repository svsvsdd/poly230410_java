package chap09;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal myObj = new Animal();	//animal 생성자 만들수 없음 - 추상클래스라서 생성자 X
	
		
		Cat cat = new Cat();
		cat.printSound();
		cat.displayInfo();
	
	}

}
