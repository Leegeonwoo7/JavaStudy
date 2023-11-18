package ch24;

public class AICar extends Car{
	@Override
	public void drive() {
		System.out.println("자동으로 주행을 합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("장애물 앞에서 자동으로 정지합니다.");
	}
	
	@Override
	public void washCar() {
		System.out.println("자동으로 세차합니다.");
	}
}
