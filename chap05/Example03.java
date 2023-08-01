package chap05;

public class Example03 {
	public static int add(int x, int y) {
		return x + y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 6;
		int sum = add(a,b);		//위에서 int add 선언. 값 다 통일해줘야 에러가 안남
		System.out.println(a + "(와)과" + b + "의 합은 " + sum + "입니다.");
	}

}
