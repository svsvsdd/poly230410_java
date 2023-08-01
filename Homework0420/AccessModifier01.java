package Homework0420;

public class AccessModifier01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dogObj = new Dog();	//dogObj를 Dog 변수를 통해 만들어냄
		
		dogObj.breed = "포메라니언";	//.breed(변수)에 접근
		dogObj.color = "갈색";		//.color(변수)에 접근
		
		System.out.println("강아지 품종 : " + dogObj.breed);
		System.out.println("강아지 색상 : " + dogObj.color);
		
		dogObj.bowwow();			//.bowwow(변수)에 접근
	}		

}
