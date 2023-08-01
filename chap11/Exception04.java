package chap11;
import java.util.Scanner;

public class Exception04 {

	static void check(int num) throws NumberFormatException{	//전달한 숫자가 0보다 작으면 e
		if (num < 0)
			throw new NumberFormatException("0보다 작습니다.");
		else
			System.out.println(num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = s.nextInt();
		
		try {
			if (num < 0)	//입력받은 숫자가 int인데 음수값이 나오면 예외
				throw new NumberFormatException("0보다 작습니다.");
			else
				System.out.println(num);
			check(num);		//그렇지 않으면 check 호출
		}
		catch(NumberFormatException e) {
			System.out.println("예외 발생 " + e);
		}
		
	}

}
