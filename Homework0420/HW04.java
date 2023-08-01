package Homework0420;

public class HW04 {
	private static int inVal;	//private
	public static void up() {
		inVal++;
		System.out.println("그냥 메서드 " + inVal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inVal = 0;
		Elevator elev = new Elevator();	//클래스 받아 인스턴스 생성해 객체에 연결
		
		up();							//메인 클래스 내의 메서드 실행
		
		for(int i = 0; i < 10; i++) {
			elev.up();					//Elevator up 불러옴
			System.out.println("MSG:  " + elev.help);
		}
		for(int i = 0; i < 10; i++) {
			elev.down();				//Elevator down 불러옴
			System.out.println("MSG:  " + elev.help);
		}
	}

}
