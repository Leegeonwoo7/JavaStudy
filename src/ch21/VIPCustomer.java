package ch21;

public class VIPCustomer extends Customer{
	
	public VIPCustomer(int id, String name) {
		super(id, name);
		
		bonusRatio = 1000;
		salesRatio = 0.1;
		bonusRatio = 0.05;
		grade = "VIP";
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
}
