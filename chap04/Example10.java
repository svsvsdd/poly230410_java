package chap04;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i <=4; i++) {	//구구단 2단부터 실행. 4단에서 종료
			System.out.println("구구단 " + i + "단");
			
			for(int j = 1; j <= 10; j++) {	//중첩 반복문. j=1~10까지의 변화값을 출력
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}

}
