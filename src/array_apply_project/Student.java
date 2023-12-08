package array_apply_project;

import java.util.Scanner;

public class Student {
	private String name;
	private int score;
	Scanner sc = new Scanner(System.in);
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getStudentName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
}
