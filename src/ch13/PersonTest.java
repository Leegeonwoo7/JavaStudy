package ch13;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Lee", 14);
		
		p1.showInfo();
		p2.showInfo();
		
		Person p3 = new Person();
		Person p4 = p3.getPerosn();
		
		System.out.println(p3);
		System.out.println(p4);
	}

}
