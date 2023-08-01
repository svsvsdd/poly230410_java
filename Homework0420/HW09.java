package Homework0420;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HW09 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int person = 30;	//이 값을 주는 만큼 저장소 생성

		int person = 200;	//총 학생수
		int groupSize = 30;	//30명씩 묶어서 그룹화
		int numGroups = (int) Math.ceil((double) person / groupSize);	//그룹 번호 Math.ceil은 올림함수 (굳이 안쓰고 int로 해도 될듯?) ->x
		//int numGroups = person / groupSize;	//이거로 하니 180에서 잘림. 이유 200이 30의 배수가 아니라 6.6666->버림해서 6이 나와버림. 남은 20개가 잘리기에 올림함수를 써서 남은것도 포함시켜야함.
					
		
		InputData2 inData = new InputData2(person);	//생성자의 숫자를 준 만큼 배열 생성
		
		LocalDateTime now = LocalDateTime.now();	//현재시간 읽어옴
        String formattedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));	//현재시간 출력형식 변경
				
		//입력 데이터 생성
		for(int i = 0; i < person; i++) {	//i값은 맨 끝인 person까지 생성
			//String name = "홍길" + (i+1);					//이름
			String name = "홍길" + String.format("%02d", i+1);	//출력형식 01 02...
			int kor = (int)(Math.random() * 100);	//국어점수
			int eng = (int)(Math.random() * 100);	//영어점수
			int mat = (int)(Math.random() * 100);	//수학점수
			inData.setData(i, name, kor, eng, mat);	//클래스 내 값을 입력
		}
		
		
		int total_kor = 0;		//누적 합계
	    int total_eng = 0;
	    int total_mat = 0;
	    int total_sum = 0;
	    int total_avg = 0;
		
		//입력 값 잘 들어갔는지 확인
		for (int g = 0; g < numGroups; g++) {	//그룹별 출력을 위해 numGroups씩 끊어줌
		    int start = g * groupSize;	//각 페이지별 시작점
		    int end = Math.min(start + groupSize, person);	//두 개 이상의 숫자 중에서 가장 작은 값을 반환하는 함수. 각 그룹의 마지막 학생 인덱스(end)를 계산하는 데 사용. 이 값은 그룹의 시작 인덱스(start)에 그룹 크기(groupSize)를 더한 값과 전체 학생 수(person) 중에서 작은 값으로 설정됩니다. 이렇게 하면 마지막 그룹이 다른 그룹보다 작은 경우에도 올바르게 처리됩니다. 예를 들어 person이 200이고 groupSize가 30인 경우, 마지막 그룹의 시작 인덱스(start)는 180이 됩니다. 이 경우 start + groupSize의 값은 210이 되지만 전체 학생 수(person)는 200이므로 마지막 학생의 인덱스(end)는 200으로 설정되어야 합니다. 이를 위해 Math.min 함수를 사용하여 end 값을 계산합니다.
		    
		    int sum_kor = 0;		//그룹별 합계
		    int sum_eng = 0;
		    int sum_mat = 0;
		    int sum_sum = 0;
		    int sum_avg = 0;
		    
		    System.out.println("		성적집계표");
			System.out.println("PAGE: "+((start/groupSize)+1)+"			출력일자: "+ formattedNow);	//현재페이지 
			System.out.println("====================================================");
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
			System.out.println("====================================================");

		    for (int i = start; i < end; i++) {		//i값은 그룹별 start에서 end까지 진행
		        System.out.println(String.format("%03d", i+1) + "\t" + inData.name[i] + "\t" + inData.kor[i] + "\t" + 
		            + inData.eng[i] + "\t" + inData.mat[i] + "\t" + inData.sum[i] + "\t" + inData.avg[i]);
		        
		        sum_kor += inData.kor[i];		//누적 합계
		        sum_eng += inData.eng[i];
		        sum_mat += inData.mat[i];
		        sum_sum += inData.sum[i];
		        sum_avg += inData.avg[i];
		    }
		    
		    total_kor += sum_kor;		//누적 합계
		    total_eng += sum_eng;
		    total_mat += sum_mat;
		    total_sum += sum_sum;
		    total_avg += sum_avg;
		    
		    System.out.println("====================================================");
		    System.out.println("현재페이지");
		    System.out.println("합계\t\t"+sum_kor+"\t"+sum_eng+"\t"+sum_mat+"\t"+sum_sum+"\t"+sum_avg);
		    System.out.println("평균\t\t"+(sum_kor / groupSize)+"\t"+(sum_eng / groupSize)+"\t"+(sum_mat / groupSize)+"\t"+(sum_sum / groupSize)+"\t"+(sum_avg / groupSize));
		    System.out.println("====================================================");
		    System.out.println("누적페이지");
		    System.out.println("합계\t\t"+total_kor+"\t"+total_eng+"\t"+total_mat+"\t"+total_sum+"\t"+total_avg);
		    System.out.println("평균\t\t"+(total_kor / (groupSize * (g+1)))+"\t"+(total_eng / (groupSize * (g+1)))+"\t"+(total_mat / (groupSize * (g+1)))+"\t"+(total_sum / (groupSize * (g+1)))+"\t"+(total_avg / (groupSize * (g+1))));
		    System.out.println();
		}
		
	/*	for (int g = 0; g < numGroups; g++) {
		    int start = g * groupSize;
		    int end = Math.min(start + groupSize, person);
		    for (int i = start; i < end; i++) {
		    	System.out.println(String.format("%03d", i+1) + "\t" + inData.name[i] + "\t" + inData.kor[i] + "\t" + 
						+ inData.eng[i] + "\t" + inData.mat[i] + "\t" + inData.sum[i] + "\t" + inData.avg[i]);
			}
			
		}
		System.out.println("====================================================");
		int sum_kor = 0;	//합합 계싼
		int sum_eng = 0;
		int sum_mat = 0;
		int sum_sum = 0;
		int sum_avg = 0;
		
		int avg_kor = 0;	//항목별 평균 계싼
		int avg_eng = 0;
		int avg_mat = 0;
		int avg_sum = 0;
		int avg_avg = 0;
		
		for(int i = 0; i < person; i++) {
			sum_kor += inData.kor[i];
			sum_eng += inData.eng[i];
			sum_mat += inData.mat[i];
			sum_sum += inData.sum[i];
			sum_avg += inData.avg[i];
			
			avg_kor += inData.kor[i]/person;
			avg_eng += inData.eng[i]/person;
			avg_mat += inData.mat[i]/person;
			avg_sum += inData.sum[i]/person;
			avg_avg += inData.avg[i]/person;
			
			
			}
		System.out.println("합계\t\t"+sum_kor+"\t"+sum_eng+"\t"+sum_mat+"\t"+sum_sum+"\t"+sum_avg);
		System.out.println("평균\t\t"+avg_kor+"\t"+avg_eng+"\t"+avg_mat+"\t"+avg_sum+"\t"+avg_avg);
		
		*/
	}
	
	
	// print student information
}
		    // print group summary
		
		
		//입력 값 잘 들어갔는지 확인, 출력범위 조절
		//for(int i = 0; i < person; i++) {	//출력형식 변경 번호 001... ,이름01은 위에서 변경
			
