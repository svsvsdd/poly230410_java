package chap11;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[2];
		try {
			System.out.println("잘못된 요소에 접근 : "+ a[3]);	//배열크기 오류
		}
		catch(Exception e) {
			System.out.println("예외 발생 ArrayIndexOutOfBoundException " + e);
		}
		finally {
			System.out.println("finally는 항상 실행됩니다.");
		}
	}

}
