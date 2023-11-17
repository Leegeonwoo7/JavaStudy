package review2;

public class Main {

	public static void main(String[] args) {
		Order order1 = new Order();
		Order order2 = new Order();
		
		order1.setAddress("경기도");
		order1.setMenuNum(0001);
		order1.setOrderDate("20230102");
		order1.setOrderNum(1);
		order1.setOrderTime("24:00");
		order1.setPhoneNum("01044542323");
		order1.setPrice("10000");
		order1.showOrderInfo();
	}

}
