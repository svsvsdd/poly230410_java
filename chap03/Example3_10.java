package chap03;

public class Example3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int y = 5;
		char c = 'A';	//아스키코드 65
		
		System.out.println(1 + x << 33);	//+연산자 우선순위로 왼쪽 먼저 수행. 1+2 = 3. 3을 이진수로 변환하면 0011인데  <<33번 비트이동. 그런데 int형은 32비트 정수까지 표기되기에 이를 초과하면 남은 부분은 제거됨. 따라서 33 % 32된 값인 1만큼 <<으로 비트이동하여 0011이 0110이 되어 출력값은 6이 나옴
		System.out.println(y >= 5 || x < 0 && x > 2);	//y >= 5는 참이기에 뒤의 연산이 거짓이라도 참으로 출력됨.
		System.out.println(y += 10 - x++);	//+=연산 우선순위에 따라 오른쪽에서 왼쪽으로. y = y + 10 - x++이면 10 - 2를 먼저 계산하여 8이 되고 y인 5와 더하면 13이 나옴.
		System.out.println(!('A' <= c && c <= 'Z')); //!()에서 괄호 안의 값 좌측부분은 65<=65이므로 참. 우측부분은 65<=90이므로 참. &&으로 둘다 참이니 참. !(참)이니 최종 결과는 거짓.
		System.out.println('C'-c);	//'C'=67, c='A'=65. 둘을 뺀 값은 int형인 2. 이 값이 출력.
		System.out.println(c+1);	//char c='A'=65. int형인 1과 더하려면 char이 int로 형변환이 일어나야됨. 그 결과값도 int형으로 출력되어->66
		System.out.println(c++);	//위와는 다르게 형변환이 일어나지 않아 char 형태로 출력될 경우 c인 'A'가 출력되며 c는 65+1된 66 'B'가 됨.
		System.out.println(c);		//위의 'B'가 출력
		System.out.println(++c);	//'B'인 66에서 +1된 'C'가 먼저 된 뒤에 출력. 위의 c+1의 경우와는 다르게 증감연산자의 경우 연산 결과를 기존 변수에 대입하여 결과값이 char형을 유지하여 char형으로 출력되어 A B C 형태가 출력됨.
		
	}

}
