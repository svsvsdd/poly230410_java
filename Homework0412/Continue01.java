package Homework0412;

public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 4; i++) {	//초기화 조건 증감
			for(int j = 1; j <= 3; j++) {	//초기화 조건 증감
				if(i == 3 && j == 2) {	//i가 3, j가 2이면 출력되지 않고 위의 반복으로 돌아감
					continue;	//반복문 끝으로 이동
				}
				System.out.println(i + " * " + j);	//i가 3, j가 2이면 출력되지 않음
			}
		}
	}

}
