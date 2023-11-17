package ch09;

public class Main {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		Student studentKim = new Student(101, "Kim");
		
		studentLee.setKoreaScore("korea", 95);
		studentLee.setMathScore("math", 100);
		
		studentKim.setKoreaScore("korea", 85);
		studentKim.setMathScore("math", 66);
		
		studentLee.showInfo();
		studentKim.showInfo();

	}

}
