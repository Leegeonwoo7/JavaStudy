package ch21;

public class Customer {
	private int id;
	protected int bonusPoint;
	protected double bonusRatio;
	protected double salesRatio;
	protected String grade;
	private String name;
	
	Customer(int id, String name){
		this.name = name;
		this.id = id;
		bonusPoint = 1000;
		bonusRatio = 0.01;
		grade = "SILVER";
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public void showCustomerInfo() {
		System.out.println("이름 : " + name);
		System.out.println("ID : " + id);
		System.out.println("적립포인트: " + bonusPoint);
		System.out.println("고객등급: " + grade);
		System.out.println();
	}
	
	public String getName() {
		return name;
	}
}
