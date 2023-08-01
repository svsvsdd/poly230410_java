package chap06;
import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] myArr;	//배열선언
		myArr = new String[3];	//메모리할당
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("3개 문자열을 입력하세요.");
		
		for(int i = 0; i < myArr.length; i++) {	//myArr.length로
			myArr[i] = s.nextLine();
		}
		
		for(int i = 0; i < myArr.length; i++) {	//myArr.length로
			System.out.print(myArr[i] + " ");
		}
	}

}
