package chap07;

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
