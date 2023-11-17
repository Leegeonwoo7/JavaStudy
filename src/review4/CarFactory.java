package review4;

public class CarFactory {
	private int carNum = 10000;
	
	private CarFactory() {}
	
	private static CarFactory instance = new CarFactory();
	
	public Car createCar() {
		Car car = new Car();
		carNum++;
		car.carNum = carNum;
		return car;
	}
	
	public static CarFactory getInstance() {
		return instance;
	}
}
