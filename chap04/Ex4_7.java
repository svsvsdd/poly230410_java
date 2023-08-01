package chap04;
import java.util.Scanner;

public class Ex4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요: " );
		int a = s.nextInt();
		
		System.out.print("사칙연산 기호를 입력하세요: " );
		String op = s.next();
		
		System.out.print("두 번째 숫자를 입력하세요: " );
		int b = s.nextInt();
		
		
		int result = 0; // 연산 결과를 저장할 변수

        if(op.equals("+")) { // 입력 받은 연산자가 "+"인 경우 - equals() 메서드를 사용해 문자열 비교
            result = a + b;
        } else if(op.equals("-")) { // 입력 받은 연산자가 "-"인 경우
            result = a - b;
        } else if(op.equals("*")) { // 입력 받은 연산자가 "*"인 경우
            result = a * b;
        } else if(op.equals("/")) { // 입력 받은 연산자가 "/"인 경우
            result = a / b;
        } else {
            System.out.println("잘못된 연산자입니다."); // 잘못된 연산자인 경우
            return; // 프로그램 종료(메서드 종료) return; 구문을 삭제하면, 잘못된 연산자가 입력된 경우에는 "잘못된 연산자입니다." 메시지가 출력되지만, 이후에도 프로그램이 계속 실행됩니다. 따라서, return;을 사용하여 프로그램을 즉시 종료시키는 것이 좋습니다.
        }

        System.out.println(a + op + b + "=" + result);
    }

}
		
		
		
		
		
		
		
/* 처음 시도 방법		
System.out.println(a + op + b + "=" + (a op b)); 
이건 안됨. op는 (사칙연산 기호는 문자열 형태로 입력받았기 때문에, 이를 연산자로 바로 사용하는 것은 불가능 )String으로 문자열 형태로 받은거라 연산자로 작동되지 않음. 
--> if로 각각 사칙연산 기호 받은거를 
		if(op.equals("+")) { // 입력 받은 연산자가 "+"인 경우
            result = a + b;
        } else if(op.equals("-")) { // 입력 받은 연산자가 "-"인 경우
            result = a - b; 
			
		이런형식으로 해야됨. 
		여기서 사칙연산문제 if(op.equals("+")) 를 if(op == +) 라고 하면 안되나 물어봤는데 안됨.
		== 연산자는 두 개의 변수가 메모리에서 동일한 객체를 참조하는데 문자열을 비롯한 대부분의 객체는 메모리에서 서로 다른 객체이므로 == 연산자를 사용하여 동등성을 비교할 수 없음. 
		따라서 문자열을 비교할 때는 equals() 메서드를 사용해야 합니다. 즉, if(op.equals("+"))와 같이 작성해야 합니다.
*/
     