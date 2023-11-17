package ch14;

public class Subway {
	int subwayNum;
	int passengerCount;
	int money;
	
	public Subway(int subwayNum) {
		this.subwayNum = subwayNum;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showSubwayInfo() {
		System.out.println(subwayNum + "번 지하철의 수입은 " + money + "이고 승객 수는 " + passengerCount + "입니다.");
	}
}
