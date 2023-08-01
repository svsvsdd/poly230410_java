package Assignment02;

public class swampEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		int temp = 0;
		
		System.out.println("x와 y의 값을 확인합니다.");
		System.out.println("x의 값: " + x);
		System.out.println("y의 값: " + y + "\n");
		
		temp = x;	//x값을 temp에 대입 temp=10
		x = y;		//y값을 x에 대입. x=20
		y = temp;	//temp(x)값을 y에 대입 y=10
		
		
		System.out.println("x와 y의 값을 변경합니다.");
		System.out.println("x의 값: " + x);
		System.out.println("y의 값: " + y);
		
		
	}

}
