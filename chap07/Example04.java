package chap07;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat();
		cat1.breed = "페르시안";
		Cat cat2 = new Cat();
		cat2.breed = "샴";
		Cat cat3 = new Cat();
		cat3.breed = "러시안블루";
		
		System.out.println("첫 번째 고양이 품종 : " + cat1.breed);
		System.out.println("두 번째 고양이 품종 : " + cat2.breed);
		System.out.println("세 번째 고양이 품종 : " + cat3.breed);	//같은 breed지만 객체가 다르기때문에(cat 1 2 3 ) 다른 breed가 나옴
	}

}
