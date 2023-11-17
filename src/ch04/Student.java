package ch04;

public class Student {
	int studentNum;
	String studentName;
	
	public Student() {
		
	}
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public void showInfo() {
		System.out.println("학생번호는 " + studentNum + "이고 학생 이름은 " + studentName + "입니다.");
	}
}
