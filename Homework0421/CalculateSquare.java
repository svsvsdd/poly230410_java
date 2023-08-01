package Homework0421;

public class CalculateSquare {
	public void square() {
		System.out.println("No Parameter Method Called");
	}
	
	public int square(int width, int height) {	//int a int b
		int area = width * height;
		return area;
	}
	
	public double square(double width, double height) {	//double a double b
		double area = width * height;
		return area;
	}
	
	public double square(int width, double height) {	//int a double b
		double area = width * height;
		return area;
	}
}
