package chap07;

public class AccessModifier04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 obj = new Dog2();
		
		obj.breed = "포메라니언";		//default - 패키지내에서만 
		obj.color = "갈색";			//default - 패키지내에서만 
		
		System.out.println("강아지 품종 : " + obj.breed);
		System.out.println("강아지 색상 : " + obj.color);
		obj.bowwow();		//default - 패키지내에서만 
		
	}

}
