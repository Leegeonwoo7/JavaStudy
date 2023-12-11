package linkedList_apply_project;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentProcessor {
	private LinkedList<Student> studentList;
	
	public StudentProcessor() {
		studentList = new LinkedList<>();
	}
	
	public void runProcessor() {
		inputStudentInfo();
		calculateGrade();
		printInfo();
	}
	
	private void inputStudentInfo() {
		Scanner sc = new Scanner(System.in);
		String name = null;
		int score = 0;
		
		while(true) {
		System.out.println("학생 정보를 입력하세요 (종료: 'exit'): ");
		System.out.print("이름: ");
		name = sc.next();
		if(name.equalsIgnoreCase("exit")) {
			sc.close();
			break;
		}
		System.out.print("성적: ");
		score = sc.nextInt();
		
		Student student = new Student(name, score);
		addStudent(student);
		}
		
	}
	
	private void addStudent(Student student) {
		studentList.add(student);
	}
	
	private double calculateGrade() {
		int total = 0;
		double avg = 0.0;
		
		for(int i=0; i<studentList.size(); i++) {
			total += getTotalScore(studentList.get(i));
		}
		avg = (double)total / studentList.size();
		return avg;
	}
	
	private int getTotalScore(Student student) {
		int total = 0;
		total += student.getScore();
		return total;
	}
	
	private void printInfo() {
		System.out.println("평균성적은: " + calculateGrade() + "입니다.");
		System.out.println("평균 이상인 학생들: ");
		for(int i=0; i<studentList.size(); i++) {
			String studentName = studentList.get(i).getName();
			int studentScore = studentList.get(i).getScore();
			
			if(studentScore >= calculateGrade()) {
				System.out.println(studentName + " - " + studentScore);
			}
		}
	}
}
