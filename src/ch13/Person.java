package ch13;

public class Person {
	String name;
	int age;
	
	public Person(){
		this("이름없음", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person getPerosn() {
		return this;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name + "\n나이: " + age);
	}
}
