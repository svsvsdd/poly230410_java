package chap04;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 9;
		int sum = 0;	//sum 초기화
		//for(int i = 1; ((3*i)>=a && (3*i)<=b); i++){
		for(int i = 1; ((3*i)>a && (3*i)<b); i++){
			
			System.out.print(3*i + " "); //3 6 9...
			
			sum = sum + (3 * i);	//3의 배수의 합
		}
		System.out.println("");
		System.out.println("입력 받은 두 숫자 중 3의 배수의 합: " + sum);	
	}
}
//오류나는 이유 처음 i=1일때 false가 되어서 반복문을 빠져나와버림?