package chap11;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 0;
			int b = 5/a;	//5/0
			
		}
		catch(ArithmeticException e) {	//예외발생 try문이 문제 없으면 출력 안됨.
			System.out.println("0으로 나눕니다.");
			//e.printStackTrace();
		}
		System.out.println("try~catch문의 외부 문장입니다.");
	}

}
