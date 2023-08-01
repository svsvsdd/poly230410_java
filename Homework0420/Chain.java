package Homework0420;

public class Chain {
	Chain(){	//처음
		this(10);	//chain(int x)를 읽으려함.
		System.out.println("기본생성자 Chain()호출");
	}
	Chain(int x){
		this(5,6);	//chain(int x, int y)를 읽으려 함.
		System.out.println("일반 생성자 Chain(int x) 호출");
		System.out.println("x의 값 : " + x);
	}
	Chain(int x, int y){
		System.out.println("일반 생성자 Chain(int x, int y) 호출");
		System.out.println("x와 y 값 : " + x + " " + y);
	}
}
