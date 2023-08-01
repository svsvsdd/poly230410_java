package Homework0411;

public class Example3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k01_year = 0;		//초기화 0
		int k01_age = 14;		//초기화 14
		
		System.out.println("결과1: " + k01_year);		//초기값 그대로 0
		System.out.println("결과2: " + k01_age);		//초기값 그대로 14
		
		k01_year = k01_age + 2000;		//14+2000 값을 k01_year에 대입
		k01_age = k01_age + 1;			//14+1 값을 k01_age에 대입
		
		System.out.println("결과3: " + k01_year);		
		System.out.println("결과4: " + k01_age);		
	}

}
