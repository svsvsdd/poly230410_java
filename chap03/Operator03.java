package chap03;

public class Operator03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 10;
		
		System.out.println(a > b);		//a가 b보다 크면 참
		System.out.println(!(a > b));	//a가 b보다 크지 않으면 참
		System.out.println((a == b) && (a == 5));	//동시 만족하면 참
		System.out.println((a != b) && (a == 5));	//동시 만족하면 참
		System.out.println(!((a != b) && (a == 5 )));	//동시 만족하지 않으면 참
	}

}
