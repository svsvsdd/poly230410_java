package Homework0420;

public class Cat {
	String breed;
	String color;
	int age = 10;
	
	Cat(){
		System.out.println("Cat() 생성자 호출합니다");
	}
	Cat(String pBreed){	//멤버변수 breed 에 주도록
		System.out.println("Cat(...) 생성자 호출합니다.");
		breed = pBreed;
	}
	
	Cat(String pBreed, String pColor){	//멤버변수 breed, color 에 주도록
		System.out.println("Cat(..., ...) 생성자 호출합니다");
		breed = pBreed;
		color = pColor;
	}
	
	void eat() {
		System.out.println("먹이를 먹다");
	}
	void scratch() {
		System.out.println("발톱으로 할퀴다");
	}
	void meow() {
		System.out.println("야옹하고 울다");
	}
}
