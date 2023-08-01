package chap08;

public class Child2 extends Parent2 {
	String name = "홍길동";
	
	Child2(){
		super();	//무조건 super();은 첫줄에 나와야함.
		System.out.println("자식 이름 : " + name);
	}
}
