package ch14;

public class TakeTest {

	public static void main(String[] args) {
		Student studentLee = new Student("Lee", 10000);
		Student studentKim = new Student("Kim", 12000);
		
		Subway greenSubway = new Subway(2);
		Bus bus100 = new Bus(100);
		
		studentLee.takeBus(bus100);
		studentKim.takeSubway(greenSubway);
		studentKim.takeBus(bus100);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		greenSubway.showSubwayInfo();
		bus100.showBusInfo();

	}

}
