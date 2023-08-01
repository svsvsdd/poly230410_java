package com.section03;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Programming");	//지정한 문자열 추가
		System.out.println(sb);
		sb.insert(6, "Java ");		//6번째 자리에 문자열 삽입
		System.out.println((sb));
		sb.replace(1, 4, "Good");	//1부터 4 이전(3)까지 내용을 good으로 바꾸겠다
		System.out.println(sb);
		sb.delete(1, 5);			//1부터 5 이전(4)까지 내용 삭제
		System.out.println(sb);
		sb.reverse();				//역순
		System.out.println(sb);
			
		
		
	}

}
