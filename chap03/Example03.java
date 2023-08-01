package chap03;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println(x < 10 && x < 20);	//동시 만족하면 참
		System.out.println(x < 10 || x < 20);	//하나라도 만족하면 참
		System.out.println(!(x < 10 && x < 20));	//동시 만족하지 않으면 참
	}

}
