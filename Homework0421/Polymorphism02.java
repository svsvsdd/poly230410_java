package Homework0421;

public class Polymorphism02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal = new Animal();	//Animal
		Pig myPig = new Pig();	//Pig
		Dog myDog = new Dog();	//Dog
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}

}
