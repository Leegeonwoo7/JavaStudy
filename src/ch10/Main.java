package ch10;

public class Main {

	public static void main(String[] args) {
		UserInfo lee = new UserInfo("lee", "경기도", "01012345143");
		UserInfo kim = new UserInfo();
		kim.name = "kim";
		kim.userAddress = "수원";
		kim.phoneNumber = "0104051254234";
		
		lee.showInfo();
		kim.showInfo();

	}

}
