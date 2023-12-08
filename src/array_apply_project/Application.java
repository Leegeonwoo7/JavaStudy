package array_apply_project;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Student[] studentList;
		int studentCount;
		
		Scanner sc = new Scanner(System.in);
		studentCount = sc.nextInt();
		studentList = new Student[studentCount];
		
		for(int i=0; i<studentCount; i++) {
			Student student = new Student();
			student.setInfo();
			studentList[i] = student;
		}
		int total = 0;
		double avg = 0;
		
		for(int i=0; i<studentCount; i++) {
			total += studentList[i].getScore();
		}
		avg = total / studentCount;
		
		System.out.println("평균 이상인 학생들: ");
		for(int i=0; i<studentCount; i++) {
			if(studentList[i].getScore() >= avg) {
				System.out.print(studentList[i].getStudentName() + " - " + studentList[i].getScore() );
				System.out.println();
			}
		}
	}
	
}
