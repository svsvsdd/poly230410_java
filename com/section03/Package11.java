package com.section03;
import java.util.Random;

public class Package11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random obj = new Random();
		System.out.println("obj : " + obj.nextInt());	//난수생성 int
		
		obj.setSeed(50);	//시드 50으로 난수 생성 (항상 같은값)
		System.out.println("obj.setSeed(50): " + obj.nextInt());
	}

}
