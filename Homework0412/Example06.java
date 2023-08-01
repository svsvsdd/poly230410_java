package Homework0412;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';	//초기값
		switch(grade) {
		case 'A':
			System.out.println("매우 우수");
			break;
		case 'B':
			System.out.println("우수");
			break;
		case 'C':
			System.out.println("좋음");
			break;
		case 'D':
			System.out.println("좀 더 열심히");
			break;
		case 'F':
			System.out.println("미흡");
			break;
		default:	//ABCDF 이외의 값 입력시
			System.out.println("잘못된 등급");
			
			
		}
	}

}
