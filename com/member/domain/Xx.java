package com.member.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Homework0420.InputData2;

public class Xx {
	
	public static void main(String[] args) {
		
		//int person = 30;	//이 값을 주는 만큼 저장소 생성

				int person = 200;	//총 학생수
		//		int groupSize = 30;	//30명씩 묶어서 그룹화
		//		int numGroups = (int) Math.ceil((double) person / groupSize);	//그룹 번호 Math.ceil은 올림함수 (굳이 안쓰고 int로 해도 될듯?) ->x
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
					
	}
}