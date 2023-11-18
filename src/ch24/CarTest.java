package ch24;

public class CarTest {

	public static void main(String[] args) {
		AICar aiCar = new AICar();
		MenualCar menualCar = new MenualCar();
		
		aiCar.run();
		System.out.println("==================");
		menualCar.run();

	}

}
