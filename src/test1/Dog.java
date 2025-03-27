package test1;


public class Dog extends Animal {

	private String dogKind;
	private String name;
	
	public Dog(String dogKind , String name , String species , int age , String gender) {
		super(species,age,gender);
		this.dogKind=dogKind;
		this.name=name;
	}
		public void bark() {
			System.out.println(name +"가 짖는다");
		}
		
		public void showDog( ) {
			System.out.println("강아지 이름:" + name);
			System.out.println("강아지 종류:" + dogKind);
			showAnimal();
	}
}