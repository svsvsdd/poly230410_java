package Examples;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SPEED = 20;	//final 상수로 선언. 값을 바꿀 수 없음.
		int count = 10;		//초기값 10
		//SPEED = 40;		//넣으면 오류. 값 변경하면 안됨.
		count = 11;			//변수 초기값 10에서 11로 변경
		
		System.out.print("상수 SPEED 값은 ");
		System.out.println(SPEED);
		System.out.print("변수 count 값은 ");
		System.out.println(count);
		
	}

}
