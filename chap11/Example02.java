package chap11;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Integer in = new Integer("abc");	//문자가 숫자가 될 순 없음. 에러라도 에러표시 없이 돌아가도록 해줌
			in.intValue();
		}
		catch(ArithmeticException e) {		//수학적 계산 예외(0으로 나누기)
			System.out.println("예외발생 ArithmeticExcaption " + e);
		}
		catch(NumberFormatException e) {	//문자열을 숫자로 변환할 때 발생하는 예외
			System.out.println("예외발생 NumberFormatException " + e);
		}
		System.out.println("try~catch문의 외부 문장입니다");	//try~catch에서는 문제가 있어도 끝까지 읽어줌
	}

}
