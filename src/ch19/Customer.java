package ch19;

public class Customer {
	protected String name;
	protected String ID;
	protected String grade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer(String name) {
		this.name = name;
		bonusPoint = 1000;
		bonusRatio = 0.01;
		grade = "SILVER";
	}
	
	public int buy(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public void showCustomerInfo() {
		System.out.println(name + "고객의 등급은 " + grade + "이고 적립포인트는 " + bonusPoint + "입니다.");
	}
	
}
