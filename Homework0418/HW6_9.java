package Homework0418;

public class HW6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ko2re4a0Po4ly4te2chn9ic3";
		char[] ch = str.toCharArray();	//문자열을 ch 배열로 변환
		//char[] ch = new char[str.length()];	//문자열 str을 str 문자열 길이만큼의 크기를 가지는 char 배열로 변환
		/* 이 부분을 유지하면 숫자가 제거되지 않습니다. 문자열을 char 배열로 변환하는 부분은 정상적으로 작동하고 있지만, 
		 * 이후의 코드에서 숫자를 제거하지 않기 때문입니다. 따라서, char[] ch = str.toCharArray(); 를 사용하여 문자열을 char 배열로 변환하고, 
		 * 이후의 코드를 사용하여 숫자를 제거하는 것이 올바른 방법입니다.*/
		String result = "";
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] >= '0' && ch[i] <= '9') {	//i번째 문자가 '0'이상 '9' 이하의 아스키코드값을 가지면(=i번째 문자가 숫자면) - 숫자인지 판단하는 조건문
												//비교하려는 것이 문자와 숫자로 데이터 타입이 다르기에 아스키코드를 이용해서 비교한 것임. 
				//if(i == 0 || 1 || 2...|| 9) { 	//해당 방법에서 잘못된 표현법. 이건 i가 0-9중 하나의 값을 가질때임
				//if(i == 0 || i == 1 || i == 2 || ... || i == 9){	//i가 
				continue;	//남은 코드를 실행하지 않고 다음 반복으로 건너감/ i가 숫자면 아래 result += ch[i] 무시

			}
			result += ch[i];
			
			
		}
		
		
		System.out.println("result: " + result);
	}

}
