package Homework0418;

public class HW6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArr[][] = {	//i는 학생번호, j는 국어 영어 수학 점수
				{90, 80, 70},
				{60, 70, 80},
				{80, 80, 90},
				{70, 70, 50},
				{70, 80, 80},
				};
		
		int[] sum = new int[5]; // 각 학생의 총점을 저장할 배열
				
		for(int i = 0; i < 5; i++) {
			int studentSum = 0; // 각 학생의 총점을 저장할 변수
			for(int j = 0; j < 3; j++) {
				
				studentSum  += myArr[i][j];	//각 학생의 총점
				
				String subject = "";	//j값이 0 1 2 일때 문자열로 출력
		        if(j == 0) {
		            subject = "국어";
		        } else if(j == 1) {
		            subject = "수학";
		        } else if(j == 2) {
		            subject = "영어";
		        }
								
				System.out.println(i+1+ "번 학생의 " + subject + "점수: " + myArr[i][j]+" ");
				
			}
			sum[i] = studentSum; // 각 학생의 총점을 배열에 저장
		}
		for(int i = 0; i < 5; i++) {
			double avg = (double)sum[i] / myArr[i].length;	// 각 학생의 평균을 계산
			//double avg = (double) sum[i] / 3; // 각 학생의 평균을 계산
	 
		
			System.out.println((i+1) + "번 학생의 총점:" +sum[i] + ", " + (i+1) + "번 학생의 평균: " + avg);
		}
	}
}

/*			
			
			
			
		}
		double avg = sum/myArr.length;
		System.out.print(i+1 + "번 학생의 총점:" +sum + ", " + i+1 + "번 학생의 평균: " + avg);
		//System.out.println("myArr[0][1] 값" + myArr[0][1]);
	}

}*/
/*		
		
		
		
		int[][] myArr = new int[5][3];
		myArr[0][0] = 2;
		myArr[0][1] = 5;
		myArr[0][2] = 7;
		myArr[0][3] = 4;
		myArr[1][0] = 9;
		myArr[1][1] = 3;
		myArr[1][2] = 2;
		myArr[1][3] = 8;
		int sum1 = 0, sum2 = 0;
		for(int i = 0; i < 4; i++) {
			sum1 += myArr[0][i];
			
		}
		System.out.println("첫 번째 행의 합계: " +sum1);
		for(int i = 0; i <4; i++) {
			sum2 += myArr[1][i];
		}
		System.out.println("두 번째 행의 합계: " +sum2);
	}
	int myArr[][] = {	
			{90, 80, 70},
			{60, 70, 80},
			{80, 80, 90},
			{70, 70, 50},
			{70, 80, 80},
			};

}
*/