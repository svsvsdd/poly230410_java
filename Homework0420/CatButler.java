package Homework0420;

public class CatButler {
	public void myRole(int age) {
		System.out.println("나는 고양이 집사입니다. 나이는 " + age + "입니다");

	}
	
	public void myRole(String name) {
		System.out.println(name + "은 학생입니다");

	}
	
	public void myRole(String name, int age) {
		System.out.println(name + "은 자녀 입니다. 나이는 " + age + "입니다");

	}
	
	public static void main(String[] args) {
		CatButler catButler = new CatButler();
		catButler.myRole(25);
		catButler.myRole("철수");
		catButler.myRole("영희", 10);
	}
}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("나는 고양이 집사입니다. 나이는 " + age + "입니다");
		
	}

}*/
