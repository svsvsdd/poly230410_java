package Homework0418;

public class HW6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNumVal = 1001034567;
		String sNumVal = String.valueOf(iNumVal);
		String sNumVoice = "";
		
		System.out.println("==> " + sNumVal + "[" + sNumVal.length() + "자리]");
		
		String[] units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};	//숫자 발음
		String[] unitX = {"", "십", "백", "천", "만", "십", "백", "천", "억", "십"};	//자릿수 발음
		
		int i, j;
		
		i = 0;
		j = sNumVal.length()-1;	//sNumVal의 마지막 인덱스 값을 j에 저장 "1001034567"일 때, j 변수는 9가 됩니다. 따라서, unitX[9]는 "십"
		
		while(true) {
			if(i >= sNumVal.length()) break; // 모든 자릿수를 처리한 경우 종료
			
			System.out.print(sNumVal.substring(i, i+1) + "[" + units[Integer.parseInt(sNumVal.substring(i, i+1))] + "]"); // 현재 자리수의 숫자와 그에 해당하는 발음 출력
			
			if(sNumVal.substring(i, i+1).equals("0")) {	// 현재 자리수가 0인 경우
				if(unitX[j].equals("만") || unitX[j].equals("억")) {	// 현재 자리수가 만 자리수이거나 억 자리수인 경우 해당 발음만 추가
					sNumVoice = sNumVoice + "" + unitX[j];
				} else {	// 그 외의 자리수인 경우는 발음 추가하지 않음
					
				}
			} else {	// 현재 자리수가 0이 아닌 경우 해당 발음을 추가
				sNumVoice = sNumVoice
						+ units[Integer.parseInt(sNumVal.substring(i, i+1))]
						+ unitX[j];
			}
			i++; j--;	// 다음 자리수를 처리하기 위해 i와 j 값 갱신
		}
		System.out.println("\n" + sNumVal + "[" + sNumVoice + "]");	// 숫자와 해당하는 발음 출력
	}

}