package homework042401;

public class Bike extends TwoWheeler {	//추상클래스 상속받음
	public void printPrice() {
		System.out.println("가격 : 150,000");
	}
	public void printType() {
		System.out.println("이것은 자전거입니다.");		
	}
	public void printBrand() {
		System.out.println("브랜드 : 삼천리");
	}
}	
