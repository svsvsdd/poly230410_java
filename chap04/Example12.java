package chap04;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 10; i++) {	//초기화 조건 증감
			if(i == 3 || i == 6 || i == 9) {	//i가 3 or 6 or 9일 때
				continue;	//반복문 끝으로 이동
			}
			System.out.print(i + " ");
		}
	}

}
