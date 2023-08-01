package com.section03;
import com.mypackage.Dog;
public class Package02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog01 = new Dog();	//Dog
		Dog dog02 = new Dog();
		System.out.println(dog01.equals(dog02));	//dog01과 dog02 비교
		
		String str1 = dog01.bowwow();	//String
		String str2 = dog02.bowwow();
		System.out.println(str1.equals(str2));	//dog객체의 bowwow에서 반환된 두개의 String객체를 비교. 문자열이 동일 내용이면 true
	}

}
