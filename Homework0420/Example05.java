package Homework0420;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("페르시안");
		Cat cat2 = new Cat("샴");
		Cat cat3 = new Cat();
		cat3.breed = "러시안블루";
		
		System.out.println("첫 번째 고양이 품종 : " + cat1.breed);
		System.out.println("두 번째 고양이 품종 : " + cat2.breed);
		System.out.println("세 번째 고양이 품종 : " + cat3.breed);
	}	

}
