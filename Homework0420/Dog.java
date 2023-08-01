package Homework0420;

public class Dog {
	public String breed;
	public String color;	//public
	protected int age;		//protected
	private String name;	//private
	
	public void bowwow() {	//public 선언 - 어디서나 접근가능
		System.out.println("멍멍 짖다");
	}
	
	protected void run() {	//protected 선언 - 다른 패키지 하위클래스 사용가능
		System.out.println("달리다");
	}
	
	private void sleep() {	//private 선언 - 외부 클래스에서 접근 불가 
		System.out.println("잠을 자다");
	}
}
