package Homework0417;

public class Method03 {
	public static int max(int x, int y) {	//int max x y
		int result;	//결과값
		if(x > y) result = x;	//한줄이면 if() 중괄호 필요없음(하지만 가독성 떨어짐)
		else result = y;
		return result;	//반환(int)
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 6;
		int num = max(a,b);
		System.out.println(a +"(와)과" + b + "의 수 중 " + num + "이 큽니다.");
	}

}
