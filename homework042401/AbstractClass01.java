package homework042401;

public class AbstractClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle("빨간색", 2.2);
		Shape s2 = new Rectangle("노란색", 2, 4);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}	

}
//추상클래스는 객체(생성자)로 만들 수 없으므로 자식클래스를 생성자 만들어서 접근함.