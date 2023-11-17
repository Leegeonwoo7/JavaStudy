package ch19;

public class VIPCustomer extends Customer{
	private String agentName;
	private double salesRatio;
	
	public VIPCustomer(String name) {
		super(name);
		
		grade = "VIP";
		bonusPoint = 10000;
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	@Override
	public int buy(int price) {
		bonusPoint += price * bonusRatio;
		return price -= (int)(price * salesRatio);
	}
}
