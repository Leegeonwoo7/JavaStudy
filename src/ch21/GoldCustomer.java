package ch21;

public class GoldCustomer extends Customer{
	
	public GoldCustomer(int id, String name) {
		super(id, name);

		bonusRatio = 1000;
		salesRatio = 0.05;
		bonusRatio = 0.03;
		grade = "Gold";
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -= price * salesRatio;
	}
	
}
