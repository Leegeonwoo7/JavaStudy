package travel_program_by_stream;

public class TravelCustomer {
	private String name;
	private int age;
	private int price;
	
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + "\n나이: " + age + "\n비용: " + price; 
	}
}