/*----------
1. 초기값인 person = 30을 바꿔서 200으로 바꿔서 출력을 하되. 2. 출력되는 형식을 위에처럼 30씩 끊어서 출력되는 형식으로 진행하고 싶어.
(총합, 총평균도 30씩 끊어서) 내가 생각했을 때는 그냥 단순히 i=0; i<30; i++랑 i=30; i > =30 & i <60; i++ 이런 형식으로 하면 
가능하지 않을까 생각했는데 옳은 방법일까?

Yes, you can change the value of person to 200 and modify the loop to print the results in groups of 30. One way to do this is to use a nested loop. The outer loop will iterate over the number of groups and the  inner loop will iterate over the number of students in each group. Here’s an example:

 person의 값을 200으로 변경하고 루프를 수정하여 결과를 30개씩 그룹으로 출력할 수 있습니다. 이를 위해 중첩 루프를 사용하는 방법이 있습니다.  바깥쪽 루프는 그룹 수만큼 반복하고 안쪽 루프는 각 그룹의 학생 수만큼 반복합니다. 예를 들면 다음과 같습니다:

int person = 200;
int groupSize = 30;
int numGroups = (int) Math.ceil((double) person / groupSize);

for (int g = 0; g < numGroups; g++) {
    int start = g * groupSize;
    int end = Math.min(start + groupSize, person);
    for (int i = start; i < end; i++) {
        // print student information
    }
    // print group summary
}

이 코드는 학생들을 그룹으로 나누어 각 그룹의 정보와 요약을 출력하는 중첩 루프입니다.
바깥쪽 루프는 g를 0부터 numGroups - 1까지 반복합니다. 각 반복에서 g는 현재 그룹의 인덱스를 나타냅니다.
바깥쪽 루프의 첫 번째 줄에서 start 변수는 현재 그룹의 첫 번째 학생의 인덱스를 계산합니다. 이 값은 g * groupSize로 계산됩니다.
바깥쪽 루프의 두 번째 줄에서 end 변수는 현재 그룹의 마지막 학생의 인덱스를 계산합니다. 이 값은 start + groupSize와 person 중에서 작은 값으로 설정됩니다. 이렇게 하면 마지막 그룹이 다른 그룹보다 작은 경우에도 올바르게 처리됩니다.
안쪽 루프는 i를 start부터 end - 1까지 반복합니다. 각 반복에서 i는 현재 학생의 인덱스를 나타냅니다. 이 루프 내에서 학생 정보를 출력할 수 있습니다.
안쪽 루프가 종료된 후에는 그룹 요약을 출력할 수 있습니다.


This code will divide the students into groups of groupSize and print their information along with a summary for each group. You can modify it to fit your needs.
이 코드는 학생들을 groupSize 크기의 그룹으로 나누어 각각의 정보와 함께 각 그룹의 요약을 출력합니다. 필요에 따라 수정할 수 있습니다.

Math.ceil은 올림 함수입니다. 이 함수는 주어진 숫자보다 크거나 같은 가장 작은 정수를 반환합니다. 예를 들어 Math.ceil(3.4)는 4.0을 반환합니다.
위의 코드에서 Math.ceil은 전체 학생 수(person)를 그룹 크기(groupSize)로 나눈 후 올림하여 그룹 수(numGroups)를 계산하는 데 사용됩니다. 이렇게 하면 학생 수가 그룹 크기의 배수가 아닌 경우에도 마지막 그룹이 추가됩니다.

Math.min은 두 개 이상의 숫자 중에서 가장 작은 값을 반환하는 함수입니다. 예를 들어 Math.min(3, 4)는 3을 반환합니다.
위의 코드에서 Math.min은 각 그룹의 마지막 학생 인덱스(end)를 계산하는 데 사용됩니다. 이 값은 그룹의 시작 인덱스(start)에 그룹 크기(groupSize)를 더한 값과 전체 학생 수(person) 중에서 작은 값으로 설정됩니다. 이렇게 하면 마지막 그룹이 다른 그룹보다 작은 경우에도 올바르게 처리됩니다.
*/
