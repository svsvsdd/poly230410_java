package chap11;

public class Example04 {

	static void check() throws ArithmeticException{	//throws 자신을 호출한 곳으로 떠넘김
		System.out.println("내부 메서드");
		int div = 5/0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			check();
		}
		catch(ArithmeticException e) {
			System.out.println("예외 발생 " + e);
		}
	}

}
