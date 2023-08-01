package chap07;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat catObj = new Cat();	//catObj를 Cat 변수를 통해 만들어냄
		catObj.breed = "페르시안 고양이";	//.breed(변수)에 접근
		catObj.color = "흰색";	//.color 에 접근
		System.out.println("품종 : " + catObj.breed);
		System.out.println("색상 : " + catObj.color);
		System.out.println("나이 : " + catObj.age);
	}

}
