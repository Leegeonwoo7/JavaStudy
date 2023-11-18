package ch21;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		Customer qCustomer = new Customer(1000, "Q");
		Customer wCustomer = new Customer(1001, "W");
		Customer eCustomer = new GoldCustomer(1002, "E");
		Customer rCustomer = new GoldCustomer(1003, "R");
		Customer tCustomer = new VIPCustomer(1004, "T");
		ArrayList<Customer> customerList= new ArrayList<>();
		
		customerList.add(qCustomer);
		customerList.add(wCustomer);
		customerList.add(eCustomer);
		customerList.add(rCustomer);
		customerList.add(tCustomer);
		
		for(Customer customer : customerList) {
			System.out.println(customer.getName() + "님의 지불하실 금액: " + customer.calcPrice(10000));
		}
		
		for(Customer customer : customerList) {
			customer.showCustomerInfo();
		}
		
		
		
	}

}
