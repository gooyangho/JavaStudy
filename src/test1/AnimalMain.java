package test1;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog dog = new Dog("포유류", "뽀미", "포케라니안", 2, "수컷");
		
		dog.showAnimal();
		System.out.println("==========================");
		
		dog.bark();
		System.out.println("==========================");
		
		dog.showDog();

	}

}
