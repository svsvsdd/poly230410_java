package chap11;

public class Exception03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30};
		
		try {
			for(int i = 0; i <= 3; i++) {	//<3이 옳은 표기
				System.out.println("arr[" + i + "] : " + arr[i]);
				
			}
		}
		catch(Exception ex) {	//i=3일 때 예외처리
			System.out.println("예외 처리입니다....");
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("예외 발생 여부와 상관없이 실행됩니다.");
		}
	}

}
