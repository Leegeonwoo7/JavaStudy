package ch23;

public class MyNotebook extends Notebook{
	@Override
	public void display() {
		System.out.println("Notebook display");
	}
	@Override
	public void typing() {
		System.out.println("Notebook typing");
	}
	
	public void runMyNotebook() {
		turnOn();
		display();
		typing();
		turnOff();
	}
}
