package Homework0421;

public class Polymorphism01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateSquare myArea = new CalculateSquare();	//myArea CalculateSquare
		System.out.println("가로:10, 세로:5 사각형의 넓이는 " +myArea.square(10, 5));	//int형 10 5
		System.out.println("가로:2.5, 세로 4.5 사각형이 넓이는 " + myArea.square(2.5, 4.5));	//double형 2.5 4.5
	}

}
