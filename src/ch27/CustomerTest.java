package ch27;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.buy();
		customerLee.sell();
		customerLee.sayHello();
		customerLee.order();
		System.out.println("=============");
		
		Buy buyer = customerLee;
		buyer.buy();
		
		
		Sell seller = customerLee;
		seller.sell();
		seller.order(); //재정의된 메서드 사용
		

	}

}
