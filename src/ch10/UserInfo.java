package ch10;

public class UserInfo {
	public String name;
	public String userPassWord;
	public String userAddress;
	public String phoneNumber;
	
	public UserInfo() {	}
	
	
	public UserInfo(String name, String userAddress, String phoneNumber) {
		this.name = name;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("주소: " + userAddress);
		System.out.println("번호: " + phoneNumber);
	}
}
