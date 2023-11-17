package review2;

public class Order {
	int orderNum;
	String phoneNum;
	String address;
	String orderDate;
	String orderTime;
	String price;
	int menuNum;
	
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setMenuNum(int menuNum) {
		this.menuNum = menuNum;
	}
	
	public void showOrderInfo() {
		System.out.println("주문번호: " + orderNum);
		System.out.println("전화번호: " + phoneNum);
		System.out.println("주소: " + address);
		System.out.println("주문날짜: " + orderDate);
		System.out.println("주문시간: " + orderTime);
		System.out.println("주문 가격: " + price);
		System.out.println("메뉴 번호: " + menuNum);
	}
}
