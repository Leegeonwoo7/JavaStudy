package array_apply_project;

import java.util.Scanner;

public class Student {
	private String name;
	private int score;
	Scanner sc = new Scanner(System.in);
	
	public Student() {}
	
	public String getStudentName() {
		return name;
	}
	
	private void setStudentName() {
		this.name = sc.nextLine();
	}
	
	public int getScore() {
		return score;
	}
	
	private void setScore() {
		this.score = sc.nextInt();
	}
	
	public void setInfo() {
		setStudentName();
		setScore();
	}
}
