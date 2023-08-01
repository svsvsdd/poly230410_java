package chap05;

public class Example06 {
	public static void calculate(int x, int y) {	//input 값이 다름. 갯수나 형태나
		System.out.println(x * y);
	}
	public static void calculate(int x) {
		System.out.println(x * x);
	}
	public static void calculate(int x, double y) {
		System.out.println(x * y);
	}
	public static void calculate(double x) {
		System.out.println(x * x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate(2, 3);
		calculate(2, 3.14);
		calculate(2);
		calculate(2.5);
		
	}

}
