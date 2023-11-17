package review1;

public class Person {
	String name;
	int age;
	int height;
	int weight;
	
	public Person(String name, int age, int hieght, int weight) {
		this.name = name;
		this.age = age;
		this.height = hieght;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
		System.out.println();
	}
}
