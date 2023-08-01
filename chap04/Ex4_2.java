package chap04;
import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
			
		System.out.print("첫 번째 숫자를 입력하세요: " );
		int a = s.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요: " );
		int b = s.nextInt();
		
		

        int sum = 0;    //sum 초기화
        for(int i = 1; (3 * i) < b; i++){	//i 초기화, 조건1, 증감
            if((3 * i) > a) {		//조건2
                System.out.print((3 * i) + " "); //3 6 9... println하면 배수마다 줄바꿈
                sum += (3 * i); //3의 배수의 합
            }
        }
        System.out.println("");
        System.out.println("입력 받은 두 숫자 중 3의 배수의 합: " + sum);
    }

}

		
		
/*		
		int sum = 0;	//sum 초기화
		
		for(int i = 0; (a < (3*i) && (3*i) < b); i++){	//조건이 잘못됨. 
		//조건식인 (a < (3*i) && (3*i) < b) 에서 i 는 0부터 시작하여 계속 증가하게 됩니다. 
		// 그리고 (3*i)는 3의 배수가 되므로, a 보다 작은 수일 때는 항상 3*i < a 이며, b 보다 큰 수일 때는 항상 3*i > b 이 됩니다. 
		//즉, (a < (3*i) && (3*i) < b) 조건은 항상 거짓이 되어, 해당 for문의 블록은 실행되지 않고 넘어가게 됩니다.
		
		 	 
		 
			System.out.print((3*i) + " "); //3 6 9...
		
		sum = sum + (3 * i);	//3의 배수의 합
		}
		System.out.println("");
		System.out.println("입력 받은 두 숫자 중 3의 배수의 합: " + sum);	
	}

}

	*/