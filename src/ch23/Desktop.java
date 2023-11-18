package ch23;

public class Desktop extends Computer{
	@Override
	public void display() {
		System.out.println("Desktop display");
	}
	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}
	@Override
	public void turnOn() {
		System.out.println("Desktop 전원을 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("Desktop 전원을 끕니다.");
	}
	
	public void runDesktop() {
		turnOn();
		display();
		typing();
		turnOff();
	}
}
