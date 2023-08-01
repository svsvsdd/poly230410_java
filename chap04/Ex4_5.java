package chap04;

public class Ex4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val;
		
		for(int i = 0; i < 300; i++) {
			val = 5 * i;
			if(val >= 0 && val <10) System.out.println("일" + val);	//조건1 1의자리
			else if(val >= 10 && val < 100) System.out.println("십" + val);	//조건2 10의자리
			else if(val >= 100 && val < 1000) System.out.println("백" + val);	//조건3 100의자리
			else System.out.println("천" + val);		//이외(i값이 10000의자리 전에 끝남)
		}
	}

}
