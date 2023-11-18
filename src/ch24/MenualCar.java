package ch24;

public class MenualCar extends Car{
	@Override
	public void drive() {
		System.out.println("사람이 직접 운전합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("브레이크를 밟아 정지합니다.");
	}
}
