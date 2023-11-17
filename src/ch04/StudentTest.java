package ch04;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1000, "Lee");
		Student studentKim = new Student();
		studentKim.studentName = "Kim";
		studentKim.studentNum = 1001;
		
		studentLee.showInfo();
		studentKim.showInfo();
	}
}
