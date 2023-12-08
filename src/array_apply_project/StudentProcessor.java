package array_apply_project;

import java.util.Scanner;

public class StudentProcessor {
	Student[] studentList;
	
	public StudentProcessor(int studentCount) {
		studentList = new Student[studentCount];
	}
	
	private void inputStudentInfo() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<studentList.length;i++) {
			System.out.print((i+1) + "번 학생의 이름을 입력해주세요: ");
			String name = sc.next();
			
			System.out.print((i+1) + "번 학생의 성적을 입력해주세요: ");
			int score = sc.nextInt();
			
			studentList[i] = new Student(name, score);
		}
	}
	
	private double calculateAvg() {
		int total = 0;
		double avg = 0.0;
		
		for(int i=0; i<studentList.length; i++) {
			total += studentList[i].getScore();
		}
		
		avg = (double)total / studentList.length;
		return avg;
	}
	
	private void printInfo() {
		double avg = calculateAvg();
		System.out.println("평균 성적은 " + avg + "입니다. \n");
		
		System.out.println("평균 이상인 학생들: ");
		
		for(int i=0; i<studentList.length; i++) {
			if(studentList[i].getScore() >= avg) {
				System.out.println(studentList[i].getStudentName() + " - " + studentList[i].getScore());
			}
		}
	}
	
	public void run() {
		inputStudentInfo();
		calculateAvg();
		printInfo();
	}
}
