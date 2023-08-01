package Homework0420;

public class ParentCat {
	public String breed = "샴 고양이";
	void methodParentCat() {
		System.out.println("어미 고양이");
	}
}

class Kitten extends ParentCat{
	void methodKitten() {
		System.out.println("아기 고양이");
	}
}




class Main {
public static void main(String[] args) {
		Kitten kitten = new Kitten();
		System.out.println(kitten.breed);
	}
}

/*
public class Main {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Kitten kitten = new Kitten();
	System.out.println(kitten.breed);	//선언없이 바로사용
	
}
}*/