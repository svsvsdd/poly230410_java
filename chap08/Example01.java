package chap08;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyCat catObj = new BabyCat();	//obj
		System.out.println("품종: " + catObj.breed);
		System.out.println("색상: " + catObj.color);
		
		catObj.eat();
		catObj.meow();
	}

}
