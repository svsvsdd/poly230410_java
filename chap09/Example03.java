package chap09;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle myBike = new Bike();
		Vehicle myCar = new Car();
		
//		Bike myBike = new Bike();
//		Car myCar = new Car();
//		myBike.printType();
//		myBike.printBrand();
		myBike.printPrice();
		System.out.println("---------");
//		myCar.printType();
//		myCar.printBrand();
		myCar.printPrice();
	}

}
