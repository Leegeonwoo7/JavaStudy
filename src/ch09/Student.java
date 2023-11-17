package ch09;

public class Student {
	int studentNum;
	String studentName;
	
	Subject korea;
	Subject math;
	
	Student(int studentNum, String studentName){
		this.studentNum = studentNum;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaScore(String name, int score) {
		korea.name = name;
		korea.score = score;
		
	}
	
	public void setMathScore(String name, int score) {
		math.name = name;
		math.score = score;
	}
	
	public void showInfo() {
		System.out.println(studentName + "학생의" + korea.name + "점수는 " + korea.score + "이고 " + math.name + "점수는 " + math.score + "입니다.");
	}
}
