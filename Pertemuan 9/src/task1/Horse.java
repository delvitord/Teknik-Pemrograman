package task1;

public class Horse extends Animal{
	@Override
	public void sound() {
		System.out.println("Neigh");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Horse();	//polymorphism
		obj.sound();
	}

}
