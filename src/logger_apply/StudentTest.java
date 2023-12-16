package logger_apply;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		MyLogger myLogger = MyLogger.getLogger();
		Scanner sc = new Scanner(System.in);
		String name = null;
		System.out.println("학생이름을 입력하세요");
		name = sc.nextLine();
		
		try {
			Student student = new Student(name);
		} catch(StudentNameFormatException e) {
			myLogger.warning(e.getMessage());
		}
		
		Student student = new Student(name);
		System.out.println(student.getStudentName());
		sc.close();
	}
}
