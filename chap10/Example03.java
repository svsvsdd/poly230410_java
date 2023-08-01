package chap10;

import com.mypackage.Cat;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat01 = new Cat();
		Cat cat02 = new Cat();
		System.out.println(cat01.toString());	//해쉬값
		System.out.println(cat02.toString());
		System.out.println(cat01.equals(cat02));
		cat01 = cat02;	//cat02 해쉬값을 cat01에 넣어줌
		System.out.println(cat01.equals(cat02));	//같다
	}

}
