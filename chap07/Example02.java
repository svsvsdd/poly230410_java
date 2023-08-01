package chap07;

public class Example02 {
	static void myMethod1() {	//정적	-	보통 객체지향에서는 사용하지 않도록 함.
		System.out.println("정적 메서드 호출");
	}
	
	public void myMethod2() {	//인스턴스
		System.out.println("인스턴스 메서드 호출");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod1();	//선언없이 바로사용
		
		Example02 myObj = new Example02();	//선언해줘야 접근 가능
		myObj.myMethod2();
	}

}
