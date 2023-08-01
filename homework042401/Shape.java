package homework042401;

public abstract class Shape {	//추상 클래스
	String color;
	
	abstract double area();	//추상 메소드 - 하위에서 구현
	public abstract String toString();	//추상 메소드 - 하위에서 구현
	
	public Shape(String color) {
		System.out.println("Shape 클래스 생성자 호출");
		this.color = color;		//입력받은 color
	}
	
	public String getColor() {return color;}	//반환
}
