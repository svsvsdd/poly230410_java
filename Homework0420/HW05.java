package Homework0420;

public class HW05 {
	private static int inVal;	//private
	public static void channelUp() {
		inVal++;
		//System.out.println("그냥 메서드 " + inVal);
	}
	public static void volUp() {
		inVal++;
		//System.out.println("그냥 메서드 " + inVal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inVal = 0;
		TVRemoteController cont = new TVRemoteController();
		
			
		channelUp();							//메인 클래스 내의 메서드 실행
		volUp();
		
		for(int i = 0; i < 10; i++) {	//10까지 증가
			cont.channelUp();
			System.out.println("MSG:  현재 채널: " + cont.channel);
		}
		for(int i = 0; i < 10; i++) {
			cont.channelDn();
			System.out.println("MSG:  현재 채널: " + cont.channel);
		}

		
		for(int i = 0; i < 5; i++) {	//5까지 증가
			cont.volUp();
			System.out.println("MSG:  현재 음량: " + cont.vol);
		}
		for(int i = 0; i < 5; i++) {
			cont.volDn();
			System.out.println("MSG:  현재 음량: " + cont.vol);
		}
		
	}
	

}
