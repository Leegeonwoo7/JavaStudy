package array_apply_project;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하세요: ");
		int studentCount = sc.nextInt();
		
		StudentProcessor studentProcessor = new StudentProcessor(studentCount);
		studentProcessor.run();
		sc.close();
	}
}
