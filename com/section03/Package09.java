package com.section03;
import java.util.Calendar;

public class Package09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar obj1 = Calendar.getInstance();
		Calendar obj2 = Calendar.getInstance();
		
		obj2.add(Calendar.YEAR, 10);	//obj2는 10년 더한 값
		
		System.out.println("obj1: " + obj1.getTime());
		System.out.println("obj2: " + obj2.getTime());
		
		int comp = obj1.compareTo(obj2);	//obj1 obj2 비교 obj1이 obj2보다 이전 시간을 나타내면 음수를 반환 반대면 양수. 같으면 0
		
		System.out.println("obj1.compareTo(obj2): " + comp);
	}

}
