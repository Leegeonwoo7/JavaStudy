package review5;

import java.util.ArrayList;

public class Student {
	private int studentNum;
	private String studentName;
	ArrayList<Subject> subjectList;
	
	Student(int studentNum, String studentName){
		this.studentNum = studentNum;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setSocre(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total=0;
		for(int i=0; i<subjectList.size(); i++) {
			total += subjectList.get(i).getSubjectScore();
			System.out.println("학생 " + studentName + "의 " + subjectList.get(i).getName() + " 과목 성적은 " + 
			subjectList.get(i).getSubjectScore() + "입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
	}
	
}
