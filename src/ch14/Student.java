package ch14;

public class Student {
	String name;
	int money;
	
	public Student() {
		this("이름없음", 0);
	}
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	public void showStudentInfo() {
		System.out.println(name + "학생의 남은 돈은" + money + "원 입니다.");
	}
}
