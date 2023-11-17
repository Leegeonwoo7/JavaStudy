package review3;

public class TaxiTest {

	public static void main(String[] args) {
		Person person = new Person("Edward", 20000);
		Taxi taxi = new Taxi("잘 나간다 운수");
		
		person.take(taxi);
		person.showPersonInfo();
		taxi.showInfo();

	}

}
