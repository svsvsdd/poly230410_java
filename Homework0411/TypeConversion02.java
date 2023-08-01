package Homework0411;

public class TypeConversion02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		double y = 3.0;
		
		System.out.println(x / y);			//double로 나옴
		System.out.println(x / (int) y);	//y가 int로 3이 됨
		System.out.println((int) (x / y));	//첫줄에서 나온 값에서 정수값 이후가 잘림
		
	}

}
