package chap08;

public class Inheritance01 extends Calculation {	//상속받음
	public void multiplation(int x, int y) {	//추가
		z = x * y;
		System.out.println("두 수의 곱셈 : " + z);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 10;
		Inheritance01 obj = new Inheritance01();	//obj 여기 클래스를 써야됨. cal쓰면 mult 불가능
		//Calculation obj = new Calculation();
		
		obj.addition(a, b);
		obj.subtraction(a, b);
		obj.multiplation(a, b);
		
	}

}
