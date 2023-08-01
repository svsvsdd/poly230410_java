package Homework0418;

public class HW6_11 {
	public static void randomNumSelect() { //랜덤한 숫자 (1-45) srand로 6개 뽑기 (중복 안되도록)
		Math.random()
		
		int[] lottoNumbers = new int[6];

        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if (lottoNumbers[i] == lottoNumbers[j]) {
                    i--;
                    break;
                }
            }
        }

        Arrays.sort(lottoNumbers);

        System.out.println("뽑힌 로또 번호는 " + Arrays.toString(lottoNumbers) + "입니다.");
    }

		
		
		
		
	
	
	public static void compareNum() {	//입력한 6개의 숫자와 뽑힌 랜덤숫자 6개 같은지 비교
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = s.nextInt();
				
	}

}
