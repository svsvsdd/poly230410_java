package chap03;

public class Example3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 9.123456789f;	//float
		double d = 9.123456789;	//double
		double d2 = (double)f;	//float->double로 변환
		
		System.out.println("f = " + f);	//f은 float형 변수. 9.123457 - 소수 6자리까지 출력되어 반올림
		System.out.println("d = " + d);	//d는 double형 변수. 9.123456789 - double형이라 끝까지 출력
		System.out.println("d2 = " + d2);	//d2는 float형->double형 변수. float->double로 변환되는 과정에서 정밀도가 손상되어 오차가 발생함. 
	}

}
