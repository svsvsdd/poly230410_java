package Homework0420;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HW08 {

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int person = 30;	//이 값을 주는 만큼 저장소 생성
		
		InputData2 inData = new InputData2(person);	//생성자의 숫자를 준 만큼 배열 생성
		
		LocalDateTime now = LocalDateTime.now();	//현재시간 읽어옴
        String formattedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));	//현재시간 출력형식 변경
		
		
		
		System.out.println("		성적집계표");
		System.out.println("			출력일자: "+ formattedNow);
		System.out.println("====================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("====================================================");
		
		//입력 데이터 생성
		for(int i = 0; i < person; i++) {	
			//String name = "홍길" + (i+1);					//이름
			String name = "홍길" + String.format("%02d", i+1);	//출력형식 01 02...
			int kor = (int)(Math.random() * 100);	//국어점수
			int eng = (int)(Math.random() * 100);	//영어점수
			int mat = (int)(Math.random() * 100);	//수학점수
			inData.setData(i, name, kor, eng, mat);	//클래스 내 값을 입력
		}
		
		//입력 값 잘 들어갔는지 확인
		for(int i = 0; i < person; i++) {	//출력형식 변경 번호 001... ,이름01은 위에서 변경
			System.out.println(String.format("%03d", i+1) + "\t" + inData.name[i] + "\t" + inData.kor[i] + "\t" + 
					+ inData.eng[i] + "\t" + inData.mat[i] + "\t" + inData.sum[i] + "\t" + inData.avg[i]);
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
			
			avg_kor += inData.kor[i]/person;	//굳이 필요 없을듯? 그냥 위에 sum/person으로 출력하면 됨
			avg_eng += inData.eng[i]/person;
			avg_mat += inData.mat[i]/person;
			avg_sum += inData.sum[i]/person;
			avg_avg += inData.avg[i]/person;
			
			
			}
		System.out.println("합계\t\t"+sum_kor+"\t"+sum_eng+"\t"+sum_mat+"\t"+sum_sum+"\t"+sum_avg);
		System.out.println("평균\t\t"+avg_kor+"\t"+avg_eng+"\t"+avg_mat+"\t"+avg_sum+"\t"+avg_avg);
		
		
	}

}
	