interface Animal{
	public void run();
	public void eat();

}
class Cat implements Animal{
	public void run() {
		System.out.println("Runs with 48 km/h");
	}
	public void eat() {
		System.out.println("Eats Milk and mouse");
		
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal c=new Cat();
		c.eat();
		c.run();

	}

}