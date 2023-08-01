package chap08;

public class Kitten extends Cat {	//Cat 상속
	void meow2() {
		System.out.println("새끼고양이가 야옹하고 울다.");
	}
	
	@Override	//생략해도 무방
	public void sound() {
		System.out.println("새끼 고양이는 야옹하고 울다.");
	}
}
