package ch19;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer("이건우");
		int leePrice = customerLee.buy(1000);
		customerLee.showCustomerInfo();
		System.out.println(leePrice);
		
		VIPCustomer customerKim = new VIPCustomer("김유신");
		int kimPrice = customerKim.buy(1000);
		customerKim.showCustomerInfo();
		System.out.println(kimPrice);
		
	}
	
	
}
